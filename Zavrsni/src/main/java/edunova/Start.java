/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edunova;

import edunova.controller.Obrada;
import edunova.controller.ObradaLokacija;
import edunova.model.Lokacija;
import edunova.util.HibernateUtil;
import edunova.util.PocetniInsert;
import edunova.util.SocopanException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mili
 */
public class Start {

    public static void main(String[] args) {

        //HibernateUtil.getSession();
        //new PocetniInsert();
        
        
        
        for(Lokacija l : new ObradaLokacija().read()){
            System.out.println(l.getNaziv());
        }
        
    
    }
}
