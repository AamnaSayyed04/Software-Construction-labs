/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook.BO;


import pk.edu.nust.seecs.gradebook.dao.ContentDao;
import pk.edu.nust.seecs.gradebook.entity.Content;

/**
 *
 * @author MaryamBaig
 */
public class ContentBo {
     static ContentDao contentdao= new ContentDao();
      public void addContent(Content c)
    {
        contentdao.addContent(c);
    }
    
    public Content getContent(int id)
    {
        return contentdao.getContentById(id);
    }
    public void deleteContent(int id)
    {
        contentdao.deleteContent(id);
    }
    
}
