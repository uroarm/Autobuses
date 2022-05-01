/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Autobus;
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
    private Autobus autobus;
    private CambioDeBoleto vista2;
    
    

    public ControladorVenta(VentaDeBoleto vista, Autobus autobus, CambioDeBoleto vista2) {
        this.vista = vista;
        this.autobus = autobus;
        this.vista2=vista2;
        
          
        
        this.vista.getBotonVender().addActionListener(this);
        this.vista.getBotonCambiar().addActionListener(this);
        this.vista2.getBotonHacerCambio().addActionListener(this);
        this.vista2.getBotonCancelar().addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        
        if(vista.getBotonVender() == evento.getSource()) {
        
            //Aqui va lo que pasa cuando presionamos el boton para vender el boleto//
            
            if("Elige el destino"==vista.ListaDestino.getSelectedItem().toString()){//Si no se eligio destino entonces se manda un aviso//
                JOptionPane.showMessageDialog(null, "Por Favor Elige un destino");
            }
            
            //Camion de medicina de las 6:00//
            if("Facultad de Medicina"==vista.ListaDestino.getSelectedItem().toString()){//Si la opcion puesta en el combobox es igual a "Facultad de Medicina" se vende un boleto//
                if("6:00"==vista.ListaHorario.getSelectedItem().toString()){// Si el combobox de horario es igual a "6:00" se vende un boleto de ese horario//
                    if(autobus.getMedicina1()<30){
                        autobus.AgregarAsientoMedicina1();
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    //Camion de medicina de las 7:00//
                    if("7:00"==vista.ListaHorario.getSelectedItem().toString()){// Si el combobox de horario es igual a "7:00" se vende un boleto de ese horario//
                        if(autobus.getMedicina2()<30){
                        autobus.AgregarAsientoMedicina2();
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    //Camion de medicina de las 8:00//
                    if("8:00"==vista.ListaHorario.getSelectedItem().toString()){// Si el combobox de horario es igual a "8:00" se vende un boleto de ese horario//
                        if(autobus.getMedicina3()<30){
                        autobus.AgregarAsientoMedicina3();
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    //Camion de medicina de las 9:00//
                    if("9:00"==vista.ListaHorario.getSelectedItem().toString()){// Si el combobox de horario es igual a "9:00" se vende un boleto de ese horario//
                        if(autobus.getMedicina4()<30){
                        autobus.AgregarAsientoMedicina4();
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    //Mensaje por si no se elige un horario//
                    if("Elige le horario"==vista.ListaHorario.getSelectedItem().toString()){
                    JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                }
                }
                }
                }
                }
                
                
                
                
            }
            
            if("Faultad de Matematicas"==vista.ListaDestino.getSelectedItem().toString()){
                if("6:00"==vista.ListaHorario.getSelectedItem().toString()){
                    if(autobus.getMatematicas1()<30){
                        autobus.AgregarAsientoMatematicas1();
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    if("7:00"==vista.ListaHorario.getSelectedItem().toString()){
                        if(autobus.getMatematicas2()<30){
                        autobus.AgregarAsientoMatematicas2();
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    if("8:00"==vista.ListaHorario.getSelectedItem().toString()){
                        if(autobus.getMatematicas3()<30){
                        autobus.AgregarAsientoMatematicas3();
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    if("9:00"==vista.ListaHorario.getSelectedItem().toString()){
                        if(autobus.getMatematicas4()<30){
                        autobus.AgregarAsientoMatematicas4();
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    if("Elige le horario"==vista.ListaHorario.getSelectedItem().toString()){
                    JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                }
                }
                }
                }
                }
                
                
                
                
            }
            
            if("Facultad de Derecho"==vista.ListaDestino.getSelectedItem().toString()){
                if("6:00"==vista.ListaHorario.getSelectedItem().toString()){
                    if(autobus.getDerecho1()<30){
                        autobus.AgregarAsientoDerecho1();
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    if("7:00"==vista.ListaHorario.getSelectedItem().toString()){
                        if(autobus.getDerecho2()<30){
                        autobus.AgregarAsientoDerecho2();
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    if("8:00"==vista.ListaHorario.getSelectedItem().toString()){
                        if(autobus.getDerecho3()<30){
                        autobus.AgregarAsientoDerecho3();
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    if("9:00"==vista.ListaHorario.getSelectedItem().toString()){
                        if(autobus.getDerecho4()<30){
                        autobus.AgregarAsientoDerecho4();
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                     if("Elige le horario"==vista.ListaHorario.getSelectedItem().toString()){
                    JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                }
                }
                }
                }
                }
               
            }
        
        } 
        
        if(vista.getBotonCambiar() == evento.getSource()) {
        
            vista2.setVisible(true);

        }
        
        if(vista2.getBotonCancelar()== evento.getSource()) {
        
            vista2.dispose();

        }
        
        if(vista2.getBotonHacerCambio()== evento.getSource()) {//Boton para hacer el cambio de boletos//
        
            //Aqui va lo que pasa cuando presionamos el boton para vender el boleto//
            
            if("Elige el destino"==vista2.listaDestinoCambio.getSelectedItem().toString()){//Si no se eligio destino entonces se manda un aviso//
                JOptionPane.showMessageDialog(null, "Por Favor Elige un destino de cambio");
            }
            
            //Camion de medicina de las 6:00//
            if("Facultad de Medicina"==vista2.listaDestinoCambio.getSelectedItem().toString()){//Si la opcion puesta en el combobox es igual a "Facultad de Medicina" se vende un boleto//
                if("6:00"==vista2.listaHorarioCambio.getSelectedItem().toString()){// Si el combobox de horario es igual a "6:00" se vende un boleto de ese horario//
                    if(autobus.asientosMedicina1.peek()<30){
                        System.out.println("Si se puede");
                        autobus.AgregarAsientoMedicina1();
                        
                        if("Elige el destino"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si no se eligio destino entonces se manda un aviso//
                            JOptionPane.showMessageDialog(null, "Por Favor Elige un destino");
                        }
            
                            //Camion de medicina de las 6:00//
                            if("Facultad de Medicina"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si la opcion puesta en el combobox es igual a "Facultad de Medicina" se vende un boleto//
                                if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "6:00" se vende un boleto de ese horario//
                                   
                                    autobus.QuitarAsientoMedicina1();

                                }else{
                                    //Camion de medicina de las 7:00//
                                    if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "7:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina2();

                                }else{
                                    //Camion de medicina de las 8:00//
                                    if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "8:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina3();

                                }else{
                                    //Camion de medicina de las 9:00//
                                    if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "9:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina4();

                                }else{
                                    //Mensaje por si no se elige un horario//
                                    if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                                }
                                }
                                }
                                }
                                }

                            }
            
                        if("Faultad de Matematicas"==vista2.listaDestinoActual.getSelectedItem().toString()){
                            if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoMatematicas1();

                            }else{
                                if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas2();

                            }else{
                                if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.AgregarAsientoMatematicas3();

                            }else{
                                if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas4();

                            }else{
                                if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
            
                        if("Facultad de Derecho"==vista.ListaDestino.getSelectedItem().toString()){
                            if("6:00"==vista.ListaHorario.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoDerecho1();

                            }else{
                                if("7:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho2();

                            }else{
                                if("8:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho3();

                            }else{
                                if("9:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho4();

                            }else{
                                 if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }     
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    //Camion de medicina de las 7:00//
                    if("7:00"==vista2.listaHorarioCambio.getSelectedItem().toString()){// Si el combobox de horario es igual a "6:00" se vende un boleto de ese horario//
                    if(autobus.asientosMedicina2.peek()<30){
                        System.out.println("Si se puede");
                        autobus.AgregarAsientoMedicina2();
                        if("Elige el destino"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si no se eligio destino entonces se manda un aviso//
                            JOptionPane.showMessageDialog(null, "Por Favor Elige un destino");
                        }
            
                            //Camion de medicina de las 6:00//
                            if("Facultad de Medicina"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si la opcion puesta en el combobox es igual a "Facultad de Medicina" se vende un boleto//
                                if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "6:00" se vende un boleto de ese horario//
                                   
                                    autobus.QuitarAsientoMedicina1();

                                }else{
                                    //Camion de medicina de las 7:00//
                                    if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "7:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina2();

                                }else{
                                    //Camion de medicina de las 8:00//
                                    if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "8:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina3();

                                }else{
                                    //Camion de medicina de las 9:00//
                                    if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "9:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina4();

                                }else{
                                    //Mensaje por si no se elige un horario//
                                    if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                                }
                                }
                                }
                                }
                                }

                            }
            
                        if("Faultad de Matematicas"==vista2.listaDestinoActual.getSelectedItem().toString()){
                            if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoMatematicas1();

                            }else{
                                if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas2();

                            }else{
                                if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.AgregarAsientoMatematicas3();

                            }else{
                                if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas4();

                            }else{
                                if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
            
                        if("Facultad de Derecho"==vista.ListaDestino.getSelectedItem().toString()){
                            if("6:00"==vista.ListaHorario.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoDerecho1();

                            }else{
                                if("7:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho2();

                            }else{
                                if("8:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho3();

                            }else{
                                if("9:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho4();

                            }else{
                                 if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    //Camion de medicina de las 8:00//
                    if("8:00"==vista2.listaHorarioCambio.getSelectedItem().toString()){// Si el combobox de horario es igual a "6:00" se vende un boleto de ese horario//
                    if(autobus.asientosMedicina3.peek()<30){
                        System.out.println("Si se puede");
                        autobus.AgregarAsientoMedicina3();
                        
                        if("Elige el destino"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si no se eligio destino entonces se manda un aviso//
                            JOptionPane.showMessageDialog(null, "Por Favor Elige un destino");
                        }
            
                            //Camion de medicina de las 6:00//
                            if("Facultad de Medicina"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si la opcion puesta en el combobox es igual a "Facultad de Medicina" se vende un boleto//
                                if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "6:00" se vende un boleto de ese horario//
                                   
                                    autobus.QuitarAsientoMedicina1();

                                }else{
                                    //Camion de medicina de las 7:00//
                                    if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "7:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina2();

                                }else{
                                    //Camion de medicina de las 8:00//
                                    if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "8:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina3();

                                }else{
                                    //Camion de medicina de las 9:00//
                                    if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "9:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina4();

                                }else{
                                    //Mensaje por si no se elige un horario//
                                    if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                                }
                                }
                                }
                                }
                                }

                            }
            
                        if("Faultad de Matematicas"==vista2.listaDestinoActual.getSelectedItem().toString()){
                            if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoMatematicas1();

                            }else{
                                if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas2();

                            }else{
                                if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.AgregarAsientoMatematicas3();

                            }else{
                                if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas4();

                            }else{
                                if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
            
                        if("Facultad de Derecho"==vista.ListaDestino.getSelectedItem().toString()){
                            if("6:00"==vista.ListaHorario.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoDerecho1();

                            }else{
                                if("7:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho2();

                            }else{
                                if("8:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho3();

                            }else{
                                if("9:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho4();

                            }else{
                                 if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    //Camion de medicina de las 9:00//
                    if("9:00"==vista2.listaHorarioCambio.getSelectedItem().toString()){// Si el combobox de horario es igual a "6:00" se vende un boleto de ese horario//
                    if(autobus.asientosMedicina4.peek()<30){
                        System.out.println("Si se puede");
                        autobus.AgregarAsientoMedicina4();
                        if("Elige el destino"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si no se eligio destino entonces se manda un aviso//
                            JOptionPane.showMessageDialog(null, "Por Favor Elige un destino");
                        }
            
                            //Camion de medicina de las 6:00//
                            if("Facultad de Medicina"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si la opcion puesta en el combobox es igual a "Facultad de Medicina" se vende un boleto//
                                if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "6:00" se vende un boleto de ese horario//
                                   
                                    autobus.QuitarAsientoMedicina1();

                                }else{
                                    //Camion de medicina de las 7:00//
                                    if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "7:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina2();

                                }else{
                                    //Camion de medicina de las 8:00//
                                    if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "8:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina3();

                                }else{
                                    //Camion de medicina de las 9:00//
                                    if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "9:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina4();

                                }else{
                                    //Mensaje por si no se elige un horario//
                                    if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                                }
                                }
                                }
                                }
                                }

                            }
            
                        if("Faultad de Matematicas"==vista2.listaDestinoActual.getSelectedItem().toString()){
                            if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoMatematicas1();

                            }else{
                                if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas2();

                            }else{
                                if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.AgregarAsientoMatematicas3();

                            }else{
                                if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas4();

                            }else{
                                if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
            
                        if("Facultad de Derecho"==vista.ListaDestino.getSelectedItem().toString()){
                            if("6:00"==vista.ListaHorario.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoDerecho1();

                            }else{
                                if("7:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho2();

                            }else{
                                if("8:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho3();

                            }else{
                                if("9:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho4();

                            }else{
                                 if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    //Mensaje por si no se elige un horario//
                    if("Elige le horario"==vista2.listaHorarioCambio.getSelectedItem().toString()){
                    JOptionPane.showMessageDialog(null, "Por Favor elige un horario de cambio");
                }
                }
                }
                }
                }
                
                
                
                
            }
            
            if("Faultad de Matematicas"==vista2.listaDestinoCambio.getSelectedItem().toString()){////
                if("6:00"==vista2.listaHorarioCambio.getSelectedItem().toString()){
                    if(autobus.asientosMatematicas1.peek()<30){
                        System.out.println("Si se puede");
                        if("Elige el destino"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si no se eligio destino entonces se manda un aviso//
                            JOptionPane.showMessageDialog(null, "Por Favor Elige un destino");
                        }
            
                            //Camion de medicina de las 6:00//
                            if("Facultad de Medicina"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si la opcion puesta en el combobox es igual a "Facultad de Medicina" se vende un boleto//
                                if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "6:00" se vende un boleto de ese horario//
                                   
                                    autobus.QuitarAsientoMedicina1();

                                }else{
                                    //Camion de medicina de las 7:00//
                                    if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "7:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina2();

                                }else{
                                    //Camion de medicina de las 8:00//
                                    if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "8:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina3();

                                }else{
                                    //Camion de medicina de las 9:00//
                                    if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "9:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina4();

                                }else{
                                    //Mensaje por si no se elige un horario//
                                    if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                                }
                                }
                                }
                                }
                                }

                            }
            
                        if("Faultad de Matematicas"==vista2.listaDestinoActual.getSelectedItem().toString()){
                            if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoMatematicas1();

                            }else{
                                if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas2();

                            }else{
                                if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.AgregarAsientoMatematicas3();

                            }else{
                                if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas4();

                            }else{
                                if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
            
                        if("Facultad de Derecho"==vista.ListaDestino.getSelectedItem().toString()){
                            if("6:00"==vista.ListaHorario.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoDerecho1();

                            }else{
                                if("7:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho2();

                            }else{
                                if("8:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho3();

                            }else{
                                if("9:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho4();

                            }else{
                                 if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                     if("7:00"==vista2.listaHorarioCambio.getSelectedItem().toString()){////
                    if(autobus.asientosMatematicas2.peek()<30){
                        System.out.println("Si se puede");
                        if("Elige el destino"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si no se eligio destino entonces se manda un aviso//
                            JOptionPane.showMessageDialog(null, "Por Favor Elige un destino");
                        }
            
                            //Camion de medicina de las 6:00//
                            if("Facultad de Medicina"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si la opcion puesta en el combobox es igual a "Facultad de Medicina" se vende un boleto//
                                if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "6:00" se vende un boleto de ese horario//
                                   
                                    autobus.QuitarAsientoMedicina1();

                                }else{
                                    //Camion de medicina de las 7:00//
                                    if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "7:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina2();

                                }else{
                                    //Camion de medicina de las 8:00//
                                    if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "8:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina3();

                                }else{
                                    //Camion de medicina de las 9:00//
                                    if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "9:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina4();

                                }else{
                                    //Mensaje por si no se elige un horario//
                                    if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                                }
                                }
                                }
                                }
                                }

                            }
            
                        if("Faultad de Matematicas"==vista2.listaDestinoActual.getSelectedItem().toString()){
                            if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoMatematicas1();

                            }else{
                                if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas2();

                            }else{
                                if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.AgregarAsientoMatematicas3();

                            }else{
                                if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas4();

                            }else{
                                if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
            
                        if("Facultad de Derecho"==vista.ListaDestino.getSelectedItem().toString()){
                            if("6:00"==vista.ListaHorario.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoDerecho1();

                            }else{
                                if("7:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho2();

                            }else{
                                if("8:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho3();

                            }else{
                                if("9:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho4();

                            }else{
                                 if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                     if("8:00"==vista2.listaHorarioCambio.getSelectedItem().toString()){////
                    if(autobus.asientosMatematicas3.peek()<30){
                        System.out.println("Si se puede");
                        if("Elige el destino"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si no se eligio destino entonces se manda un aviso//
                            JOptionPane.showMessageDialog(null, "Por Favor Elige un destino");
                        }
            
                            //Camion de medicina de las 6:00//
                            if("Facultad de Medicina"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si la opcion puesta en el combobox es igual a "Facultad de Medicina" se vende un boleto//
                                if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "6:00" se vende un boleto de ese horario//
                                   
                                    autobus.QuitarAsientoMedicina1();

                                }else{
                                    //Camion de medicina de las 7:00//
                                    if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "7:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina2();

                                }else{
                                    //Camion de medicina de las 8:00//
                                    if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "8:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina3();

                                }else{
                                    //Camion de medicina de las 9:00//
                                    if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "9:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina4();

                                }else{
                                    //Mensaje por si no se elige un horario//
                                    if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                                }
                                }
                                }
                                }
                                }

                            }
            
                        if("Faultad de Matematicas"==vista2.listaDestinoActual.getSelectedItem().toString()){
                            if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoMatematicas1();

                            }else{
                                if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas2();

                            }else{
                                if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.AgregarAsientoMatematicas3();

                            }else{
                                if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas4();

                            }else{
                                if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
            
                        if("Facultad de Derecho"==vista.ListaDestino.getSelectedItem().toString()){
                            if("6:00"==vista.ListaHorario.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoDerecho1();

                            }else{
                                if("7:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho2();

                            }else{
                                if("8:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho3();

                            }else{
                                if("9:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho4();

                            }else{
                                 if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                     if("9:00"==vista2.listaHorarioCambio.getSelectedItem().toString()){////
                    if(autobus.asientosMatematicas4.peek()<30){
                        System.out.println("Si se puede");
                        if("Elige el destino"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si no se eligio destino entonces se manda un aviso//
                            JOptionPane.showMessageDialog(null, "Por Favor Elige un destino");
                        }
            
                            //Camion de medicina de las 6:00//
                            if("Facultad de Medicina"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si la opcion puesta en el combobox es igual a "Facultad de Medicina" se vende un boleto//
                                if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "6:00" se vende un boleto de ese horario//
                                   
                                    autobus.QuitarAsientoMedicina1();

                                }else{
                                    //Camion de medicina de las 7:00//
                                    if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "7:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina2();

                                }else{
                                    //Camion de medicina de las 8:00//
                                    if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "8:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina3();

                                }else{
                                    //Camion de medicina de las 9:00//
                                    if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "9:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina4();

                                }else{
                                    //Mensaje por si no se elige un horario//
                                    if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                                }
                                }
                                }
                                }
                                }

                            }
            
                        if("Faultad de Matematicas"==vista2.listaDestinoActual.getSelectedItem().toString()){
                            if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoMatematicas1();

                            }else{
                                if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas2();

                            }else{
                                if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.AgregarAsientoMatematicas3();

                            }else{
                                if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas4();

                            }else{
                                if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
            
                        if("Facultad de Derecho"==vista.ListaDestino.getSelectedItem().toString()){
                            if("6:00"==vista.ListaHorario.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoDerecho1();

                            }else{
                                if("7:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho2();

                            }else{
                                if("8:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho3();

                            }else{
                                if("9:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho4();

                            }else{
                                 if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    if("Elige le horario"==vista2.listaHorarioCambio.getSelectedItem().toString()){
                    JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                }
                }
                }
                }
                }
            }
            
            if("Facultad de Derecho"==vista2.listaDestinoCambio.getSelectedItem().toString()){
                if("6:00"==vista2.listaHorarioCambio.getSelectedItem().toString()){////
                    if(autobus.asientosDerecho1.peek()<30){
                        System.out.println("Si se puede");
                        if("Elige el destino"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si no se eligio destino entonces se manda un aviso//
                            JOptionPane.showMessageDialog(null, "Por Favor Elige un destino");
                        }
            
                            //Camion de medicina de las 6:00//
                            if("Facultad de Medicina"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si la opcion puesta en el combobox es igual a "Facultad de Medicina" se vende un boleto//
                                if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "6:00" se vende un boleto de ese horario//
                                   
                                    autobus.QuitarAsientoMedicina1();

                                }else{
                                    //Camion de medicina de las 7:00//
                                    if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "7:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina2();

                                }else{
                                    //Camion de medicina de las 8:00//
                                    if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "8:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina3();

                                }else{
                                    //Camion de medicina de las 9:00//
                                    if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "9:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina4();

                                }else{
                                    //Mensaje por si no se elige un horario//
                                    if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                                }
                                }
                                }
                                }
                                }

                            }
            
                        if("Faultad de Matematicas"==vista2.listaDestinoActual.getSelectedItem().toString()){
                            if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoMatematicas1();

                            }else{
                                if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas2();

                            }else{
                                if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.AgregarAsientoMatematicas3();

                            }else{
                                if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas4();

                            }else{
                                if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
            
                        if("Facultad de Derecho"==vista.ListaDestino.getSelectedItem().toString()){
                            if("6:00"==vista.ListaHorario.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoDerecho1();

                            }else{
                                if("7:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho2();

                            }else{
                                if("8:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho3();

                            }else{
                                if("9:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho4();

                            }else{
                                 if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    if("7:00"==vista2.listaHorarioCambio.getSelectedItem().toString()){////
                        if(autobus.asientosDerecho2.peek()<30){
                        System.out.println("Si se puede");
                        if("Elige el destino"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si no se eligio destino entonces se manda un aviso//
                            JOptionPane.showMessageDialog(null, "Por Favor Elige un destino");
                        }
            
                            //Camion de medicina de las 6:00//
                            if("Facultad de Medicina"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si la opcion puesta en el combobox es igual a "Facultad de Medicina" se vende un boleto//
                                if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "6:00" se vende un boleto de ese horario//
                                   
                                    autobus.QuitarAsientoMedicina1();

                                }else{
                                    //Camion de medicina de las 7:00//
                                    if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "7:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina2();

                                }else{
                                    //Camion de medicina de las 8:00//
                                    if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "8:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina3();

                                }else{
                                    //Camion de medicina de las 9:00//
                                    if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "9:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina4();

                                }else{
                                    //Mensaje por si no se elige un horario//
                                    if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                                }
                                }
                                }
                                }
                                }

                            }
            
                        if("Faultad de Matematicas"==vista2.listaDestinoActual.getSelectedItem().toString()){
                            if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoMatematicas1();

                            }else{
                                if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas2();

                            }else{
                                if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.AgregarAsientoMatematicas3();

                            }else{
                                if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas4();

                            }else{
                                if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
            
                        if("Facultad de Derecho"==vista.ListaDestino.getSelectedItem().toString()){
                            if("6:00"==vista.ListaHorario.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoDerecho1();

                            }else{
                                if("7:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho2();

                            }else{
                                if("8:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho3();

                            }else{
                                if("9:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho4();

                            }else{
                                 if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    if("8:00"==vista2.listaHorarioCambio.getSelectedItem().toString()){////
                        if(autobus.asientosDerecho3.peek()<30){
                        System.out.println("Si se puede");
                        if("Elige el destino"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si no se eligio destino entonces se manda un aviso//
                            JOptionPane.showMessageDialog(null, "Por Favor Elige un destino");
                        }
            
                            //Camion de medicina de las 6:00//
                            if("Facultad de Medicina"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si la opcion puesta en el combobox es igual a "Facultad de Medicina" se vende un boleto//
                                if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "6:00" se vende un boleto de ese horario//
                                   
                                    autobus.QuitarAsientoMedicina1();

                                }else{
                                    //Camion de medicina de las 7:00//
                                    if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "7:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina2();

                                }else{
                                    //Camion de medicina de las 8:00//
                                    if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "8:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina3();

                                }else{
                                    //Camion de medicina de las 9:00//
                                    if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "9:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina4();

                                }else{
                                    //Mensaje por si no se elige un horario//
                                    if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                                }
                                }
                                }
                                }
                                }

                            }
            
                        if("Faultad de Matematicas"==vista2.listaDestinoActual.getSelectedItem().toString()){
                            if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoMatematicas1();

                            }else{
                                if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas2();

                            }else{
                                if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.AgregarAsientoMatematicas3();

                            }else{
                                if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas4();

                            }else{
                                if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
            
                        if("Facultad de Derecho"==vista.ListaDestino.getSelectedItem().toString()){
                            if("6:00"==vista.ListaHorario.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoDerecho1();

                            }else{
                                if("7:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho2();

                            }else{
                                if("8:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho3();

                            }else{
                                if("9:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho4();

                            }else{
                                 if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                    if("9:00"==vista2.listaHorarioCambio.getSelectedItem().toString()){////
                        if(autobus.asientosDerecho4.peek()<30){
                        System.out.println("Si se puede");
                        if("Elige el destino"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si no se eligio destino entonces se manda un aviso//
                            JOptionPane.showMessageDialog(null, "Por Favor Elige un destino");
                        }
            
                            //Camion de medicina de las 6:00//
                            if("Facultad de Medicina"==vista2.listaDestinoActual.getSelectedItem().toString()){//Si la opcion puesta en el combobox es igual a "Facultad de Medicina" se vende un boleto//
                                if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "6:00" se vende un boleto de ese horario//
                                   
                                    autobus.QuitarAsientoMedicina1();

                                }else{
                                    //Camion de medicina de las 7:00//
                                    if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "7:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina2();

                                }else{
                                    //Camion de medicina de las 8:00//
                                    if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "8:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina3();

                                }else{
                                    //Camion de medicina de las 9:00//
                                    if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){// Si el combobox de horario es igual a "9:00" se vende un boleto de ese horario//
                                        
                                        autobus.QuitarAsientoMedicina4();

                                }else{
                                    //Mensaje por si no se elige un horario//
                                    if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                                }
                                }
                                }
                                }
                                }

                            }
            
                        if("Faultad de Matematicas"==vista2.listaDestinoActual.getSelectedItem().toString()){
                            if("6:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoMatematicas1();

                            }else{
                                if("7:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas2();

                            }else{
                                if("8:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.AgregarAsientoMatematicas3();

                            }else{
                                if("9:00"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoMatematicas4();

                            }else{
                                if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
            
                        if("Facultad de Derecho"==vista.ListaDestino.getSelectedItem().toString()){
                            if("6:00"==vista.ListaHorario.getSelectedItem().toString()){
                                
                                autobus.QuitarAsientoDerecho1();

                            }else{
                                if("7:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho2();

                            }else{
                                if("8:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho3();

                            }else{
                                if("9:00"==vista.ListaHorario.getSelectedItem().toString()){
                                    
                                    autobus.QuitarAsientoDerecho4();

                            }else{
                                 if("Elige le horario"==vista2.listaHorarioActual.getSelectedItem().toString()){
                                JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                            }
                            }
                            }
                            }
                            }

                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "ya no hay asientos disponibles");
                    }
                    
                }else{
                     if("Elige le horario"==vista2.listaHorarioCambio.getSelectedItem().toString()){
                    JOptionPane.showMessageDialog(null, "Por Favor elige un horario");
                }
                }
                }
                }
                }
               
            }
        }
    
    }
}
