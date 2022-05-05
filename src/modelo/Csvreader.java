/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author arman
 */
public class Csvreader {
    public ArrayList<Destino> read(ArrayList<Destino> destinos){
        String file = "data.csv";
        BufferedReader reader = null;
        String line;
        ArrayList<Integer> ocupados = new ArrayList();
        //ArrayList<Destino> destinos = new ArrayList();
        try{
            
            reader = new BufferedReader(new FileReader(file));   
            while((line = reader.readLine()) != null){
                String[] row = line.split(",");
                //System.out.println(row[0] + row[1] + "   " + row[2]);
                ocupados.add(Integer.parseInt(row[2]));
            }
            int a=0;
           for(int i=0;i<destinos.size();i++){      
                      for(int j=0;j<destinos.get(i).getCamiones().size();j++){  
                              int oc = ocupados.get(a);
                              destinos.get(i).getCamiones().get(j).setAsientosOcupados(oc);
                              //System.out.println(destinos.get(i).getName() + " " + destinos.get(i).getCamiones().get(j).getHoraSalida() + " " +destinos.get(i).getCamiones().get(j).getAsientosOcupados());
                          a++;     
                  }
                } //destinos.get(i).getCamiones().get(j).getAsientosOcupados()
        }catch(Exception e){
                System.out.println("error");
        }        
        return destinos;
        
    }
}
