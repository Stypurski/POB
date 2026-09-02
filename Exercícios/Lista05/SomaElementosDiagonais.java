package Exercícios.Lista05;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SomaElementosDiagonais {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        double matriz[][] = new double[4][4];

        System.out.print("Insira os numeros da sua matriz: ");
        for(int i=0; i<4; i++){
            for(int j = 0; j<4; j++){
                System.out.print("Elemento da linha " + i + "coluna " + j + ":");
                matriz[i][j] = sc.nextDouble();
            }
        }

         double soma = 0;
         for(int i=0; i<4; i++){
            for(int j = 0; j<4; j++){
               if(i == j){
                soma += matriz[i][j];
               }
            }
        }

        System.out.print("A soma dos elementos da diagonal principal da matriz inserida e: " + df.format(soma));
    
     sc.close();

    }
    
}
