/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softcons.storedata.view;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import softcons.storedata.model.Employee;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;  
import org.hibernate.service.ServiceRegistry;


/**
 *
 * @author MaryamBaig
 */
public class StoreData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic 
        
        
                Reader in = new FileReader("GeoLiteCity-Location.csv");
                System.out.print(in);
                Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
                //for (CSVRecord record : records) {
                //String lastName = record.get("Last Name");
                //String firstName = record.get("First Name");
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		//creating session object  
		Session session=factory.openSession();  
			//creating transaction object  
			Transaction t=session.beginTransaction();  
			Employee e1=new Employee();  
			e1.setId(115);  
			e1.setFirstName("Fahad");  
			e1.setLastName("Satti");  
			session.persist(e1);//persisting the object  
			t.commit();//transaction is commited  
		session.close();  
	}  
        
        
    }
    