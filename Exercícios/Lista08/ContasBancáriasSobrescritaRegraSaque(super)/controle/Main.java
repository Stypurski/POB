package Exercícios.Lista08.ContasBancáriasSobrescritaRegraSaque.controle;

import Exercícios.Lista08.ContasBancáriasSobrescritaRegraSaque.dominio.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Insira os dados principais da conta: ");
        System.out.println("\tNumero: ");
        String numero = sc.nextLine();
        System.out.println("\tSaldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Insira o tipo de conta que deseja: \n\t1-CONTA POUPANCA \n\t 2-CONTA CORRENTE \n\t QUALQUER OUTRO PARA SAIR");
        int escolha = sc.nextInt();
        sc.nextInt();

        double valor;
        Conta nova = null;

        switch(escolha){

            case 1:
                System.out.println("Insira a taxa de rendimento da conta: ");
                double taxaRendimento = nextDouble();
                ContaPoupanca nova = new ContaPoupanca(numero, saldo, taxaRendimento);
                break;
            
            case 2: 
                System.out.println("Insira o limite do cheque especial: ");
                double limiteChequeEspecial = nextDouble();
                ContaCorrente nova = next ContaCorrente(numero, saldo, limiteChequeEspecial);
                break;

            default:
                System.out.print("valor escolhido invalido");
                break;

        }

        System.out.print("Insira o tipo de operacao que deseja: \n\t1-DEPOSITAR \n\t2-SACAR");
        int operacao= nextInt();
        if(escolha== 1){
            System.out.println("\n\t3-APLICAR RENDIMENTO");
        }
        System.out.println("\n\t QUALQUER OUTRO PARA SAIR");

        Switch(operacao){
            case 1:
                    System.out.print("Insira o valor do depósito: R$ ");
                    double valorDep = sc.nextDouble();
                    nova.depositar(valorDep);
                    System.out.println("Saldo atual: R$ " + df.format(nova.getSaldo()));
                    break;

            case 2:
                    System.out.print("Insira o valor do saque: R$ ");
                    double valorSaque = sc.nextDouble();
                    nova.sacar(valorSaque);
                    System.out.println("Saldo atual: R$ " + df.format(conta.getSaldo()));
                    break;
                
            if(escolha== 1){
                case 3: 
                ((ContaPoupanca)nova).aplicarRendimento();
                break;

            }

            }

            sc.close();
        }

    }

