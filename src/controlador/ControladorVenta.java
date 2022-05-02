/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Autobus;
import modelo.Destino;
import modelo.Ticket;
import vista.VentaDeBoleto;
import vista.CambioDeBoleto;
import vista.CambioDeBoleto;



/**
 *
 * @author Daniel
 */
public class ControladorVenta implements ActionListener{
    
    private VentaDeBoleto vistaVenta;
    
    private CambioDeBoleto vistaCambio;
    
    ArrayList <Destino> Destinos = new ArrayList();

    public ArrayList<Destino> getDestinos() {
        return Destinos;
    }
    

    public ControladorVenta(VentaDeBoleto vistaVenta, CambioDeBoleto vistaCambio) {
        this.vistaVenta = vistaVenta;
        this.vistaCambio=vistaCambio;
        
          
        
        this.vistaVenta.getBotonVender().addActionListener(this);
        this.vistaVenta.getBotonCambiar().addActionListener(this);
        this.vistaCambio.getBotonHacerCambio().addActionListener(this);
        this.vistaCambio.getBotonCancelar().addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        
        if (vistaVenta.getBotonVender() == evento.getSource()){
            Destinos.get(0).getName();
        }
        
    }
    
        
     
}
