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
public class Cliente implements Serializable{
    
    private String nombre;
    private String ci;
    private String telefono;
    private String direccion;
    
    public Cliente(){
        this.nombre = "Jorge";
        this.ci = "02020560345";
        this.telefono = "55215843";
        this.direccion = "Cardenas";
        }
    
    public Cliente(String name,String ci, String telefono, String direccion) {
            
    this.nombre=name;
    this.ci=ci;
    this.telefono=telefono;
    this.direccion=direccion;
    }
    
    
    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public String toString(){
        return "{"+"nombre: "+nombre+" ci: "+ci+" Telefono: "+telefono+" direccion: "+direccion+" }";
    }
}
