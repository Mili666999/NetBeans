/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socopan.controller;

import java.util.List;
import socopan.model.AOL;
import socopan.util.SocopanException;

/**
 *
 * @author Mili
 */
public class ObradaAOL extends Obrada<AOL>{

    public ObradaAOL() {
        super();
    }

    public ObradaAOL(AOL aol) {
        super(aol);
    }

    @Override
    public List<AOL> read() {
        return session.createQuery("from AOL", AOL.class).list();
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
