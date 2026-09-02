package Exercícios.Lista05;

import java.util.Scanner;

public class MatrizTransporta {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int matrizA[][] = new int[2][3];

        System.out.print("Insira os numeros da sua matriz: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print("Elemento da linha " + i + "coluna " + j + ":");
                matrizA[i][j] = sc.nextInt();
            }
        }

        int matrizTrans[][] = new int[3][2];
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                matrizTrans[i][j] = matrizA[j][i];
            }
        }

        System.out.print("Sua matriz invertida fica: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print(matrizTrans[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
    
}
