/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Smjer;
import edunova.util.EdunovaException;
import java.util.List;

/**
 *
 * @author Mili
 */
public class ObradaSmjer extends Obrada<Smjer>{

    @Override
    public List<Smjer> read() {
        //HQL - Hibernate Querry Language
        return session.createQuery("from Smjer", Smjer.class).list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        kontrolaNaziv();
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
    
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
    
    }

    private void kontrolaNaziv() throws EdunovaException{
        if(entitet.getNaziv()==null){
            throw new EdunovaException("Naziv smjera mora biti definiran!");
        }
        if(entitet.getNaziv().isEmpty()){
            throw new EdunovaException("Naziv smjera ne smije biti prazan!");
        }
    }
    
}
