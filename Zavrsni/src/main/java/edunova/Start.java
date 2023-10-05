/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edunova;

import edunova.controller.Obrada;
import edunova.controller.ObradaLokacija;
import edunova.controller.ObradaOblik;
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
        
        List<Oblik> oblici = new ObradaOblik().read();
        
        Oblik zadnjiOblik = oblici.get(oblici.size()-1);
        
        ObradaOblik oo = new ObradaOblik(zadnjiOblik);
        
        try {
            oo.delete();
        } catch (SocopanException e) {
            e.printStackTrace();
        }
        
    
    }
}
