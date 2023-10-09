/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package socopan;

import socopan.controller.Obrada;
import socopan.controller.ObradaArtikal;
import socopan.controller.ObradaLokacija;
import socopan.controller.ObradaOblik;
import socopan.model.Artikal;
import socopan.model.Lokacija;
import socopan.model.Oblik;
import socopan.util.HibernateUtil;
import socopan.util.PocetniInsert;
import socopan.util.SocopanException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import socopan.view.GlavniProzor;
import socopan.view.SplashScreen;

/**
 *
 * @author Mili
 */
public class Start {

    public static void main(String[] args) {

        //HibernateUtil.getSession();
        //new PocetniInsert();
        //new GlavniProzor().setVisible(true);
        new SplashScreen().setVisible(true);
    
    }
}
