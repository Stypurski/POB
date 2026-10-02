package Exercícios.Lista08.FormasGeométricasCálculoÁrea.controle;

import Exercícios.Lista08>FormasGeométricasCálculoÁrea.dominio.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("QUADRADO: ");
        System.out.println("Insira a medida do lado: ");
        double lado = sc.nextDouble();

        System.out.println("RETANGULO: ");
        System.out.println("Insira a altura: ");
        double altura = sc.nextDouble();
        System.out.println("Insira a largura: ");
        double largura = sc.nextDouble();

        System.out.println("CIRCULO: ");
        System.out.println("Insira o raio: ");
        double raio = sc.nextDouble();

        FiguraGeometrica[] figuras = new FiguraGeometrica[3];

        figuras[0]= new Quadrado(lado);
        figuras[1] = new Retangulo(altura, largura);
        figuras[2] = new Circulo(raio);

        for(int i =0;i<3; i++){
            double area = figuras[i].calcularArea();
            System.out.println("A area da figura" + (i+1) + "corresponde a: " + df.format(area));
        }

        sc.close();

    }
}
