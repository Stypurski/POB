package Exercícios.Lista04;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MediaTurmaAlunosAcima{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        double vetor[] = new double[8];

        double soma = 0;
        for(int i = 1; i<8; i++){
            System.out.print("Insira a nota do aluno numero " + (i + 1) + ":");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        double media = soma/8;

        int cont = 0;

        for(int i=0; i<8; i++){
            if(vetor[i] >= media){
            cont++;
            }
        }

        int alunosAcima[] = new int[cont];
        double notasAcima[] = new double[cont];
        for(int i=0; i<8; i++){
            if(vetor[i] > media){

                    int j = 0;
                    alunosAcima[j] = i;
                    notasAcima[j] = vetor[i];
                

            }
        }

        System.out.println("A media aritimetica geral fica em: " + df.format(media));

        System.out.println("Os seguintes alunos ficaram acima da media, com as seguintes notas: ");
        for(int i = 0; i<5; i++ ){

            System.out.println("Aluno: " + alunosAcima[i] + "Nota: " + df.format(notasAcima[i]));

        }

        sc.close();
    }
}