package Exercícios.Lista06.BancariaParâmetroValidaçõesSimples.controle;

import Exercícios.Lista06.BancariaParâmetroValidaçõesSimples.dominio.ContaBancaria;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        ContaBancaria conta1 = new ContaBancaria();

        System.out.print("Insira o nome do titular da conta: ");
        conta1.titular = sc.nextLine();

        System.out.print("Insira o numero da conta: ");
        conta1.numeroConta = sc.nextLine();

        int controle = -1;
            
       while(controle!=0){

         System.out.println("OPERACOES DISPONIVEIS: ");
            System.out.println("1: DEPOSITO ");
            System.out.println("2: SAQUE ");
            System.out.println("3: CONSULTA DE SALDO ");
            System.out.println("0: SAIR ");
            System.out.print("Insira a operacao que deseja: ");
            controle = sc.nextInt();

        switch(controle){

            case 1: 
                System.out.println("Insira o valor que deseja depositar: ");
                double deposito = sc.nextDouble();
                conta1.depositar(deposito);
                break;

            case 2:
                System.out.print("Insira o valor que deseja sacar: ");
                double saque = sc.nextDouble();
                conta1.sacar(saque);
                break;
            
            case 3:
                conta1.consultarSaldo();
                break;
            
            case 0: 
                System.out.print("Execucao encerrada: ");
                break;
                 
            
            default: 
            System.out.print("Valor digitado invalido.");
            return;

        }
       }

        sc.close();

        }

    }
