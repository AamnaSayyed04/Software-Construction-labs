/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softcons.storedata.model;

import java.io.InputStream;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.lightcouch.CouchDbClient;
import org.lightcouch.Response;

/**
 *
 * @author MaryamBaig
 */
public class CityDAO {
    
   CouchDbClient dbClient;
    
    public CityDAO()
    {
        dbClient=new CouchDbClient("couchdb.properties");
           
    }
    
    public void finalize()
    {
       
    }
    
    public void save(City c)
    {
        Response response;
        response=dbClient.save(c);
    }
    
   public void printCity()
    {
        
        InputStream in=dbClient.find("0000620737b0493685de1e8e1b18ac8b");
    }
  
}

