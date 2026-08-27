package Exercícios.Lista03;

import java.util.Scanner;

public class Tabuada{

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
    
        System.out.print("Insira o umero desejado: ");
        int numero = sc.nextInt();

        System.out.println("Tabuada de 0 a 10 do numero " + numero + ":");

        for(int i = 0; i<= 10;i++){

            System.out.println(numero + "x" + i + "=" + (numero * i));

        }

        sc.close();

    }
}