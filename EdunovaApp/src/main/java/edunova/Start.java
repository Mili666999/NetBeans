/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edunova;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edunova.controller.Obrada;
import edunova.controller.ObradaSmjer;
import edunova.model.Smjer;
import edunova.util.EdunovaException;
import edunova.util.HibernateUtil;
import edunova.util.PocetniInsert;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

/**
 *
 * @author Mili
 */
public class Start {

    public static void main(String[] args) {
        
        //HibernateUtil.getSession();
        //new PocetniInsert();
        
        //System.out.println(new Gson().toJson(new ObradaSmjer().read()));
       String json = "[{\"naziv\":\"Java\",\"cijena\":938,\"upisnina\":69,\"trajanje\":254,\"verificiran\":true},{\"naziv\":\"Web\",\"cijena\":1104,\"upisnina\":72,\"trajanje\":122,\"verificiran\":true},{\"naziv\":\"Treći\",\"cijena\":1280,\"upisnina\":110,\"trajanje\":257,\"verificiran\":false},{\"naziv\":\"Četvrti\",\"cijena\":1214,\"upisnina\":88,\"trajanje\":159,\"verificiran\":false},{\"naziv\":\"Peti\",\"cijena\":1449,\"upisnina\":71,\"trajanje\":263,\"verificiran\":false},{\"naziv\":\"Šesti\",\"cijena\":919,\"upisnina\":89,\"trajanje\":301,\"verificiran\":true},{\"naziv\":\"Sedmi\",\"cijena\":1082,\"upisnina\":83,\"trajanje\":217,\"verificiran\":true},{\"naziv\":\"Osmi\",\"cijena\":1047,\"upisnina\":93,\"trajanje\":303,\"verificiran\":false},{\"naziv\":\"Deveti\",\"cijena\":1184,\"upisnina\":51,\"trajanje\":311,\"verificiran\":false},{\"naziv\":\"Deseti\",\"cijena\":1507,\"upisnina\":104,\"trajanje\":301,\"verificiran\":false},{\"naziv\":\"Jedanaesti\",\"cijena\":1175,\"upisnina\":52,\"trajanje\":255,\"verificiran\":false},{\"naziv\":\"Trois Pistoles\",\"cijena\":1191,\"upisnina\":108,\"trajanje\":242,\"verificiran\":false},{\"naziv\":\"Prvi preko kontrola\",\"verificiran\":false}]";
      
        List<Smjer> lista = new Gson().fromJson(json, new TypeToken<List<Smjer>>(){}.getType());
        
        ObradaSmjer os = new ObradaSmjer();
        
        for(Smjer s : lista){
            os.setEntitet(s);
            try{
                os.create();
            }catch (EdunovaException ex){
                System.out.println(ex.getPoruka());
            }
        }
    }
}
