/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercício2408;

import javax.swing.JOptionPane;

public class Ordem {
    public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de B"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de C"));
        
    if((a<b)&&(b<c)&&(c>a)){
            JOptionPane.showMessageDialog(null,"A B C");
        
    }else if((a<b)&&(b>c)&&(c>a)){
            JOptionPane.showMessageDialog(null,"A C B");
        
    }else if((a>b)&&(b<c)&&(c>a)){
          JOptionPane.showMessageDialog(null,"B A C");
    
    }else if((a>b)&&(b<c)&&(c<a)){
         JOptionPane.showMessageDialog(null,"B C A");
    
    }else if((c<a)&&(a>c)&&(b>a)){
         JOptionPane.showMessageDialog(null,"C A B");
    
    }else if((a>b)&&(b>c)&&(c<a)){
          JOptionPane.showMessageDialog(null,"C B A");
}
}
}