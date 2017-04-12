/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softcons.lab7.model;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import softcons.lab7.view.HibernateUtil;

/**
 *
 * @author MaryamBaig
 */
public class UserDataDao {
    
    public Session currSession=null;
    
    public UserDataDao()
    {
        HibernateUtil.createSessionFactory();
        
        currSession=HibernateUtil.getSessionFactory().openSession();
        
    }
   
    public void finalize()
    {
        currSession.close();
    }
    
    public void save(UserData User)
    {
        Transaction t=currSession.beginTransaction();
        currSession.persist(User);
        t.commit();
    }
    
   /* public void printCity()
    {
        @SuppressWarnings("JPQLValidation")
        Query q=currSession.createQuery("from City");
        List<UserData> l=q.getResultList();
        for(int i=0;i<l.size();i++){
        System.out.println(l.get(i).getCity()+" "+l.get(i).getLatitude()+" "+l.get(i).getLongitude());
    }
  */
}

