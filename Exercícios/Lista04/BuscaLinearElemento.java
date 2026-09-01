package Exercícios.Lista04;

import java.util.Scanner;

    public class BuscaLinearElemento{

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            int vetor[] = new int[6];

            System.out.print("Insira os numeros que deseja no seu vetor: ");
            for(int i = 0; i<6 ; i++){

                vetor[i]  = sc.nextInt();

            }

            int buscado;

            System.out.print("Insira o numero que deseja buscar: ");
            buscado = sc.nextInt();

            boolean encontrado = false;
            for(int i = 0; i<6 ; i++){

                if(vetor[i] == buscado){
                    System.out.print("O valor buscado esta presente no vetor, e encontra-se na posicao " + i + "do vetor.");
                    encontrado = true;
                    break;
                }
            }

            if(!encontrado){
                System.out.print("O indice buscado nao existe no vetor!");
            }

         sc.close();

    }
}

