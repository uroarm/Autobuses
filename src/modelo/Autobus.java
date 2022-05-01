/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Stack;

/**
 *
 * @author Daniel
 */
import java.util.Queue;
import java.util.LinkedList;

public class Autobus {
    
    private String horaDeLlegada;
    private String horaDeSalida;
    private String Destino;
    private int numCamion;
    private boolean asitosDisponibles;
    public Stack<Integer> asientosMatematicas1=new Stack<Integer>();//Esta es la pila//+
    public Stack<Integer> asientosMedicina1=new Stack<Integer>();
    public Stack<Integer> asientosDerecho1=new Stack<Integer>();
    public Stack<Integer> asientosMatematicas2=new Stack<Integer>();//Esta es la pila//+
    public Stack<Integer> asientosMedicina2=new Stack<Integer>();
    public Stack<Integer> asientosDerecho2=new Stack<Integer>();
    public Stack<Integer> asientosMatematicas3=new Stack<Integer>();//Esta es la pila//+
    public Stack<Integer> asientosMedicina3=new Stack<Integer>();
    public Stack<Integer> asientosDerecho3=new Stack<Integer>();
    public Stack<Integer> asientosMatematicas4=new Stack<Integer>();//Esta es la pila//+
    public Stack<Integer> asientosMedicina4=new Stack<Integer>();
    public Stack<Integer> asientosDerecho4=new Stack<Integer>();
    protected int matematicas1=0;
    protected int derecho1=0;
    protected int medicina1=0;
    protected int matematicas2=0;
    protected int derecho2=0;
    protected int medicina2=0;
    protected int matematicas3=0;
    protected int derecho3=0;
    protected int medicina3=0;
    protected int matematicas4=0;
    protected int derecho4=0;
    protected int medicina4=0;

    public Autobus(String horaDeLlegada, String horaDeSalida, String Destino, int numCamion, boolean asitosDisponibles) {
        this.horaDeLlegada = horaDeLlegada;
        this.horaDeSalida = horaDeSalida;
        this.Destino = Destino;
        this.numCamion = numCamion;
        this.asitosDisponibles = asitosDisponibles;
    }

    public Autobus() {
    }
    
    
    
    public boolean ConsultarAsientoDisponible(){
    
    
        return true; //!!!HEEEY puse "true" solo para que no salga error, usen una variabe"
    }
    
    public void AgregarAsientoMatematicas1(){
        
        matematicas1++;
        asientosMatematicas1.add(matematicas1);
        System.out.println("camion 6:00 de matematicas "+asientosMatematicas1);

    }
    
    public void AgregarAsientoMedicina1(){
        
        medicina1++;
        asientosMedicina1.add(medicina1);
        System.out.println("camion 6:00 de medicina "+asientosMedicina1);

    }
    
    public void AgregarAsientoDerecho1(){
        
        derecho1++;
        asientosDerecho1.add(derecho1);
        System.out.println("camion 6:00 derecho "+asientosDerecho1);

    }
    
    public void AgregarAsientoMatematicas2(){
        
        matematicas2++;
        asientosMatematicas2.add(matematicas2);
        System.out.println("camion 7:00 de matematicas "+asientosMatematicas2);

    }
    
    public void AgregarAsientoMedicina2(){
        
        medicina2++;
        asientosMedicina2.add(medicina2);
        System.out.println("camion 7:00 de medicina "+asientosMedicina2);

    }
    
    public void AgregarAsientoDerecho2(){
        
        derecho2++;
        asientosDerecho2.add(derecho2);
        System.out.println("camion 7:00 derecho "+asientosDerecho2);

    }
    
    public void AgregarAsientoMatematicas3(){
        
        matematicas3++;
        asientosMatematicas3.add(matematicas3);
        System.out.println("camion 8:00 de matematicas "+asientosMatematicas3);

    }
    
    public void AgregarAsientoMedicina3(){
        
        medicina3++;
        asientosMedicina3.add(medicina3);
        System.out.println("camion 8:00 de medicina "+asientosMedicina3);

    }
    
    public void AgregarAsientoDerecho3(){
        
        derecho3++;
        asientosDerecho3.add(derecho3);
        System.out.println("camion 8:00 derecho "+asientosDerecho3);

    }
    
