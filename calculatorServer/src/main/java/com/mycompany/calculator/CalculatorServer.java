/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


/**
 *
 * @author admin
 */
public class CalculatorServer {
    public static void main(String[] args) {
        try {
                LocateRegistry.createRegistry(9999); 
                Calculate calc = new Calculate();
                System.out.println("enregistrement de l\'objet avec l\'url");
                Naming.bind("rmi://0.0.0.0:9999/expression", calc);
                System.out.println("serveur lance\nattete d\'invocations");
        } catch (Exception e) {
            System.out.println("le message d'erreur: "+e);
        }        
    }

}
