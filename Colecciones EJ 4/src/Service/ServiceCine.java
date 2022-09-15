/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class ServiceCine {
    
    Scanner leer = new Scanner(System.in);
    
    ArrayList<Pelicula> peliculas = new ArrayList();
    
    public void inicializar() {

        crearPelicula();
        mostrarPelicula();
        mayorDuracion();
        ordenarPorDuracionDescendente();
        ordenarPorDuracionAscendente();
        ordenarPorTitulo();
        ordenarPorDirector();
    }
    
    public void crearPelicula(){
        
        String salir = "y";
        
        while (salir.equalsIgnoreCase("y")){
          
        System.out.println("Ingrese el titulo de la pelicula");
        String titulo = leer.next();
        System.out.println("Ingrese el director de la obra");
        String director = leer.next();
        System.out.println("Y la duracion de la pelicula");
        double duracion = leer.nextDouble();
        System.out.println("Desea ingresar otra pelicla");
        System.out.println("y/n");
        salir = leer.next();
        
        peliculas.add(new Pelicula(titulo,director,duracion));

        }

    }
    
    public void mostrarPelicula(){
        
        for(Pelicula aux : peliculas){
            
            System.out.println(aux);
            
        }
    }
    
    public void mayorDuracion(){
        
        System.out.println("Las peliclas con una duracion mayor a 1 hs son");
        for (Pelicula Pelicula : peliculas){
            
            if (Pelicula.getHora() > 1){
                
                Pelicula.toString();
                
            }
        }
        
    }
    
   public void ordenarPorDuracionDescendente() {

        System.out.println("////LISTAR PELICULAS ORDENADAS DE FORMA DESCENDENTE SEGUN LA DURACION////\n");
        Collections.sort(peliculas, compararDuracionDescendente);
        mostrarPelicula();
    }

    public void ordenarPorDuracionAscendente() {

        System.out.println("////LISTAR PELICULAS ORDENADAS DE FORMA ASCENDENTE SEGUN LA DURACION////\n");
        Collections.sort(peliculas, compararDuracionAscendente);
        mostrarPelicula();
    }

    private void ordenarPorTitulo() {

        System.out.println("////LISTAR PELICULAS POR TITULO ALFABETICAMENTE////\n");
        Collections.sort(peliculas, compararPorTituloAlf);
        mostrarPelicula();
    }

    private void ordenarPorDirector() {

        System.out.println("////ORDENAR PELICULAS POR DIRECTOR ALFABETICAMENTE////\n");
        Collections.sort(peliculas, compararPorDirectorAlf);
        mostrarPelicula();
    }

    private static Comparator<Pelicula> compararDuracionDescendente = new Comparator<Pelicula>() {

     @Override
        public int compare(Pelicula p1, Pelicula p2) {
            double delta = p2.getHora()- p1.getHora();
            if (delta > 0) {
                return 1;
            }
            if (delta < 0) {
                return -1;
            }
            return 0;
        }
    };

    private static Comparator<Pelicula> compararDuracionAscendente = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            double delta = p1.getHora()- p2.getHora();
            if (delta > 0) {
                return 1;
            }
            if (delta < 0) {
                return -1;
            }
            return 0;
        }
    };

    private static Comparator<Pelicula> compararPorTituloAlf = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getTitulo().compareTo(p2.getTitulo());
        }

    };

    private static Comparator<Pelicula> compararPorDirectorAlf = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula p1, Pelicula p2) {

            return p1.getDirector().compareTo(p2.getDirector());
        }

    };

    
    
    
}
