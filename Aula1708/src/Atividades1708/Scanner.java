
package Atividades1708;

import java.util.Scanner;


public class Scanner{
    
    public static void main(String[] args) {
      Scanner x = new java.util.Scanner(System.in);

            
            System.out.println("digite um número: ");
            int a=x.nextInt();

            System.out.println("Digite outro número: ");
            int b=x.nextInt();

            int res = a + b;

            System.out.println("seu resultado é: "+res);
            }
}