/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Productos;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class ServicioTienda {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        HashMap<String,Double> producto = new HashMap();
        
        public void Menu() {

        boolean salir = true;

        do {

            System.out.println("Selecciones la operacion a realizar: \n1) Crear producto \n2) Modificar producto \n3) Eliminar producto \n4) Listar productos \n5) Salir");
            int op = leer.nextInt();

            switch (op) {

                case 1:

                    crearProducto();
                    break;

                case 2:

                    modificarProducto();
                    break;

                case 3:

                    eliminarProducto();
                    break;

                case 4:

                    mostrarProducto();
                    break;

                case 5:

                    salir = false;
                    break;

            }

        } while(salir) ;

    }
        
        public void crearProducto(){
            
           
            String aceptar = "y";
            
            System.out.println("Bienvenido a la administracion de su tienda");
            
            while(aceptar.equalsIgnoreCase("y")){
                
                
                System.out.println("Ingrese un producto");
                String prod = leer.next().toUpperCase();
                System.out.println("Ahora ingrese el precio del producto");
                double precio = leer.nextDouble();
                
                System.out.println("Por ultimo desea ingresar otro producto");
                System.out.println("y/n");
                aceptar = leer.next();
                
                
                producto.put(prod,precio);
 
                }
          
        }
        
        private void modificarProducto() {

        mostrarProducto();

        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombreP = leer.next().toUpperCase();

        if (producto.containsKey(nombreP)) {

            System.out.print("Ingrese el nuevo nombre del producto: ");
            String nomActualizado = leer.next().toUpperCase();
            System.out.print("Ingrese el nuevo precio del producto: ");
            double precioActualizado = leer.nextDouble();

            producto.remove(nombreP);

            producto.put(nomActualizado, precioActualizado);

        }
    }

    private void eliminarProducto() {

        mostrarProducto();

        System.out.print("Ingrese el producto a eliminar: ");
        String nomProd = leer.next().toUpperCase();

        if (producto.containsKey(nomProd)) {

            producto.remove(nomProd);

        }
    }
    public void mostrarProducto(){
            
            producto.entrySet().forEach(entry->{
			System.out.println(entry.getKey() + " = " + entry.getValue());  
		}); 
                
        }
     
        
        
}