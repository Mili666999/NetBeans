/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socopan.util;

import java.text.Collator;
import java.util.List;
import java.util.Locale;
import socopan.controller.Obrada;
import socopan.model.Artikal;
import socopan.util.SocopanException;

/**
 *
 * @author Mili
 */
public class FilterKategorija extends Obrada<Artikal>{

    public FilterKategorija() {
        super();
    }
    
    public FilterKategorija(Artikal a){
        super(a);
    }

    
    @Override
    public List<Artikal> read() {
        return session.createQuery("from Artikal", Artikal.class).list();
    }
    
    public List<Artikal> read(String uvjet){
        List<Artikal> lista;
        lista = session.createQuery("from Artikal a where a.kategorija.naziv = :uvjet", Artikal.class)
                .setParameter("uvjet", uvjet).list();
        
        Collator spCollator = Collator.getInstance(Locale.of("hr", "HR"));
        lista.sort((e1, e2)-> spCollator.compare(e1.getNaziv(), e2.getNaziv()));
        
        return lista;
    }

    @Override
    protected void kontrolaUnos() throws SocopanException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void kontrolaPromjena() throws SocopanException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void kontrolaBrisanje() throws SocopanException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
