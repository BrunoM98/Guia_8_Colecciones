/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class ServicioAlumno {
    
    Scanner leer = new Scanner(System.in);
    
  ArrayList<Alumno> estudiantes = new ArrayList();
  ArrayList <Integer> notas = new ArrayList();
  public void crearAlumno () {
      
      String R = "s";
      
   do {
        System.out.println("Datos del alumno");
      System.out.println("Ingrese el nombre del alumno");
      
      String nombre = leer.next();
      
      ArrayList <Integer> notas = new ArrayList();
      
      for (int i = 0; i < 3 ; i++) {
          
           System.out.println("Ingrese la nota " + (i + 1));
           notas.add(leer.nextInt());
      }
      
      estudiantes.add(new Alumno(nombre,notas));
      
       System.out.println("Desea ingresar otro alumno");
       
       R = leer.next();
          
   } while(R.equalsIgnoreCase("s"));
              
      for (Alumno var : estudiantes) {
          
          System.out.println(var.toString());
      }
 
  }
  public void notaFinal(){
      
      System.out.println("Ingrese el nombre del alumno que quiere calcular su nota");
      String nombre = leer.next();
      
      for(Alumno aux : estudiantes){
          
         if(aux.getNombre().equalsIgnoreCase(nombre)) {
          
             System.out.println("El promedio de " + nombre + "es " + aux.notaFinal());
          
      }
          
      }
      
  }

   
}
  
  
  
  
  


