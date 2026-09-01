package Exercícios.Lista04;

import java.util.Scanner;

public class SeparacaoParesImpares{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[10];

        System.out.print("Insira os numeros que deseja no seu vetor: ");
        for(int i = 0; i<10; i++){
            vetor[i] = sc.nextInt();
        }

        int contP = 0;
        int contI = 0;

        for(int i = 0; i<10; i++){
            if(vetor[i] % 2 == 0){
                contP++;
            }else{
                contI++;
            }
        }

        int vetorP[] = new int[contP];
        int vetorI[] = new int[contI];

        contP=0;
        contI=0;

        for(int i = 0; i<10; i++){
            if(vetor[i] % 2 == 0){
                vetorP[contP] = vetor[i];
                contP++;
            }else{
                vetorI[contI] = vetor[i];
                contI++;
            }
        }

        System.out.println("Os numeros do novo vetor formado apenas pelos digitos pares do vetor inserrido sao: ");
        for(int i = 0; i<contP ; i++){
            System.out.println(vetorP[i]);
        }

        System.out.println("Os numeros do novo vetor formado apenas pelos digitos impares do vetor inserrido sao: ");
        for(int i = 0; i<contI ; i++){
            System.out.println(vetorI[i]);
        }

    sc.close();

    }
}
