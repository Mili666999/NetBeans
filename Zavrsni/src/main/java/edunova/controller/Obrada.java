/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Entitet;
import edunova.util.HibernateUtil;
import edunova.util.SocopanException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Mili
 */
public abstract class Obrada<T extends Entitet>{
    
    protected T entitet;
    protected Session session;
    public abstract List<T> read();
    protected abstract void kontrolaUnos() throws SocopanException;
    protected abstract void kontrolaPromjena() throws SocopanException;
    protected abstract void kontrolaBrisanje() throws SocopanException;
    
    public Obrada(){
        session = HibernateUtil.getSession();
    }
    
    public Obrada(T entitet){
        this();
        this.entitet = entitet;
    }
    
    public void create() throws SocopanException{
        kontrolaNull();
        entitet.setId(null);
        kontrolaUnos();
        persist();
    }
    
    public void update() throws SocopanException{
        kontrolaNull();
        kontrolaPromjena();
        persist();
    }
    
    public void delete() throws SocopanException{
        kontrolaNull();
        kontrolaBrisanje();
        session.beginTransaction();
        session.remove(entitet);
        session.getTransaction().commit();
    }
    
    private void persist(){
        session.beginTransaction();
        session.persist(entitet);
        session.getTransaction().commit();
    }
    
    private void kontrolaNull() throws SocopanException{
        if(entitet==null){
            throw new SocopanException("Entitet je null");
        }    
    }
    
   
    
    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
    
    
    
}
