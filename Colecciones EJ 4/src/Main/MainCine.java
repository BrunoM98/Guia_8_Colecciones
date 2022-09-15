/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Service.ServiceCine;

/**
 *
 * @author Bruno
 */
public class MainCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ServiceCine sc = new ServiceCine();
        
        sc.inicializar();
    }
    
}
