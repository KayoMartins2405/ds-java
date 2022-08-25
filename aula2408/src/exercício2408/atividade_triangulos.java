/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercício2408;

import javax.swing.JOptionPane;

public class atividade_triangulos {
    
    public static void main(String[] args) {
   
   
        
   int   a = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de A"));
   int   b = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de B"));
   int   c = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de C"));
    
  if((a==b)&&(b==c)&&(c==a)){
      JOptionPane.showMessageDialog(null,"Equilátero");
  
  }else if((a!=b)&&(b!=c)&&(c!=a)){
     JOptionPane.showMessageDialog(null,"Escaleno");
  
  }else if((a==b)||(a==c) || (b==c)){
      JOptionPane.showMessageDialog(null,"Isósceles");
    
    
    }

  


}
}