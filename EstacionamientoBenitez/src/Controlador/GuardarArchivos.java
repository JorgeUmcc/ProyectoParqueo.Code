/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Cliente;
import Modelo.Usuario;
import Modelo.Empleado;
import Modelo.InformacionEstadistica;
import Modelo.Vehiculo;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Jorgito
 */
public class GuardarArchivos {
    
    
    /**
     *
     * @throws java.io.FileNotFoundException
     */
    public static ArrayList<Cliente> readFileText() throws FileNotFoundException, IOException, ClassNotFoundException{
          File baseDatos = new File("cliente.data");
        FileInputStream entradaDatos= new FileInputStream(baseDatos);
        ObjectInputStream entradaObjetos= new ObjectInputStream(entradaDatos);
        
        ArrayList<Cliente> participantes = new ArrayList<>();
        
        int cantidadParticipantes = entradaObjetos.readInt();
        
        for(int i=0; i<cantidadParticipantes;i++){
            Cliente nuevo=(Cliente)entradaObjetos.readObject();
            participantes.add(nuevo);
        }
        
        
        
        return participantes;
        
    }
    
    public static void writeFileText(ArrayList<Cliente> participantes) throws FileNotFoundException, IOException{
        
        File baseDatos = new File("cliente.data");
        FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
        ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos);
        
        int cantidad = participantes.size();
        salidaObjetos.writeInt(cantidad);
        
        for(int i=0;i<cantidad;i++){
            salidaObjetos.writeObject(participantes.get(i));
        }
        
        salidaObjetos.flush();
        salidaObjetos.close();
    }
    
    
    
    public static ArrayList<Empleado> readFileTextEmpleados() throws FileNotFoundException, IOException, ClassNotFoundException{
          File baseDatos = new File("Empleados.data");
        FileInputStream entradaDatos= new FileInputStream(baseDatos);
        ObjectInputStream entradaObjetos= new ObjectInputStream(entradaDatos);
        
        ArrayList<Empleado> participantes = new ArrayList<>();
        
        int cantidadParticipantes = entradaObjetos.readInt();
        
        for(int i=0; i<cantidadParticipantes;i++){
            Empleado nuevo=(Empleado)entradaObjetos.readObject();
            participantes.add(nuevo);
        }
        
        
        
        return participantes;
        
    }
    
    public static void writeFileTextEmpleados(ArrayList<Empleado> participantes) throws FileNotFoundException, IOException{
        
        File baseDatos = new File("Empleados.data");
        FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
        ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos);
        
        int cantidad = participantes.size();
        salidaObjetos.writeInt(cantidad);
        
        for(int i=0;i<cantidad;i++){
            salidaObjetos.writeObject(participantes.get(i));
        }
        
        salidaObjetos.flush();
        salidaObjetos.close();
    }
    
    
    
    
    
      public static ArrayList<Usuario> readFileTextLogin() throws FileNotFoundException, IOException, ClassNotFoundException{
          File baseDatos = new File("Login.data");
        FileInputStream entradaDatos= new FileInputStream(baseDatos);
        ObjectInputStream entradaObjetos= new ObjectInputStream(entradaDatos);
        
        ArrayList<Usuario> participantes = new ArrayList<>();
        
        int cantidadParticipantes = entradaObjetos.readInt();
        
        for(int i=0; i<cantidadParticipantes;i++){
            Usuario nuevo=(Usuario)entradaObjetos.readObject();
            participantes.add(nuevo);
        }
        
        
        
        return participantes;
        
    }
    
    public static void writeFileTextLogin(ArrayList<Usuario> participantes) throws FileNotFoundException, IOException{
        
        File baseDatos = new File("Login.data");
        FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
        ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos);
        
        int cantidad = participantes.size();
        salidaObjetos.writeInt(cantidad);
        
        for(int i=0;i<cantidad;i++){
            salidaObjetos.writeObject(participantes.get(i));
        }
        
        salidaObjetos.flush();
        salidaObjetos.close();
    }
    
    
    
    
     public static ArrayList<InformacionEstadistica> readFileTextInformacionEstadistica() throws FileNotFoundException, IOException, ClassNotFoundException{
          File baseDatos = new File("InformacionEstadistica.data");
        FileInputStream entradaDatos= new FileInputStream(baseDatos);
        ObjectInputStream entradaObjetos= new ObjectInputStream(entradaDatos);
        
        ArrayList<InformacionEstadistica> participantes = new ArrayList<>();
        
        int cantidadParticipantes = entradaObjetos.readInt();
        
        for(int i=0; i<cantidadParticipantes;i++){
            InformacionEstadistica nuevo=(InformacionEstadistica)entradaObjetos.readObject();
            participantes.add(nuevo);
        }
        
        
        
        return participantes;
        
    }
    
    public static void writeFileTextInformacionEstadistica(ArrayList<InformacionEstadistica> participantes) throws FileNotFoundException, IOException{
        
        File baseDatos = new File("InformacionEstadistica.data");
        FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
        ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos);
        
        int cantidad = participantes.size();
        salidaObjetos.writeInt(cantidad);
        
        for(int i=0;i<cantidad;i++){
            salidaObjetos.writeObject(participantes.get(i));
        }
        
        salidaObjetos.flush();
        salidaObjetos.close();
    }
    
    
      public static ArrayList<Vehiculo> readFileTextVehiculo() throws FileNotFoundException, IOException, ClassNotFoundException{
          File baseDatos = new File("vehiculo.data");
        FileInputStream entradaDatos= new FileInputStream(baseDatos);
        ObjectInputStream entradaObjetos= new ObjectInputStream(entradaDatos);
        
        ArrayList<Vehiculo> participantes = new ArrayList<>();
        
        int cantidadParticipantes = entradaObjetos.readInt();
        
        for(int i=0; i<cantidadParticipantes;i++){
            Vehiculo nuevo=(Vehiculo)entradaObjetos.readObject();
            participantes.add(nuevo);
        }
        
        
        
        return participantes;
        
    }
    
    public static void writeFileTextVehiculo(ArrayList<Vehiculo> participantes) throws FileNotFoundException, IOException{
        
        File baseDatos = new File("vehiculo.data");
        FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
        ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos);
        
        int cantidad = participantes.size();
        salidaObjetos.writeInt(cantidad);
        
        for(int i=0;i<cantidad;i++){
            salidaObjetos.writeObject(participantes.get(i));
        }
        
        salidaObjetos.flush();
        salidaObjetos.close();
    }
    
    
    
}
    
    

 