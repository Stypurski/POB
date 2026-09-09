package Exercícios.Lista06.ClasseCirculoMétodoRetornoValor.controle;

import Exercícios.Lista06.ClasseCirculoMétodoRetornoValor.dominio.Circulo;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        Circulo tam = new Circulo();

        System.out.print("Insira o valor do raio: ");
        tam.raio = sc.nextDouble();

        double area = tam.calcularArea();
        double perimetro = tam.calcularPerimetro();

        System.out.println("A area do seu circulo corresponde a: " + df.format(area));
        System.out.println("O perimetro do seu circulo corresponde a: " + df.format(perimetro));

        sc.close();

    }
}
