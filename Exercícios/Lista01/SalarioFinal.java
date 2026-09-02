package Exercícios.Lista01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioFinal {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.print("Insira o valor da hora de trabalho: ");
        double vHora = sc.nextDouble();

        System.out.print("Insira a quantidade de horas trabalhadas no mes: ");
        double tHoras = sc.nextDouble();

        double salarioBruto = tHoras * vHora; 
        double descINSS = salarioBruto * 0.10; 
        double salarioFinal = salarioBruto - descINSS;

        System.out.println("O valor do salario bruto e de: " + df.format(salarioBruto));
        System.out.println("O salario final, pos descontos fica: " + df.format(salarioFinal));

        sc.close();

    }
}
