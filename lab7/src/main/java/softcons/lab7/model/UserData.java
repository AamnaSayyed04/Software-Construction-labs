/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softcons.lab7.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author MaryamBaig
 */

@Entity
public class UserData implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String UserId;
    private String Scheme;
    private String Time_taken_per_input;
    private String Login_State;

public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getScheme() {
        return Scheme;
    }

    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    public String getTime_taken_per_input() {
        return Time_taken_per_input;
    }

    public void setTime_taken_per_input(String Time_taken_per_input) {
        this.Time_taken_per_input = Time_taken_per_input;
    }

    public String getLogin_State() {
        return Login_State;
    }

    public void setLogin_State(String Login_State) {
        this.Login_State = Login_State;
    }   
}
