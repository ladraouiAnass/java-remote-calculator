/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculatorclient.Controllers;

import com.mycompany.calculatorclient.Views.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import groovy.lang.MissingMethodException;
import org.codehaus.groovy.control.MultipleCompilationErrorsException;
import groovy.lang.MissingPropertyException;
import groovy.lang.Binding;
import groovy.lang.GroovyShell;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author admin
 */
public class PnaControler {
    
    public static void chiffre(Panel pan,JButton butt){
          butt.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e) {
                   String text = pan.result.getText();
                   String chiff = butt.getText();
                   pan.result.setText(text+chiff);
                   pan.revalidate();
              }
          
          });
    }
    
    public static void equal(Window window,Panel pan,JButton butt){
          butt.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e) {
                  String expression = pan.result.getText();
                    try {
                        double resulta  = window.conn.evaluateExpression(expression);
//                       double resulta = evaluateExpression(expression);
                       System.out.println("Result: " + resulta);
                       pan.result.setText(""+resulta);
                  } catch (Exception exx) {
                        System.err.println("JavaScript engine not available: " + exx.getMessage());
                        pan.result.setText("invalid expression");
                 } 
                   finally{
                        pan.revalidate();
                    }                 
              }
          
          }); 
    }
    
    public static void ac(Panel pan,JButton butt){
          butt.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e) {
                  pan.result.setText("");
              }
          
          });
    }
        public static void operation(Panel pan,JButton butt){
          butt.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e) {
                  String op = butt.getText();
                  String old  = pan.result.getText();
                  pan.result.setText(old+op);
                  pan.revalidate();
              }
          
          });
    }
//    public static double evaluateExpression(String expression) {
//        Binding binding = new Binding();
//        GroovyShell shell = new GroovyShell(binding);
//
//        binding.setVariable("Math", Math.class);
//        Object result = shell.evaluate(expression);
//
//        if (result instanceof Number) {
//            return ((Number) result).doubleValue();
//        } else {
//            throw new UnsupportedOperationException("Invalid expression result");
//        }
//    }
}
