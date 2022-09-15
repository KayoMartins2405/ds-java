/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade1;

/**
 *
 * @author CAMARGO
 */
public class Enquanto {
    public static void main(String[] args) {
        
        int i =0;
       int totalpar =0;
       int totalimpar =0;
       
       while (i <= 100) {
      int div = i % 2;
      
       
       if (div ==0){
        System.out.println("par"+i);
        totalpar= totalpar + i;
       }
       else if (div==1){
        System.out.println("impar"+i);
       totalimpar= totalimpar + i;
       }    
     
       System.out.println("soma par é igual a:" + totalpar);
       System.out.println("A soma dos números ímpares é igual a:" +totalimpar );
         i++;
       }
    }
}
