/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socopan.controller;

import java.util.List;
import socopan.model.Kategorija;
import socopan.util.SocopanException;

/**
 *
 * @author Mili
 */
public class ObradaKategorija extends Obrada<Kategorija>{

    public ObradaKategorija() {
        super();
    }
    
    public ObradaKategorija(Kategorija k){
        super(k);
    }

    @Override
    public List<Kategorija> read() {
        return session.createQuery("from Kategorija", Kategorija.class).list();
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
