/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook.BO;

import pk.edu.nust.seecs.gradebook.dao.TeacherDao;
import pk.edu.nust.seecs.gradebook.entity.Teacher;

/**
 *
 * @author MaryamBaig
 */
public class TeacherBo {
    
    static TeacherDao teacherdao=new TeacherDao();
      public void addTeacher(Teacher t)
    {
        teacherdao.addTeacher(t);
    }
    public Teacher getTeacher(int id)
    {
        return teacherdao.getTeacherById(id);
    }
}
