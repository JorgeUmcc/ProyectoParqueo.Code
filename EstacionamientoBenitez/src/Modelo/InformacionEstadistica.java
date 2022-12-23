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
public class InformacionEstadistica implements Serializable {
    
    private String matricula;
    private String HoraEntrada;
    private String HoraSalida;
    private String NumeroPlaza;
    
    public InformacionEstadistica(){
        
    }

    public InformacionEstadistica(String matricula, String HoraEntrada, String HoraSalida, String NumeroPlaza) {
        this.matricula = matricula;
        this.HoraEntrada = HoraEntrada;
        this.HoraSalida = HoraSalida;
        this.NumeroPlaza = NumeroPlaza;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getHoraEntrada() {
        return HoraEntrada;
    }

    public void setHoraEntrada(String HoraEntrada) {
        this.HoraEntrada = HoraEntrada;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public String getNumeroPlaza() {
        return NumeroPlaza;
    }

    public void setNumeroPlaza(String NumeroPlaza) {
        this.NumeroPlaza = NumeroPlaza;
    }
    
    
     @Override
    public String toString(){
        return "{"+"matricula: "+matricula+" Hora de entrada: "+ HoraEntrada+" Hora de salida: "+HoraSalida+" # de plaza: "+NumeroPlaza+" }";
    }
    
    }
    
    
    

