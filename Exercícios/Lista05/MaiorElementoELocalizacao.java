package Exercícios.Lista05;

import java.util.Scanner;

public class MaiorElementoELocalizacao {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[3][4];

        System.out.print("Insira os numeros da sua matriz: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print("Elemento da linha " + i + "coluna " + j + ":");
                matriz[i][j] = sc.nextInt();
            }
        }

        int maior = matriz[0][0];
        int linhaMaior =0;
        int colunaMaior=0;

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                if(matriz[i][j] > maior){
                   maior = matriz[i][j];
                   linhaMaior = i;
                   colunaMaior = j;
                }
            }
        }

        System.out.print("O maior elemento presente no vetor preenchido e: " + maior + "Que esta na linha: " + linhaMaior + "e coluna: " + colunaMaior);

        sc.close();
    }
    
}
