package Exercícios.Lista01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculadoraGeometrica {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");

        System.out.print("Insira quantos centimetros possui a base do retangulo: ");
        double base = sc.nextDouble();

        System.out.print("Insira quantos centrimetros de altura possui o retangulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("A area do seu retangulo e: " + df.format(area));
        System.out.println("O perimetro do seu retangulo corresponde a: " + df.format(perimetro));

        sc.close();

    }
    
}
