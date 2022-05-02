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
    int asiento[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    
   
    public ArrayList<Destino> getDestinos() {
        return Destinos;
    }
    
   
   public Camion CrearCamiones(String hora){       
      Camion camion = new Camion(hora, asiento);
      return camion;
   }
    
    public Destino crearDestino(String name){
        
        ArrayList <Camion> camiones = new ArrayList();
        
        camiones.add(CrearCamiones("6:00"));
        camiones.add(CrearCamiones("7:00"));
        camiones.add(CrearCamiones("8:00"));
        camiones.add(CrearCamiones("9:00"));
        camiones.add(CrearCamiones("10:00"));
        camiones.add(CrearCamiones("11:00"));
        camiones.add(CrearCamiones("12:00"));
        
        Destino destino = new Destino(name, camiones);
        return destino;
    }

    public void setDestinos(ArrayList<Destino> Destinos) {
        this.Destinos = Destinos;
    }
    
    
    public void comprarBoleto() throws IOException{
        System.out.println("Selecciona tu Destino");
       int destinoSeleccionado = 0;
       int horaSeleccionado = 0;
       
        for(int i=0;i<Destinos.size();i++){
            System.out.println(i + ": " + Destinos.get(i).getName());
        }
            Scanner sc = new Scanner(System.in);
             destinoSeleccionado = sc.nextInt();
            System.out.println("Elegiste = " + destinoSeleccionado);
        //elegir Camion con horario
        System.out.println("Selecciona tu horario");
        for(int i=0;i<Destinos.get(destinoSeleccionado).getCamiones().size();i++){
            System.out.println(i + ": " + Destinos.get(destinoSeleccionado).getCamiones().get(i).getHoraSalida());
        }
        horaSeleccionado = sc.nextInt();
        System.out.println("Elegiste la hora = " + Destinos.get(destinoSeleccionado).getCamiones().get(horaSeleccionado).getHoraSalida());
        
       int ocupados = Destinos.get(destinoSeleccionado).getCamiones().get(horaSeleccionado).getAsientosOcupados();
       int asientotemp[] = asiento;
       asientotemp[ocupados] = 1; 
         ocupados++;       
        System.out.println("Se ha comprado un asiento");
        System.out.println("Destino: " +  Destinos.get(destinoSeleccionado).getName());
        System.out.println("horario: " + Destinos.get(destinoSeleccionado).getCamiones().get(horaSeleccionado).getHoraSalida());
        System.out.println("Asiento numero: " + (ocupados-1));
       Destinos.get(destinoSeleccionado).getCamiones().get(horaSeleccionado).getAsientos();  
       Destinos.get(destinoSeleccionado).getCamiones().get(horaSeleccionado).setAsientosOcupados(ocupados);
        
        
        System.out.println("Asientos ocupados: " +  Destinos.get(destinoSeleccionado).getCamiones().get(horaSeleccionado).getAsientosOcupados());
    }
    
    
}
