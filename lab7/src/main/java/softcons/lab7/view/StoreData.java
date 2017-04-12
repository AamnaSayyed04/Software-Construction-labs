/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softcons.lab7.view;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import softcons.lab7.model.UserData;
import softcons.lab7.model.UserDataDao;

/**
 *
 * @author MaryamBaig
 */
public class StoreData {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        String filename="src/main/resources/test_two-anon.csv";
        UserData User;
        UserDataDao UserDao;
        
        Reader in=new FileReader(filename);
        CSVParser parser=new CSVParser(in,CSVFormat.EXCEL.withHeader("UserId","Scheme","Time taken per input","state"));
        
        for(CSVRecord record:parser)
        {
            User=new UserData();
            User.setUserId(record.get("UserId"));
            User.setScheme(record.get("Scheme"));
            User.setTime_taken_per_input(record.get("Time taken per input"));
            User.setLogin_State(record.get("state"));
            
            UserDao=new UserDataDao();
            
            try{
                UserDao.save(User);
                
            }finally{
                UserDao.finalize();
            }
        }
        
        
    }
    
}
