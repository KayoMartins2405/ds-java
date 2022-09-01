/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3108;

/**
 *
 * @author CAMARGO
 */
public class para {
    public static void main(String[] args) {
      
        int totalpar=0;
       int totalimpar =0;
      
       for(int i =0;i <= 100; i++){
           
           if(i % 2 ==0){
               totalpar = totalpar +1;
               //System.out.println(i +"par");
           }else{
               totalimpar = totalimpar +1;
               //System.out.println(i +"ímpar"); 
    
           }
}
     System.out.println(""); 
      System.out.println("total se números pares " + totalpar); 
      System.out.println("total se números ímpar " + totalimpar);
    
    
    }
}
