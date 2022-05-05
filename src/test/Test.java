/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import controlador.ControladorTest;
import vista.VentaDeBoleto;
import controlador.ControladorVenta;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Camion;
import modelo.Csvreader;
import modelo.Csvwriter;
import modelo.Destino;
import vista.BoletoVendido;
import vista.CambioDeBoleto;
/**
 *
 * @author Daniel
 */
public class Test {
    
    public static void main(String[] args) throws IOException {
    
        
        
        
        ControladorTest test = new ControladorTest();
        ArrayList<Destino> destinos = new ArrayList(); 
        Csvreader reader = new Csvreader();
        
      //  Csvwriter writer = new Csvwriter();
       // writer.write(destinos);
      
      destinos.add(test.crearDestino("Facultad de Matematicas")); 
      destinos.add(test.crearDestino("Facultad de Derecho")); 
      destinos.add(test.crearDestino("Facultad de Medicina")); 
      destinos = reader.read(destinos);
                    
      VentaDeBoleto vistaVenta = new VentaDeBoleto();
      CambioDeBoleto vistaCambio = new CambioDeBoleto();
      BoletoVendido vistaVendido = new BoletoVendido();
      ControladorVenta controlador = new ControladorVenta(vistaVenta, destinos, vistaCambio, vistaVendido);
      
     vistaVenta.setVisible(true);
    
    }
    
     
}
