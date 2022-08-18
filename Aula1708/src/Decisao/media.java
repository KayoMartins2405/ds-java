/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decisao;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
     Scanner x = new Scanner(System.in);
       System.out.println("digite sua média: ");
            double media=x.nextDouble(); 
        
        if(media<5) {
            System.out.println("retido");
        }else if(media <7){
            System.out.println("regular");
        }else if(media <=10){
            System.out.println("MB");
        }else{ 
            System.out.println("Erro");
        
        }
    }
}
