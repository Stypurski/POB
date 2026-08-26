package Exercícios.Lista02;

import java.util.Scanner;

public class ClassificacaoTriangulo {

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Insira o valor do primeiro lado do triangulo: ");
        int lA = sc.nextInt();

        System.out.print("Insira o valor do segundo lado do triangulo: ");
        int lB = sc.nextInt();

        System.out.print("Insira o valor do terceiro lado do triangulo: ");
        int lC = sc.nextInt();

        if(lA == lB && lB == lC){
            System.out.print("O triangulo e equilatero");

    }else{
            if(lA == lB || lB == lC || lA == lC){

                System.out.print("O triangulo e isosceles");

            }else{

                System.out.print("O triangulo e escaleno");
            }
        }

        sc.close();

    }
    
}
