/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softcons.storedata.view;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Scanner;

import softcons.storedata.model.City;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;  
import org.hibernate.service.ServiceRegistry;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.hibernate.Query;


/**
 *
 * @author MaryamBaig
 */
public class StoreData {
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic 
            String filename="src/main/resources/GeoLiteCity-Location.csv";
            City city;
            //List Cities=new ArrayList();
     
            Reader in=new FileReader(filename);     //read file
            CSVParser parser=new CSVParser(in,CSVFormat.EXCEL.withHeader());   //create parser
        
        
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
        //creating transaction object
        try ( //creating session object
                Session session = factory.openSession()) {
        /* for (Iterator<CSVRecord> it = parser.iterator(); it.hasNext();) {    //parse file and create objects
             CSVRecord record=(CSVRecord)it.next();
             Transaction t=session.beginTransaction();
             city=new City();
             city.setName(record.get("city"));
             city.setLatitude(Float.parseFloat(record.get("latitude")));
             city.setLongitude(Float.parseFloat(record.get("longitude")));
             session.persist(city);
             t.commit();
            
            } */
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a City name to get Lat, Long: ");
        String input=s.next();
        Query q1=session.createSQLQuery("SELECT * FROM city WHERE name='"+input+"'").addEntity(City.class);
        List<City> l =q1.getResultList();
        
        
        System.out.println("City: "+input+" Latitude: "+l.get(0).getLatitude()+" Longitude: "+l.get(0).getLongitude());
        
        
         System.out.print("Enter Latitude: ");
         float lat=Float.parseFloat(s.next());
         System.out.print("Enter Longitude: ");
         float lon=Float.parseFloat(s.next());
       
         Query query=session.createSQLQuery("SELECT id,name, latitude, longitude, 111.045* DEGREES(ACOS(COS(RADIANS(latpoint)) * COS(RADIANS(latitude)) * COS(RADIANS(longpoint) - RADIANS(longitude)) + SIN(RADIANS(latpoint)) * SIN(RADIANS(latitude)))) AS distance_in_km FROM city JOIN  (SELECT "+lat+" AS latpoint,"+lon+" AS longpoint ) AS p ON 1=1 ORDER BY distance_in_km LIMIT 6")
                 .addEntity(City.class);
         
         List<City>result=query.getResultList();
         for(int i=1;i<result.size();i++){
         System.out.println(result.get(i).getName()+" "+result.get(i).getLatitude()+" "+result.get(i).getLongitude());
         }
  
        }
    } 
    
    

}
    