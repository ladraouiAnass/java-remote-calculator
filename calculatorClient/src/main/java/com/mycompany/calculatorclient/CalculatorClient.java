/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculatorclient;
import com.mycompany.calculatorclient.Views.Window;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author admin
 */
public class CalculatorClient {

    public static void main(String[] args) throws UnsupportedLookAndFeelException, NotBoundException, MalformedURLException, RemoteException {
        UIManager.setLookAndFeel(new FlatMacDarkLaf());
        new Window();
    }
}
