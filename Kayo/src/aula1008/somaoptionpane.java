/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1008;

import javax.swing.JOptionPane;

public class somaoptionpane {
    
public static void main(String[] args) {

    int a= Integer.parseInt(JOptionPane.showInputDialog("digite o valor de A: "));
    int b= Integer.parseInt(JOptionPane.showInputDialog("digite o valor de B: "));        


    int res = a + b;
            
    JOptionPane.showMessageDialog(null,"O valor da soma é: "+res);
}catch(Exception e){
JOptionPane.showMessageDialog(null,"caractere inválido);

}
}