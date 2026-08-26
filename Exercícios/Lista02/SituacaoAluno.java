package Exercícios.Lista02;

import java.util.Scanner;
import java.text.DecimalFormat; 

public class SituacaoAluno{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Insira a primeira nota do aluno: ");
        double nota1 = sc.nextDouble();

        System.out.print("Insira a segunda nota do aluno: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media >= 7.0){

            System.out.println("Aluno Aprovado. \n Media: " +df.format(media));
        }else{
            if(media >= 5.0){

                System.out.println("Aluno em recuperacao. \n Media: "+ df.format(media));
            }else{

                System.out.print("Aluno Reprovado. \n Media: " + df.format(media));
            }

        }

        sc.close();

    }
}