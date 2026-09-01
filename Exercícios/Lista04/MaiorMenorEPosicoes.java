package Exercícios.Lista04;

import java.util.Scanner;

public class MaiorMenorEPosicoes{
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int vetor[] =  new int[10];

        System.out.print("Insira os numeros que deseja que estejam no seu vetor: ");
        for(int i = 0; i<10 ; i++){
            vetor[i] = sc.nextInt();
        }

        int maior = vetor[0];
        int menor = vetor[0];
        int pMaior = 0;
        int pMenor = 0;

        for(int i= 1; i<10; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
                pMaior = i;
            }
            if(vetor[i] < menor){
                menor = vetor[i];
                pMenor = i;
            }
        }

        System.out.println("O maior numero do seu vetor e: " + maior + "E sua respectiva posicao e: " + pMaior);
        System.out.println("O menor numero do seu vetor e: " + menor + "E sua respectiva posicao e: " + pMenor);
     
        sc.close();

    }
}