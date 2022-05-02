/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Daniel
 */
public class Ticket {
    private int numCamion;
    private String horaDeSalida;
    //private String horaDeLlegada;
    private int numAsiento;

    public Ticket(int numCamion, String horaDeSalida, String horaDeLlegada, int numAsiento) {
        this.numCamion = numCamion;
        this.horaDeSalida = horaDeSalida;

        this.numAsiento = numAsiento;
    }
    
    public void imprimirTicket(){
    
    }

    public int getNumCamion() {
        return numCamion;
    }

    public void setNumCamion(int numCamion) {
        this.numCamion = numCamion;
    }

    public String getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(String horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }
    
    
    
}
