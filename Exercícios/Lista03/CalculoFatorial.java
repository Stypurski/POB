package Exercícios.Lista03;

import java.util.Scanner;

public class CalculoFatorial {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o numero que deseja calcular o fatorial: ");
        int n = sc.nextInt();

        int aux = n;
        long resultado = 1;

        while(aux > 1){

            resultado *= aux;
            aux--;
            
        }

        System.out.println("O fatorial de " + n + " e: " + resultado);

        sc.close();


    }


}
