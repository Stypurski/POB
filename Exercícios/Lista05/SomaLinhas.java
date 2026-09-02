package Exercícios.Lista05;

import java.util.Scanner;

public class SomaLinhas {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
    
        int matriz[][] = new int[4][3];

        System.out.print("Insira os numeros da sua matriz: ");
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                System.out.print("Elemento da linha " + i + "coluna " + j + ":");
                matriz[i][j] = sc.nextInt();
            }
        }

        int vetSoma[] = new int[4];
        int aux=0;
        int cont = 0;

        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                aux += matriz[i][j];           
            }
            vetSoma[cont] = aux;
            cont++;
            aux=0;
        }

        for(int i=0; i<4; i++){
            System.out.println("A soma dos elemetos da linha " + i + "e: " +vetSoma[i]);
        }

        sc.close();

    }
    
}
