/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook.BO;

import pk.edu.nust.seecs.gradebook.dao.GradeDao;
import pk.edu.nust.seecs.gradebook.entity.Grade;

/**
 *
 * @author MaryamBaig
 */
public class GradeBo {
 
      static GradeDao gradedao=new GradeDao();
     public void addGrade(Grade g)
    {
        gradedao.addGrade(g);
    }
    
    public Grade getGrade(int id)
    {
        return gradedao.getGradeById(id);
    }
    
}
