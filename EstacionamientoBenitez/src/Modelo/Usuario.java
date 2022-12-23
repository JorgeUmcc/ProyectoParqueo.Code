/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.Serializable;


/**
 *
 * @author Jorgito
 */
public class Usuario implements Serializable{
    
    private String name;
   
    private String password;

    public Usuario() {
    }

    public Usuario(String name, String password) {
        this.name = name;
        
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
     @Override
    public String toString(){
        return "{"+"nombre: "+name+"contraseña: "+password+" }";
    }
}
