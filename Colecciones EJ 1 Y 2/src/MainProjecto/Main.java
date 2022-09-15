/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainProjecto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        String aceptar = "s";
        
        ArrayList<String> nombreperro = new ArrayList();
        
        System.out.println(nombreperro.size());
        
         while (!"n".equals(aceptar)) {
             
             System.out.println("Ingrese el nombre de sus mascotas");
             
             nombreperro.add(leer.nextLine());
             
             System.out.println("desea agruegar otra mascota a la lista");
             System.out.println("s o n");
             
             aceptar = leer.nextLine();
             
         }
         
         System.out.println("eligio s y la lista llego a su fin los nombres en ella son:");
         
         System.out.println("Los nombres de sus mascotas son");
         
         for (String var : nombreperro) {
             
             System.out.print(var + ",");
         }
         
         System.out.println("");
         System.out.println("y la dimension de su lista es de");
         System.out.println(nombreperro.size());
         System.out.println("Ahora ingrese el nombre de su mascota para saber si esta en la lista ");
         
         String perro = leer.nextLine();
         
         Iterator<String> it = nombreperro.iterator();
         
         while (it.hasNext()) {
         
         String perruno = it.next();
         
         if(perruno.equals(perro)) {
             
             it.remove();
             
         } 
         
         }
         
         System.out.println(nombreperro);
         
         
        
    }
    
}
