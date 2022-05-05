/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import modelo.Camion;
import modelo.Destino;

/**
 *
 * @author arman
 */
public class ControladorTest {
    
    ArrayList<Destino> Destinos = new ArrayList();
   public Camion CrearCamiones(String hora){       
      Camion camion = new Camion(hora);
      return camion;
   }
    
    public Destino crearDestino(String name){
        
        ArrayList <Camion> camiones = new ArrayList();
        
        camiones.add(CrearCamiones("10:00"));
        camiones.add(CrearCamiones("11:00"));
        camiones.add(CrearCamiones("12:00"));
        camiones.add(CrearCamiones("13:00"));
        camiones.add(CrearCamiones("14:00"));
        camiones.add(CrearCamiones("15:00"));
        camiones.add(CrearCamiones("16:00"));
        camiones.add(CrearCamiones("17:00"));
        camiones.add(CrearCamiones("18:00"));
        camiones.add(CrearCamiones("19:00"));
        camiones.add(CrearCamiones("20:00"));
        
        Destino destino = new Destino(name, camiones);
        return destino;
    }

    
    
  
    
    
}
