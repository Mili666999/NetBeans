/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Lokacija;
import edunova.util.SocopanException;
import java.util.List;

/**
 *
 * @author Mili
 */
public class ObradaLokacija extends Obrada<Lokacija>{

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
    
    }

    @Override
    protected void kontrolaBrisanje() throws SocopanException {
    
    }

    private void kontrolaNaziv() throws SocopanException{
        if(entitet.getNaziv()==null){
            throw new SocopanException("Naziv lokacije mora biti definiran");
        }
        if(entitet.getNaziv().isEmpty()){
            throw new SocopanException("Naziv lokacije ne smije biti prazan");
        }
    }
    
}
