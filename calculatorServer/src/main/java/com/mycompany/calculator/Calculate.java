/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;
import com.mycompany.shared.SharedInterface;
import groovy.lang.MissingMethodException;
import org.codehaus.groovy.control.MultipleCompilationErrorsException;
import groovy.lang.MissingPropertyException;
import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author admin
 */
public class Calculate extends UnicastRemoteObject implements SharedInterface{
        public Calculate() throws RemoteException{
          super();
          //nous pouvons utiliser super(int port) pour indiquer le num de porte
       }

    @Override
    public double evaluateExpression(String expression) {
        Binding binding = new Binding();
        GroovyShell shell = new GroovyShell(binding);

        binding.setVariable("Math", Math.class);
        Object result = shell.evaluate(expression);

        if (result instanceof Number) {
            return ((Number) result).doubleValue();
        } else {
            throw new UnsupportedOperationException("Invalid expression result");
        }        
    }


}
