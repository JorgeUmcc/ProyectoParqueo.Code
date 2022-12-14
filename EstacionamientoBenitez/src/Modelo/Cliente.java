/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Jorgito
 */
public class Cliente {
    
    private String name;
    private String ci;
    private String telefono;
    private String direccion;
    
    public Cliente(){
        }
    
    public Cliente(String name,String ci, String telefono, String direccion) {
            
    this.name=name;
    this.ci=ci;
    this.direccion=direccion;
    this.telefono=telefono;
    
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
}
