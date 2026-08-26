package Exercícios.Lista02;

import java.util.Scanner;

public class MaiorD3{

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Insira o primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.print("Insira o segundo numero: ");
        int n2 = sc.nextInt();

        System.out.print("Insira o terceiro numero: ");
        int n3 = sc.nextInt();

        int maior = n1;

        if(n2 > maior){
            maior = n2;
        }else{
            if(n3 > maior){
                maior = n3;
            }
        }

        System.out.println("O maior numero e: " + maior);

        sc.close();

    }
}