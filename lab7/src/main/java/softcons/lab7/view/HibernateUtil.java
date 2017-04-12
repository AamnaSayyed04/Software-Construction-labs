/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softcons.lab7.view;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author MaryamBaig
 */
public class HibernateUtil {
    
        private static SessionFactory sessionFactory;
    
    public static void createSessionFactory()
    {
        
        sessionFactory = new Configuration().configure().buildSessionFactory();

    }
    
    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
    
}
