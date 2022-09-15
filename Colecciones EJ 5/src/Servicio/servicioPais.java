/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class servicioPais {
    
    HashSet<String> paises = new HashSet();
    
    Scanner leer = new Scanner(System.in);
    
    public void inicializar(){
        
        crearPaises();
        mostrarPaises();
        removerPais();
    }
    
    public void crearPaises(){
        
      String aceptar = "y";
      
      while (aceptar.equalsIgnoreCase("y")){
          
          System.out.println("Ingrese los paises que quiera");
          String pais = leer.next();
          System.out.println("Desea ingresar otro pais al conjunto");
          System.out.println("y/n");
          aceptar = leer.next();
          
          paises.add(new String(pais.toLowerCase()));
         
      }
      
    }
    
    public void mostrarPaises(){
        
        for(String var : paises){
            
            System.out.println(var);  
        }
    }
    
    public void removerPais(){
        
        System.out.println("Ingrese el pais que desea remover");
        
        String buscar = leer.next();
        
         Iterator<String> it = paises.iterator();
         
         while (it.hasNext()) {
         
         String borrar = it.next();
         
         if(borrar.equals(buscar)) {
             
             it.remove();
    }
         }
        System.out.println(paises);
         }
            
}
            

    

