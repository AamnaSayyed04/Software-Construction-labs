/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softcons.lab6.view;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author MaryamBaig
 */
public class HibernateUtil {
    
        private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;
    
    public static void createSessionFactory()
    {
        Configuration configuration=new Configuration();
        configuration.configure();
        
        serviceRegistry= new StandardServiceRegistryBuilder().applySettings(
        configuration.getProperties()).build();
        
        sessionFactory=configuration.buildSessionFactory(serviceRegistry);
    }
    
    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
    
}
