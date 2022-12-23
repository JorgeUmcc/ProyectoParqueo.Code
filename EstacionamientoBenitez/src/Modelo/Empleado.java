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
public class Empleado implements Serializable{
    
    private String nombre;
    private String cargo;
    private String horario;
    private String sueldo;
    
    public Empleado(){
         }
    
    public Empleado(String nombre,String cargo,String horario, String sueldo){
    
        this.nombre=nombre;
        this.cargo=cargo;
        this.horario=horario;
        this.sueldo=sueldo;
        
}    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        return "{"+"nombre: "+nombre+" cargo: "+cargo+" horario: "+horario+" sueldo: "+sueldo+" }";
    }
}
