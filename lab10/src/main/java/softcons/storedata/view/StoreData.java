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

import softcons.storedata.model.City;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.lightcouch.CouchDbClient;
import org.lightcouch.Response;
import softcons.storedata.model.CityDAO;

/**
 *
 * @author MaryamBaig
 */
public class StoreData {
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic 
            String filename="src/main/resources/GeoLiteCity-Location.csv";
            City city;
            CityDAO cityDao;
            
            
    
            Reader in=new FileReader(filename);     //read file
            CSVParser parser=new CSVParser(in,CSVFormat.EXCEL.withHeader());   //create parser
         
                 /*for (CSVRecord record : parser) {
                    //parse file and create objects
                    city=new City();
                    city.setLocId(Integer.parseInt(record.get("locId")));
                    city.setCountry(record.get("country"));
                    city.setCity(record.get("city"));
                    city.setRegion(record.get("region"));
                    city.setLatitude(Float.parseFloat(record.get("latitude")));
                    city.setLongitude(Float.parseFloat(record.get("longitude")));
                    */
                    cityDao=new CityDAO();
                    
                    try{
                        cityDao.printCity();
                    }finally{
                        cityDao.finalize();
                    }
              
                } 

                
       
  
        }
        
    }