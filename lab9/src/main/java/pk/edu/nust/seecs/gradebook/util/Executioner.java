package pk.edu.nust.seecs.gradebook.util;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
import pk.edu.nust.seecs.gradebook.BO.CloBo;
import pk.edu.nust.seecs.gradebook.BO.ContentBo;
import pk.edu.nust.seecs.gradebook.entity.Clo;
import pk.edu.nust.seecs.gradebook.entity.Content;
import pk.edu.nust.seecs.gradebook.entity.Student;



/**
 * My main Application. 
 * <p>
 This executes everything.
 */

public class Executioner {

    public static void main(String[] args) {
        
        CloBo clobo=new CloBo();
        ContentBo conbo=new ContentBo();
        Clo c;
        Content con;
        HibernateUtil h=new HibernateUtil();
        Session session=h.getSessionFactory().openSession();
        
        Criteria c;
        c=session.createCriteria(Student.class);
        List results=c.list();
    
        Resource r=new ClassPathResource("ApplicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(r);
        
        c=(Clo)factory.getBean("clo");
        con=(Content)factory.getBean("content");
        
        
        System.out.println(c);
        System.out.println(con);
        
        clobo.addClo(c);
        conbo.addContent(con);
     
        
    }

}

  /*for (Clo iter : clodao.getAllClos()) {
            System.out.println(iter);
        }*/