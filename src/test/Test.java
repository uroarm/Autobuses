/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import controlador.ControladorTest;
import modelo.Ubicaciones;
import vista.VentaDeBoleto;
import controlador.ControladorVenta;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Destino;
import vista.CambioDeBoleto;
/**
 *
 * @author Daniel
 */
public class Test {
    
    public static void main(String[] args) throws IOException {
    
        ControladorTest test = new ControladorTest();
       ArrayList<Destino> destinos = new ArrayList(); 
       
      destinos.add(test.crearDestino("Facultad de Matematicas")); 
      destinos.add(test.crearDestino("Facultad de Medicina")); 
      destinos.add(test.crearDestino("Facultad de Derecho")); 
      
      test.setDestinos(destinos);
      test.comprarBoleto();
    
    }
}
