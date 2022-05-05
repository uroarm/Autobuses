/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Csvwriter;
import modelo.Destino;
import modelo.Ubicaciones;
import modelo.Ticket;
import vista.BoletoVendido;
import vista.VentaDeBoleto;
import vista.CambioDeBoleto;
import vista.CambioDeBoleto;



/**
 *
 * @author Daniel
 */
public class ControladorVenta implements ActionListener{
    
    private VentaDeBoleto vistaVenta;
    private Ubicaciones ubicaciones;
    private CambioDeBoleto vistaCambio;
    private BoletoVendido vistaVendido;
    ArrayList<Destino> destinos = new ArrayList();
    private static final int TOTALASIENTOS = 15;

    public ControladorVenta(VentaDeBoleto vistaVenta, ArrayList<Destino> Destinos, CambioDeBoleto vistaCambio, BoletoVendido vistaVendido) {
        this.vistaVenta = vistaVenta;
        this.ubicaciones = ubicaciones;
        this.vistaCambio = vistaCambio;
        this.vistaVendido = vistaVendido;
        destinos = Destinos;
        
        this.vistaVenta.getBotonVender().addActionListener(this);
        this.vistaVenta.getBotonCambiar().addActionListener(this);
        this.vistaCambio.getBotonHacerCambio().addActionListener(this);
        this.vistaCambio.getBotonCancelar().addActionListener(this);
        this.vistaVendido.getBotonOkeyvalidar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(vistaVenta.getBotonVender() == e.getSource()){
             int destinoSeleccionado = 0;
             int horaSeleccionada = 0;
     
                    for(int i=0; i<destinos.size(); i++ ){
                        if(destinos.get(i).getName() == vistaVenta.ListaDestino.getSelectedItem().toString()){
                            destinoSeleccionado = i;
                            break;
                        }
                    }
                
                    for (int i=0; i<destinos.get(destinoSeleccionado).getCamiones().size(); i++){  
                        if(destinos.get(destinoSeleccionado).getCamiones().get(i).getHoraSalida() == vistaVenta.ListaHorario.getSelectedItem().toString()){
                            horaSeleccionada = i;
                            break;
                        }
                    }
                            
              
                int ocupados = destinos.get(destinoSeleccionado).getCamiones().get(horaSeleccionada).getAsientosOcupados();
                    if(ocupados == TOTALASIENTOS){
                    
                    JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }else{
                        ocupados++;
                        destinos.get(destinoSeleccionado).getCamiones().get(horaSeleccionada).setAsientosOcupados(ocupados);
                        vistaVendido.setVisible(true);
                        vistaVendido.getDestinoTexto().setText(destinos.get(destinoSeleccionado).getName());
                        vistaVendido.getHorarioTexto().setText(destinos.get(destinoSeleccionado).getCamiones().get(horaSeleccionada).getHoraSalida());
                        System.out.println("horario de: " + destinos.get(destinoSeleccionado).getCamiones().get(horaSeleccionada).getHoraSalida() + "Con destino a " + destinos.get(destinoSeleccionado).getName());
                        System.out.println("asientos ocupados: " + destinos.get(destinoSeleccionado).getCamiones().get(horaSeleccionada).getAsientosOcupados());
                        
                        
                    }
                    destinoSeleccionado = 0;
                    horaSeleccionada = 0;
                    
                    Csvwriter writer = new Csvwriter();
            try {       
                writer.write(destinos);
            } catch (IOException ex) {
                //Logger.getLogger(ControladorVenta.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Cierre el documento para ser editado");
            }
        }
        
        //salir de la ventana del boleto vendido
        if(vistaVendido.getBotonOkeyvalidar() == e.getSource()){
            vistaVendido.setVisible(false);
        }
        
        //cambiar boleto 
        if(this.vistaVenta.getBotonCambiar() == e.getSource()){
            vistaVenta.setVisible(false);
            vistaCambio.setVisible(true);
        }
        
        if(this.vistaCambio.getBotonHacerCambio() == e.getSource()){
            int destinoCambio = 0;
            int horaCambio = 0;
            int nuevoDestino = 0;
            int nuevaHora = 0;
       
            //obteniendo destinos
            for (int i=0; i<destinos.size();i++){
                if(destinos.get(i).getName() == vistaCambio.listaDestinoActual.getSelectedItem().toString()){
                    destinoCambio = i;
                    break;
                } 
            }
            
            for (int i=0;i<destinos.size();i++){
                if(destinos.get(i).getName() == vistaCambio.listaDestinoCambio.getSelectedItem().toString()){
                    nuevoDestino = i;
                }
            }
            
            //obteniendo horarios 
            for(int i=0;i<destinos.get(destinoCambio).getCamiones().size();i++){
                if(destinos.get(destinoCambio).getCamiones().get(i).getHoraSalida() == vistaCambio.listaHorarioActual.getSelectedItem().toString()){
                    horaCambio = i;
                    break;
                }
            }
            for(int i=0;i<destinos.get(nuevoDestino).getCamiones().size();i++){
                if(destinos.get(nuevoDestino).getCamiones().get(i).getHoraSalida() == vistaCambio.listaHorarioCambio.getSelectedItem().toString()){
                    nuevaHora = i;
                    break;
                }
            }
            //realizando el cambio 
            //elmininado boleto
            int asientoCambiotemp[];
            int ocupados = destinos.get(destinoCambio).getCamiones().get(horaCambio).getAsientosOcupados();
            if(ocupados == 0){
                JOptionPane.showMessageDialog(null, "No hay ningun asiento ocupado en este viaje");
            }else{
            
                ocupados--;
                destinos.get(destinoCambio).getCamiones().get(horaCambio).setAsientosOcupados(ocupados);
                System.out.println("antiguo destino  " + destinos.get(destinoCambio).getName() + "Con horario de: " +  destinos.get(destinoCambio).getCamiones().get(horaCambio).getHoraSalida());
                System.out.println("asientos ocupados: " + destinos.get(destinoCambio).getCamiones().get(horaCambio).getAsientosOcupados());
                  
                
                    
                 //haciendo el nuevo cambio 
                 ocupados = destinos.get(nuevoDestino).getCamiones().get(nuevaHora).getAsientosOcupados();;
                 System.out.println("nuevo destino " + nuevoDestino + " Nueva hora" + nuevaHora);
                if(ocupados == TOTALASIENTOS){
                    JOptionPane.showMessageDialog(null, "El viaje está lleno, por favor seleccione otro");
                }else{
                
                ocupados++;
                destinos.get(nuevoDestino).getCamiones().get(nuevaHora).setAsientosOcupados(ocupados);
                   System.out.println("nuevo destino  " + destinos.get(nuevoDestino).getName() + "Con horario de: " +  destinos.get(nuevoDestino).getCamiones().get(nuevaHora).getHoraSalida());
                   System.out.println("asientos ocupados: " + destinos.get(nuevoDestino).getCamiones().get(nuevaHora).getAsientosOcupados());
                  
                }
                
            Csvwriter writer = new Csvwriter();
                try {       
                    writer.write(destinos);
                } catch (IOException ex) {
                    //Logger.getLogger(ControladorVenta.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Cierre el documento para ser editado");
                    }
            }
           
        }
        
        if(vistaCambio.getBotonCancelar() == e.getSource()){
            vistaCambio.setVisible(false);
            vistaVenta.setVisible(true);
        }
        
    }
}
