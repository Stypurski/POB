package Exercícios.Lista04;

import java.util.Scanner;

public class ArmazenamentoELeituraInversa{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[5];

        System.out.print("Insira os numeros que deseja que estejam no seu vetor: ");
        for(int i=0; i<5; i++){
            vetor[i] = sc.nextInt();
        }

        System.out.print("Vetor inserido invertido: ");
        for(int i = 4; i>=0; i--){
            System.out.println(vetor[i]);
        }

        sc.close();
        
    }
}

