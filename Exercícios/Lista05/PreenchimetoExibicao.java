package Exercícios.Lista05;

import java.util.Scanner;

public class PreenchimetoExibicao{
  
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          int matriz[][] = new int[3][3];

          System.out.print("Insira os numeros da sua matriz: ");
          for(int i=0; i<3; i++){
               for(int j=0; j<3; j++){
                    System.out.print("Elemento linha " + i + "coluna " + j + ":");
                    matriz[i][j] = sc.nextInt();
               }
          }

          System.out.print("A matriz preenchida corresponde a: ");
          for(int i=0; i<3; i++){
               for(int j=0; j<3; j++){
                    System.out.print(matriz[i][j] + " ");
               }
               System.out.println();
          }
     
          sc.close();
          
     }  
}