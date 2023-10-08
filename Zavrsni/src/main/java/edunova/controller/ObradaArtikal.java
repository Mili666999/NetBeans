/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Artikal;
import edunova.util.SocopanException;
import java.util.List;

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

    @Override
    protected void kontrolaUnos() throws SocopanException {
        kontrolaNaziv();
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
    
}
