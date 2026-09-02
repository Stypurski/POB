package Exercícios.Lista01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ConversorTemperatura {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Digite a temperatura em Celsius: ");
        double c = sc.nextDouble();

        double convertido = ( c * 1.8) + 32;

        System.out.print("A temperatura digitada convertida para Fahrenheit: " + df.format(convertido));

        sc.close();


    }
}
