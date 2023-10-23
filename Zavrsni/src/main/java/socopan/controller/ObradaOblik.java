/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socopan.controller;

import socopan.model.Oblik;
import socopan.util.SocopanException;
import java.util.List;

/**
 *
 * @author Mili
 */
public class ObradaOblik extends Obrada<Oblik>{
    
    public ObradaOblik(){
        super();
    }
    
    public ObradaOblik(Oblik o){
        super(o);
    }
    
    @Override
    public List<Oblik> read() {
        return session.createQuery("from Oblik", Oblik.class).list();
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
        if(entitet.getAoli().size()<0){
            throw new SocopanException("Oblik se ne može obrisati jer se upotrebljava ");
        }
    }

    private void kontrolaNaziv() throws SocopanException{
        if(entitet.getNaziv()==null){
            throw new SocopanException("Naziv oblika mora biti definiran");
        }
        if(entitet.getNaziv().isEmpty()){
            throw new SocopanException("Naziv oblika ne smije biti prazan");
        }
        
        List<Oblik> lista = session.createQuery("from Oblik o where o.naziv like :uvjet", Oblik.class)
                .setParameter("uvjet", entitet.getNaziv() + "%").list();
        
        if(lista != null && !lista.isEmpty()){
        throw new SocopanException("Taj naziv se već koristi");
        }
    }
    
}
