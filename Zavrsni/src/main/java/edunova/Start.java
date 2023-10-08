/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edunova;

import edunova.controller.Obrada;
import edunova.controller.ObradaArtikal;
import edunova.controller.ObradaLokacija;
import edunova.controller.ObradaOblik;
import edunova.model.Artikal;
import edunova.model.Lokacija;
import edunova.model.Oblik;
import edunova.util.HibernateUtil;
import edunova.util.PocetniInsert;
import edunova.util.SocopanException;
import java.util.List;
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
        
        List<Artikal> artikli = new ObradaArtikal().read();
        
        Artikal zadnjiArtikal = artikli.get(artikli.size()-1);
        
        ObradaArtikal oa = new ObradaArtikal(zadnjiArtikal);
        
        try {
            oa.delete();
        } catch (SocopanException e) {
            e.printStackTrace();
        }
        
    
    }
}
