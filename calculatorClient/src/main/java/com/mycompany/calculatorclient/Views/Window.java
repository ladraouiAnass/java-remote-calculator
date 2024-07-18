/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculatorclient.Views;

import com.mycompany.shared.SharedInterface;
import java.net.MalformedURLException;
import java.rmi.*;
import javax.swing.*;
/**
 *
 * @author admin
 */
public class Window extends JFrame{
      Panel pan ;
      public SharedInterface conn;
      public String ip;

      public Window() {
          try{  
                   this.ip = JOptionPane.showInputDialog(null, "entrez l'adress ip de serveur: ");    
                   this.conn = (SharedInterface)Naming.lookup("rmi://"+this.ip+":9999/expression");
                    this.pan = new Panel(this);
                    this.add(this.pan);
                    this.setSize(380,500);
                    this.setResizable(false);
                    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.setLocationRelativeTo(null);
                    this.setVisible(true);
          }catch(NotBoundException| MalformedURLException|RemoteException e){
                   JOptionPane.showMessageDialog(null, "server not connected");
          }

      }
}
