/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import modelo.Autobus;
import vista.VentaDeBoleto;
import controlador.ControladorVenta;
import vista.CambioDeBoleto;
/**
 *
 * @author Daniel
 */
public class Test {
    
    public static void main(String[] args) {
    
        Autobus modelo =new Autobus();
        VentaDeBoleto vista=new VentaDeBoleto();
        CambioDeBoleto vista2=new CambioDeBoleto();
        ControladorVenta controlador=new ControladorVenta(vista,modelo, vista2);
        
        vista.setVisible(true);
    
    }
}
