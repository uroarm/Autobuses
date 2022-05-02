/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author arman
 */
public class Destino {
 String name;
 ArrayList<Camion> camiones = new ArrayList();

 public Destino(String name,ArrayList Camiones){
     this.name = name;
     this.camiones = Camiones;
 }
 
    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public ArrayList<Camion> getCamiones() {
        return camiones;
    }

    public void setCamiones(ArrayList<Camion> Camiones) {
        this.camiones = Camiones;
    }
}
