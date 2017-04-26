/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook.BO;


import pk.edu.nust.seecs.gradebook.dao.CourseDao;
import pk.edu.nust.seecs.gradebook.entity.Course;

/**
 *
 * @author MaryamBaig
 */
public class CourseBo {
    static CourseDao coursedao=new CourseDao();
    
    public void addCourse(Course c)
    {
        coursedao.addCourse(c);
    }
    
    public Course getCourse(int id)
    {
        return coursedao.getCourseById(id);
    }
}
