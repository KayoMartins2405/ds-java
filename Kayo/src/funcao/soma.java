/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcao;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class soma {
    
void soma(){
    try{
  int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
  int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
  
  int res = a + b;
  JOptionPane.showMessageDialog(null, "o valor da soma"+res);
}catch(Exception e){
JOptionPane.showMessageDialog(null, "caractere inválido");
}
}


    void sub(){
try{
  int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
  int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
  
  int res = a - b;
  JOptionPane.showMessageDialog(null, "o valor da subtração: "+res);
}catch(Exception e){
JOptionPane.showMessageDialog(null, "caractere inválido");
}
}
    void mult() {
try{
  int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
  int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
  
  int res = a * b;
  JOptionPane.showMessageDialog(null, "o valor da multiplicação: "+res);
}catch(Exception e){
JOptionPane.showMessageDialog(null, "caractere inválido");
}
    }  
   void Div() {
    try{
  int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
  int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
  
  int res = a / b;
  JOptionPane.showMessageDialog(null, "o valor da divisão"+res);
}catch(Exception e){
JOptionPane.showMessageDialog(null, "caractere inválido");
}
} 
    }
        