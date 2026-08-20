package exercicios.exercicio01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class mediaNotas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        //teria como pedir as tres notas de uma vez so??
        System.out.print("Digite a primeira nota:");
        double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = sc.nextDouble();

        double somaNotas = n1 + n2 + n3;
        double mediaNotas = somaNotas / 3;

        System.out.print("A media simples das notas é: " + df.format(mediaNotas));

        sc.close();


    }
}