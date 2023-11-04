/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socopan.controller;

import java.math.BigDecimal;
import java.text.Collator;
import socopan.model.Artikal;
import socopan.util.SocopanException;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author Mili
 */
public class ObradaArtikal extends Obrada<Artikal>{
    
    public ObradaArtikal(){
        super();
    }
    
    public ObradaArtikal(Artikal a){
        super(a);
    }
    
    @Override
    public List<Artikal> read() {
        return session.createQuery("from Artikal", Artikal.class).list();
    }
    
    public List<Artikal> read(String uvjet){
        uvjet = uvjet==null ? "" : uvjet;
        uvjet = uvjet.trim();
        uvjet = "%" + uvjet + "%";
        
        List<Artikal> lista;
        lista = session.createQuery("from Artikal a where a.naziv like :uvjet", Artikal.class)
                .setParameter("uvjet", uvjet).list();
        
        Collator spCollator = Collator.getInstance(Locale.of("hr", "HR"));
        lista.sort((e1, e2)-> spCollator.compare(e1.getNaziv(), e2.getNaziv()));
        
        return lista;
    }

    @Override
    protected void kontrolaUnos() throws SocopanException {
        kontrolaNaziv();
        kontrolaKolicina();
    }

    @Override
    protected void kontrolaPromjena() throws SocopanException {
        kontrolaUnos();
    }

    @Override
    protected void kontrolaBrisanje() throws SocopanException {
        if(entitet.getKolicinaUkupna().intValue()!=0){
            throw new SocopanException("Artikal se ne može obrisati jer ukupna količina nije 0(nula)");
        }
    }

    private void kontrolaNaziv() throws SocopanException{
        if(entitet.getNaziv()==null){
            throw new SocopanException("Naziv artikla mora biti definiran");
        }
        if(entitet.getNaziv().isEmpty()){
            throw new SocopanException("Naziv artikla ne smije biti prazan");
        }
        
        if(entitet.getKategorija()==null){
            throw new SocopanException("Kategorija artikla mora biti definirana");
        }
        if(entitet.getKategorija().toString().isEmpty()){
            throw new SocopanException("Kategorija artikla mora biti definirana");
        }
    }
    
    private void kontrolaKolicina() throws SocopanException{
        var k = entitet.getKolicinaUkupna();
        if(k==null){
            return;
        }
        if(k.compareTo(BigDecimal.ZERO)<0){
            throw new SocopanException("Količina ne smije biti manja od 0 (nula)");
        }
    }
    
}
