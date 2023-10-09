/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socopan.util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Mili
 */
public class HibernateUtil {
    
    private static Session session = null;
    
    private HibernateUtil(){
        
    }
    
    public static Session getSession(){
        if(session == null){
            session = new Configuration().configure().buildSessionFactory().openSession();
        }
        return session;
    }
    
}