    public void AgregarAsientoMatematicas4(){
        
        matematicas4++;
        asientosMatematicas4.add(matematicas4);
        System.out.println("camion 9:00 de matematicas "+asientosMatematicas4);

    }
    
    public void AgregarAsientoMedicina4(){
        
        medicina4++;
        asientosMedicina4.add(medicina4);
        System.out.println("camion 9:00 de medicina "+asientosMedicina4);

    }
    
    public void AgregarAsientoDerecho4(){
        
        derecho4++;
        asientosDerecho4.add(derecho4);
        System.out.println("camion 9:00 derecho "+asientosDerecho4);

    }
    
    public void QuitarAsientoMatematicas1(){
        
        matematicas1--;
        asientosMatematicas1.pop();
        System.out.println("camion 6:00 de matematicas "+asientosMatematicas1);

    }
      public void QuitarAsientoMatematicas2(){
        
        matematicas2--;
        asientosMatematicas2.pop();
        System.out.println("camion 7:00 de matematicas "+asientosMatematicas2);

    }
      public void QuitarAsientoMatematicas3(){
        
        matematicas3--;
        asientosMatematicas3.pop();
        System.out.println("camion 8:00 de matematicas "+asientosMatematicas3);
        

    }
      
      public void QuitarAsientoMatematicas4(){
        
        matematicas4--;
        asientosMatematicas4.pop();
        System.out.println("camion 9:00 de matematicas "+asientosMatematicas4);

    }
    public void QuitarAsientoMedicina1(){
        
        medicina1--;
        asientosMedicina1.pop();
        System.out.println("camion 6:00 de medicina "+asientosMedicina1);

    }
     public void QuitarAsientoMedicina2(){
        
        medicina2--;
        asientosMedicina2.pop();
        System.out.println("camion 7:00 de medicina "+asientosMedicina2);

    }
      public void QuitarAsientoMedicina3(){
        
        medicina3--;
        asientosMedicina3.pop();
        System.out.println("camion 8:00 de medicina "+asientosMedicina3);

    }
       public void QuitarAsientoMedicina4(){
        
        medicina4--;
        asientosMedicina4.pop();
        System.out.println("camion 9:00 de medicina "+asientosMedicina4);

    }
    
    public void QuitarAsientoDerecho1(){
        
        derecho1--;
        asientosDerecho1.pop();
        System.out.println("camion 6:00 derecho "+asientosDerecho1);

    }
      public void QuitarAsientoDerecho2(){
        
        derecho2--;
        asientosDerecho2.pop();
        System.out.println("camion 7:00 derecho "+asientosDerecho2);

    }
      public void QuitarAsientoDerecho3(){
        
        derecho3--;
        asientosDerecho3.pop();
        System.out.println("camion 8:00 derecho "+asientosDerecho3);

    }
        public void QuitarAsientoDerecho4(){
        
        derecho4--;
        asientosDerecho4.pop();
        System.out.println("camion 9:00 derecho "+asientosDerecho4);

    }
    

