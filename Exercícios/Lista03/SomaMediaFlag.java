package Exercícios.Lista03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SomaMediaFlag{

    public static void main(String[] args){

        Scanner sc= new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        int numero = 0;
        int contador = 0;
        int soma = 0;

        System.out.print("Insira um numero: ");
        numero = sc.nextInt();

        while(numero >= 0){

            contador++;
            soma += numero;

            System.out.print("Insira um numero: ");
            numero = sc.nextInt();

        }

        double media = (double) soma / contador;

        System.out.println("A soma dos numeros inseridos e: " + soma);
        System.out.println("A media dos numeros inseridos e: " + df.format(media));

        sc.close();

    }
}
