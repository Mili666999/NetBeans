/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

import com.github.javafaker.Faker;
import edunova.model.AOL;
import edunova.model.Artikal;
import edunova.model.Kategorija;
import edunova.model.Lokacija;
import edunova.model.Oblik;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Mili
 */
public class PocetniInsert {
    
    private static final int BROJ_LOKACIJA=8;
    private static final int BROJ_OBLIKA=10;
    private static final int BROJ_KATEGORIJA=6;
    private static final int BROJ_AOLA=100;
    private static final int BROJ_ARTIKALA=300;
    

    private Faker faker;
    private Session session;
    private List<Lokacija> lokacije;
    private List<Oblik> oblici;
    private List<Kategorija> kategorije;
    private List<AOL> aoli;
    private List<Artikal> artikli;
    
    public PocetniInsert() {
        faker = new Faker();
        session = HibernateUtil.getSession();
        lokacije = new ArrayList<>();
        oblici = new ArrayList<>();
        kategorije = new ArrayList<>();
        aoli = new ArrayList<>();
        artikli = new ArrayList<>();
        session.getTransaction().begin();
        kreirajLokacije();
        kreirajOblike();
        kreirajKategorije();
        kreirajAole();
        kreirajArtikle();
        
        session.getTransaction().commit();
    }

    private void kreirajLokacije() {
        Lokacija l;
        for(int i=0;i<BROJ_LOKACIJA;i++){
            l = new Lokacija();
            l.setNaziv(faker.dune().planet());
            session.persist(l);
            lokacije.add(l);
        }
    }

    private void kreirajOblike() {
        Oblik o;
        for(int i=0;i<BROJ_OBLIKA;i++){
            o = new Oblik();
            o.setNaziv(faker.dune().title());
            session.persist(o);
            oblici.add(o);
        }
    }

    private void kreirajKategorije() {
        Kategorija k;
        for(int i=0;i<BROJ_KATEGORIJA;i++){
            k = new Kategorija();
            k.setNaziv(faker.dune().character());
            session.persist(k);
            kategorije.add(k);
        }
    }
    
    private void kreirajAole() {
        AOL a;
        List<Lokacija> lok;
        List<Oblik> obl;
        for(int i=0;i<BROJ_AOLA;i++){
            a = new AOL();
            a.setKolicinaNaLokaciji(new BigDecimal(faker.number().numberBetween(1, 1000)));
           
            lok = new ArrayList<>();
            lok.add(lokacije.get(faker.number().numberBetween(0, BROJ_LOKACIJA-1)));
            a.setLokacije((Lokacija) lok);
            
            obl = new ArrayList<>();
            obl.add(oblici.get(faker.number().numberBetween(0, BROJ_OBLIKA)));
            a.setOblici((Oblik) obl);
            session.persist(a);
            aoli.add(a);
        }
    }

    private void kreirajArtikle() {
        Artikal a;
        List<Kategorija> kat;
        List<AOL> aol;
        for(int i=0;i<BROJ_ARTIKALA;i++){
            a = new Artikal();
            a.setNaziv(faker.medical().medicineName());
            a.setKolicinaUkupna(new BigDecimal(faker.number().numberBetween(1, 1000)));
            a.setKategorije((List<Kategorija>) kategorije.get(faker.number().numberBetween(0, BROJ_KATEGORIJA-1)));
            a.setAol((List<AOL>) aoli.get(faker.number().numberBetween(0, BROJ_AOLA-1)));
            session.persist(a);
            artikli.add(a);
        }
        
    }

    
    
}
