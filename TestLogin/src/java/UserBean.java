/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EKA
 */

import java.io.Serializable;
//import javax.inject.Named;
import javax.faces.bean.ManagedBean;
//import javax.enterptise.context.SessionScoped;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "user") // or @Named("user") 
@SessionScoped

public class UserBean implements Serializable{
    private String name = "";
    private String password;
    
    public String getName(){
        return name;
    }
    
    public void setName(String newValue){
        name = newValue;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String newValue){
        password = newValue;
    }    
    
    public String getGreeting(){
        if(name.length() == 0)
            return "";
        else 
            return "Welcome to JSF2 + Ajax, " + name + "!";
    }
}