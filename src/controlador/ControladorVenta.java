/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Ubicaciones;
import modelo.Ticket;
import vista.VentaDeBoleto;
import vista.CambioDeBoleto;
import vista.CambioDeBoleto;



/**
 *
 * @author Daniel
 */
public class ControladorVenta implements ActionListener{
    
    private VentaDeBoleto vista;
    private Ubicaciones autobus;
    private CambioDeBoleto vista2;
    
    

    public ControladorVenta(VentaDeBoleto vista, Ubicaciones autobus, CambioDeBoleto vista2) {
       
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
