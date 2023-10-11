/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socopan.controller;

import socopan.model.Lokacija;
import socopan.util.SocopanException;
import java.util.List;

/**
 *
 * @author Mili
 */
public class ObradaLokacija extends Obrada<Lokacija>{
    
    public ObradaLokacija(){
        super();
    }
    
    public ObradaLokacija(Lokacija l){
        super(l);
    }

    @Override
    public List<Lokacija> read() {
        //HQL
        return session.createQuery("from Lokacija", Lokacija.class).list();
    }

    @Override
    protected void kontrolaUnos() throws SocopanException {
        kontrolaNaziv();
    }

    @Override
    protected void kontrolaPromjena() throws SocopanException {
        kontrolaNaziv();
    }

    @Override
    protected void kontrolaBrisanje() throws SocopanException {
        if(entitet.getAoli().size()>0){
            throw new SocopanException("Lokacija se ne može obrisati jer se upotrebljava");
        }
    }

    private void kontrolaNaziv() throws SocopanException{
        if(entitet.getNaziv()==null){
            throw new SocopanException("Naziv lokacije mora biti definiran");
        }
        if(entitet.getNaziv().isEmpty()){
            throw new SocopanException("Naziv lokacije ne smije biti prazan");
        }
        
        List<Lokacija> lista = session.createQuery("from Lokacija l where l.naziv like :uvjet", Lokacija.class)
                .setParameter("uvjet", entitet.getNaziv() + "%").list();
        
        if(lista != null && !lista.isEmpty()){
            throw new SocopanException("Taj naziv se već koristi");
        }
    }
    
}
