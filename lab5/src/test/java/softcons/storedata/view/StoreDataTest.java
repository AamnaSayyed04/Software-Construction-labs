/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softcons.storedata.view;

import org.hibernate.Session;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MaryamBaig
 */
public class StoreDataTest {
    
    public StoreDataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class StoreData.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        StoreData.main(args);
      
    }

    /**
     * Test of getCityLocation method, of class StoreData.
     */
    @Test
    public void testGetCityLocation() {
        System.out.println("getCityLocation");
        String c = "rawalpindi";
        Session sess = null;
        String expResult = "City: rawalpindi Latitude: 33.6007 Longitude: 73.0679";
        String result = StoreData.getCityLocation(c, sess);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getNearestLocation method, of class StoreData.
     */

    
}
