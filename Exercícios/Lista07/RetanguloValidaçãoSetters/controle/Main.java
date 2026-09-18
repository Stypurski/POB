package Exercícios.Lista07.RetanguloValidaçãoSetters.controle;

import Exercícios.Lista07.RetanguloValidaçãoSetters.dominio.Retangulo;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Insira a largura do seu retangulo: ");
        double largura1 = sc.nextDouble();

        System.out.print("Insira a altura do seu retagulo: ");
        double altura1 = sc.nextDouble();

        Retangulo forma1 = new Retangulo(largura1, altura1);

        double area = forma1.calcularArea();
        double perimetro = forma1.calcularPerimetro();

        System.out.println("A area do retangulo com as medidas inseridas corresponde a: " + df.format(area));
        System.out.println("O perimetro do retangulo com as medidas inseridas corresponde a: " + df.format(perimetro));

        sc.close();


    }
    
}
