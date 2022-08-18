
package Atividades1708;

import java.util.Scanner;

import javax.swing. JOptionPane;



public class JoptionPane {
    
    public static void main(String[] args) {

        try{

        int a = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("digite o valor de B : "));

        int res =a + b;

        JOptionPane.showMessageDialog(null,"o resultado da soma é: "+res);

        } catch(Exception e) {
        JOptionPane.showMessageDialog(null,"Erro 101");
    }
}
}