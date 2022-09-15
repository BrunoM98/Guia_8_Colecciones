/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Alumno {
    
    Scanner leer = new Scanner(System.in);
    
   private String nombre;
   private ArrayList<Integer> nota = new ArrayList();

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alumno(String nombre, ArrayList<Integer> nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }
    
    public double notaFinal(){
        
        double promedio = 0;
        
       for (Integer aux : nota) {
           
           promedio += aux;
                  
       }
        return promedio/3;
    }

   
    @Override
    public String toString() {
        return
                " nombre=" + nombre 
                + " nota=" 
                + nota + '}';
    }
   
   

    

  
 
    
    
}
