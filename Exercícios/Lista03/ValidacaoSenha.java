package Exercícios.Lista03;

import java.util.Scanner;

public class ValidacaoSenha{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a senha: ");
        int senha = sc.nextInt();

        System.out.print("Valide sua senha: ");
        int validador = sc.nextInt();

        while(validador != senha){

            System.out.print("Senha invalida! \n Insira novamente: ");
            validador = sc.nextInt();

        }

        System.out.println("Senha validada! ");


        sc.close();

        }
    }
