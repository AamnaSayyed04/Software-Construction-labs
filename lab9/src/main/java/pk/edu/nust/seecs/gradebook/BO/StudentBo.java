/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook.BO;

import pk.edu.nust.seecs.gradebook.dao.StudentDao;
import pk.edu.nust.seecs.gradebook.entity.Student;

/**
 *
 * @author MaryamBaig
 */
public class StudentBo {
    static StudentDao studentdao=new StudentDao();
    
     public void addStudent(Student s)
    {
        studentdao.addStudent(s);
    }
    
    public Student getStudent(int id)
    {
        return studentdao.getStudentById(id);
    }
    
}
