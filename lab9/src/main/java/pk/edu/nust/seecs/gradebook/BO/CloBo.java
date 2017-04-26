/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook.BO;

import java.util.List;
import pk.edu.nust.seecs.gradebook.dao.CloDao;
import pk.edu.nust.seecs.gradebook.entity.Clo;

/**
 *
 * @author MaryamBaig
 */
public class CloBo {
    
      static CloDao clodao = new CloDao();
   
    public void addClo(Clo c)
    {
        
        clodao.addClo(c);
    }
    public Clo getClobyId(int id)
    {
        return clodao.getCloById(id);
       
    }
    public void deleteClo(int cloid)
    {
        clodao.deleteClo(cloid);
    }
    public void updateClo(Clo c)
    {
        clodao.updateClo(c);
    }
    
    public static List<Clo> getAllClos() {
        return clodao.getAllClos();
    }
}
