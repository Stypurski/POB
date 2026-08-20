package exercicios.exercicio05;

import java.util.Scanner;

public class ConversorTempo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o tempo em segundos a ser convertido: ");
        int segundosTotal = sc.nextInt();

        int horas = segundosTotal / 3600;
        int resto = segundosTotal % 3600;
        int minutos = resto / 60;
        resto = resto % 60;
        int segundos = resto;

        System.out.println("Apos a conversao final se tem: " + horas + " horas, " + minutos + " minutos, 3665" + segundos + " segundos");

        sc.close();


    }
    
}
