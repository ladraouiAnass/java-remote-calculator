/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculatorclient.Views;
import static com.mycompany.calculatorclient.Controllers.PnaControler.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;
/**
 *
 * @author admin
 */
public class Panel extends JPanel{
      public JTextField result;
      
      public Panel(Window window){
          this.result = new JTextField();
          this.result.setPreferredSize(new Dimension(330,60));
         this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
         
         
         JPanel pan1 = new JPanel(new FlowLayout());
               pan1.add(this.result);
            
          JPanel pan2 = new JPanel(new FlowLayout());
//                  JLabel vide = new JLabel("");
//                  vide.setPreferredSize(new Dimension(80,60));
                  JButton paDroit = new JButton("(");
                  paDroit.setPreferredSize(new Dimension(80,60));
                  JButton paGauche = new JButton(")");
                  paGauche.setPreferredSize(new Dimension(80,60));
                  JButton delete  = new JButton("<html><body><h2>AC</h2></body></html>");
                  delete.setPreferredSize(new Dimension(160,60));
//                  pan2.add(vide);
                  pan2.add(paDroit);
                  pan2.add(paGauche);
                  pan2.add(delete);
          
           JPanel pan3 = new JPanel(new FlowLayout());
                    JButton butt7  = new JButton("7");
                    butt7.setPreferredSize(new Dimension(80,60));
                    JButton butt8  = new JButton("8");
                    butt8.setPreferredSize(new Dimension(80,60));
                    JButton butt9  = new JButton("9");
                    butt9.setPreferredSize(new Dimension(80,60));
                    JButton buttDevide  = new JButton("/");
                    buttDevide.setPreferredSize(new Dimension(80,60));
                    
                    pan3.add(butt7);
                    pan3.add(butt8);
                    pan3.add(butt9);
                    pan3.add(buttDevide);
                    
           
           
            JPanel pan4 = new JPanel(new FlowLayout());
                    JButton butt4  = new JButton("4");
                    butt4.setPreferredSize(new Dimension(80,60));
                    JButton butt5  = new JButton("5");
                    butt5.setPreferredSize(new Dimension(80,60));
                    JButton butt6  = new JButton("6");
                    butt6.setPreferredSize(new Dimension(80,60));
                    JButton buttTime  = new JButton("*");
                    buttTime.setPreferredSize(new Dimension(80,60));
                    
                    pan4.add(butt4);
                    pan4.add(butt5);
                    pan4.add(butt6);
                    pan4.add(buttTime);
            
            
             JPanel pan5 = new JPanel(new FlowLayout());
                    JButton butt1  = new JButton("1");
                     butt1.setPreferredSize(new Dimension(80,60));
                    JButton butt2  = new JButton("2");
                     butt2.setPreferredSize(new Dimension(80,60));
                    JButton butt3  = new JButton("3");
                     butt3.setPreferredSize(new Dimension(80,60));
                    JButton buttMinus  = new JButton("-");
                     buttMinus.setPreferredSize(new Dimension(80,60));
                     
                    pan5.add(butt1);
                    pan5.add(butt2);
                    pan5.add(butt3);
                    pan5.add(buttMinus);                     
             
              JPanel pan6 = new JPanel(new FlowLayout());
                    JButton buttPoint  = new JButton(".");
                    buttPoint.setPreferredSize(new Dimension(80,60));
                    JButton butt0  = new JButton("0");
                    butt0.setPreferredSize(new Dimension(80,60));
                    JButton buttEqual  = new JButton("=");
                    buttEqual.setPreferredSize(new Dimension(80,60));
                    JButton buttPlus  = new JButton("+");
                    buttPlus.setPreferredSize(new Dimension(80,60));
              
                    pan6.add(buttPoint);
                    pan6.add(butt0);
                    pan6.add(buttEqual);
                    pan6.add(buttPlus);                             
                    
              this.add(pan1);
              this.add(pan2);
              this.add(pan3);
              this.add(pan4);
              this.add(pan5);
              this.add(pan6);
              
              
              chiffre(this,butt1);
              chiffre(this,butt2);
              chiffre(this,butt3);
              chiffre(this,butt4);
              chiffre(this,butt5);
              chiffre(this,butt6);
              chiffre(this,butt7);
              chiffre(this,butt8);
              chiffre(this,butt9);
              chiffre(this,butt0);
              chiffre(this,paDroit);
              chiffre(this,paGauche);
              chiffre(this,buttPoint);
              
              operation(this,buttPlus);
              operation(this,buttMinus);
              operation(this,buttTime);
              operation(this,buttDevide);
              
              ac(this,delete);
              
              equal(window,this,buttEqual);
      }
      
}
