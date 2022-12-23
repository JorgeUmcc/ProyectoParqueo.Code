package Controlador;

import Vista.Login;
import Vista.fondo;
import Modelo.Usuario;
import java.util.ArrayList;


    public class Main {
        
        
        
        
    
        public static void main (String[] args){
            
            
            
            
       /*     ArrayList<Usuario> usuarios=new ArrayList<>();
            usuarios.add(new Usuario("Trabajador1", "12345678"));
            usuarios.add(new Usuario("Trabajador2","2345678"));
            usuarios.add(new Usuario("Trabajador3","345678"));
            
        try{
            GuardarArchivos.writeFileTextLogin(usuarios);
        }
        catch(Exception ex){
        }*/
            fondo ventana2 = new fondo();
            ventana2.setVisible(true);
            ventana2.setLocationRelativeTo(null);
            
            Login ventana = new Login();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);
            
            
            
            
            
           

        }
        
        
        
}
    
