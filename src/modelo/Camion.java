/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author arman
 */
public class Camion {
    String horaSalida;
    
  //  int asientos[] = new int[15];
    int asientosOcupados = 0;
    
   public Camion(String horaSalida){
        this.horaSalida = horaSalida;
       // this.asientos = asientos;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

//    public int[] getAsientos() {
//        
//       
//        
//        return asientos;
//    }
//
//    public void setAsientos(int[] Asientos) {
//        this.asientos = Asientos;
//    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public void setAsientosOcupados(int asientosOcupados) {
        this.asientosOcupados = asientosOcupados;
    }
    
   
}