    public String getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(String horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public int getNumCamion() {
        return numCamion;
    }

    public void setNumCamion(int numCamion) {
        this.numCamion = numCamion;
    }

    public boolean isAsitosDisponibles() {
        return asitosDisponibles;
    }

    public void setAsitosDisponibles(boolean asitosDisponibles) {
        this.asitosDisponibles = asitosDisponibles;
    }

    public Stack<Integer> getAsientosMatematicas1() {
        return asientosMatematicas1;
    }

    public void setAsientosMatematicas1(Stack<Integer> asientosMatematicas1) {
        this.asientosMatematicas1 = asientosMatematicas1;
    }

    public Stack<Integer> getAsientosMedicina1() {
        return asientosMedicina1;
    }

    public void setAsientosMedicina1(Stack<Integer> asientosMedicina1) {
        this.asientosMedicina1 = asientosMedicina1;
    }

    public Stack<Integer> getAsientosDerecho1() {
        return asientosDerecho1;
    }

    public void setAsientosDerecho1(Stack<Integer> asientosDerecho1) {
        this.asientosDerecho1 = asientosDerecho1;
    }

    public Stack<Integer> getAsientosMatematicas2() {
        return asientosMatematicas2;
    }

    public void setAsientosMatematicas2(Stack<Integer> asientosMatematicas2) {
        this.asientosMatematicas2 = asientosMatematicas2;
    }

    public Stack<Integer> getAsientosMedicina2() {
        return asientosMedicina2;
    }

    public void setAsientosMedicina2(Stack<Integer> asientosMedicina2) {
        this.asientosMedicina2 = asientosMedicina2;
    }

    public Stack<Integer> getAsientosDerecho2() {
        return asientosDerecho2;
    }

    public void setAsientosDerecho2(Stack<Integer> asientosDerecho2) {
        this.asientosDerecho2 = asientosDerecho2;
    }

    public Stack<Integer> getAsientosMatematicas3() {
        return asientosMatematicas3;
    }

    public void setAsientosMatematicas3(Stack<Integer> asientosMatematicas3) {
        this.asientosMatematicas3 = asientosMatematicas3;
    }

    public Stack<Integer> getAsientosMedicina3() {
        return asientosMedicina3;
    }

    public void setAsientosMedicina3(Stack<Integer> asientosMedicina3) {
        this.asientosMedicina3 = asientosMedicina3;
    }

    public Stack<Integer> getAsientosDerecho3() {
        return asientosDerecho3;
    }

    public void setAsientosDerecho3(Stack<Integer> asientosDerecho3) {
        this.asientosDerecho3 = asientosDerecho3;
    }

    public Stack<Integer> getAsientosMatematicas4() {
        return asientosMatematicas4;
    }

    public void setAsientosMatematicas4(Stack<Integer> asientosMatematicas4) {
        this.asientosMatematicas4 = asientosMatematicas4;
    }

    public Stack<Integer> getAsientosMedicina4() {
        return asientosMedicina4;
    }

    public void setAsientosMedicina4(Stack<Integer> asientosMedicina4) {
        this.asientosMedicina4 = asientosMedicina4;
    }

    public Stack<Integer> getAsientosDerecho4() {
        return asientosDerecho4;
    }

    public void setAsientosDerecho4(Stack<Integer> asientosDerecho4) {
        this.asientosDerecho4 = asientosDerecho4;
    }

    public int getMatematicas1() {
        return matematicas1;
    }

    public void setMatematicas1(int matematicas1) {
        this.matematicas1 = matematicas1;
    }

    public int getDerecho1() {
        return derecho1;
    }

    public void setDerecho1(int derecho1) {
        this.derecho1 = derecho1;
    }

    public int getMedicina1() {
        return medicina1;
    }

    public void setMedicina1(int medicina1) {
        this.medicina1 = medicina1;
    }

    public int getMatematicas2() {
        return matematicas2;
    }

    public void setMatematicas2(int matematicas2) {
        this.matematicas2 = matematicas2;
    }

    public int getDerecho2() {
        return derecho2;
    }

    public void setDerecho2(int derecho2) {
        this.derecho2 = derecho2;
    }

    public int getMedicina2() {
        return medicina2;
    }

    public void setMedicina2(int medicina2) {
        this.medicina2 = medicina2;
    }

    public int getMatematicas3() {
        return matematicas3;
    }

    public void setMatematicas3(int matematicas3) {
        this.matematicas3 = matematicas3;
    }

    public int getDerecho3() {
        return derecho3;
    }

    public void setDerecho3(int derecho3) {
        this.derecho3 = derecho3;
    }

    public int getMedicina3() {
        return medicina3;
    }

    public void setMedicina3(int medicina3) {
        this.medicina3 = medicina3;
    }

    public int getMatematicas4() {
        return matematicas4;
    }

    public void setMatematicas4(int matematicas4) {
        this.matematicas4 = matematicas4;
    }

    public int getDerecho4() {
        return derecho4;
    }

    public void setDerecho4(int derecho4) {
        this.derecho4 = derecho4;
    }

    public int getMedicina4() {
        return medicina4;
    }

    public void setMedicina4(int medicina4) {
        this.medicina4 = medicina4;
    }

    

    
    
    
    
}
    

 