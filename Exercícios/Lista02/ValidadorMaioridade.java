package Exercícios.Lista02;

import java.util.Scanner;

public class ValidadorMaioridade {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o ano de nascimento do usuario: ");
        int nascimento = sc.nextInt();

        System.out.print("Insira o ano atual: ");
        int atual = sc.nextInt();

        int idade = atual - nascimento;

        if(idade >= 18){
            System.out.print("O usuario é maior de idade!");
        }else{
            System.out.print("O usuario e menor de idade!");
        }

        sc.close();
        
    }

}
