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
public class Vehiculo implements Serializable{
    
    private String modelo;
    private String propietario;
    private String matricula;
    private String color;
    

    public Vehiculo() {
    }

    public Vehiculo(String modelo, String propietario, String matricula, String color) {
        this.modelo = modelo;
        this.propietario = propietario;
        this.matricula = matricula;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString(){
        return "{"+"propietario: "+ propietario +" color: "+ color +" matricula: "+ matricula +" color: "+  color +" }";
    }
}
