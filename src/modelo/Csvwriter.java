/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import com.opencsv.CSVWriter;
import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author arman
 */
public class Csvwriter  {
    
//    public void write(ArrayList<Destino> destinos) throws IOException{
//        CSVWriter writer = new CSVWriter(new FileWriter ("data.csv"));
//        ArrayList <String[]> rows = new ArrayList(); 
//        
//     //   String[] header = new String[]{"Destino","horario","Asientos Ocupados"};
//    //   rows.add(header);
////        String[] row = new String[] {"Facultad de Matematicas", "10:00", "2" };
//        for (int i=0;i<destinos.size();i++){
//            for (int j=0; j<destinos.get(i).getCamiones().size(); j++){
//                String nombreDestino = destinos.get(i).getName();
//                String horaSalida =  destinos.get(i).getCamiones().get(j).getHoraSalida();
//                int lugaresOcupados = destinos.get(i).getCamiones().get(j).getAsientosOcupados();
//                String[] data = {nombreDestino, horaSalida, String.valueOf(lugaresOcupados)};
//                 rows.add(data);
//            }
//        }
//        writer.writeAll(rows);
//        writer.close();
//    }
    
    
    public void write(ArrayList<Destino> destinos) throws IOException{
        try{
        FileWriter file = new FileWriter("data.csv");
        BufferedWriter bw = new BufferedWriter(file);
        PrintWriter pw = new PrintWriter(bw);        
                for (int i=0;i<destinos.size();i++){
            for (int j=0; j<destinos.get(i).getCamiones().size(); j++){
                String nombreDestino = destinos.get(i).getName();
                String horaSalida =  destinos.get(i).getCamiones().get(j).getHoraSalida();
                int lugaresOcupados = destinos.get(i).getCamiones().get(j).getAsientosOcupados();
               // String[] data = {nombreDestino, horaSalida, String.valueOf(lugaresOcupados)};
                 pw.println(nombreDestino+","+horaSalida+","+String.valueOf(lugaresOcupados));
                  pw.flush();
            }
        }
        pw.close();
        
        } catch(Exception e){
            
        }
        
    }
    
    
}
