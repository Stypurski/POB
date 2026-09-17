package Exercícios.Lista07.ContaBancariaProteçãoSaldoSSetter.controle;

import Exercícios.Lista07.ContaBancariaProteçãoSaldoSSetter.dominio.ContaBancaria;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Insira o numero da conta 1: ");
        String numero1 = sc.nextLine();

        System.out.print("Insira o nome do titular da conta 1: ");
        String nome1 = sc.nextLine();

        System.out.print("Inserir saldo inicial? (1 - sim / 2 - nao)");
        int escolha = sc.nextInt();
        
        ContaBancaria conta1;

        switch (escolha){

            case 1: 
            System.out.print("Insira o saldo inicial: ");
            double saldo1 = sc.nextDouble();
            conta1 = new ContaBancaria(numero1, nome1, saldo1);
            break;

            case 2: 
            conta1 = new ContaBancaria(numero1, nome1);
            break;

            default: 
            System.out.print("Valor para operacao inserido invalido!");
            return;

        }

        System.out.print("Insira a operação que deseja fazer (1 - saque / 2 - deposito) ");
        int operacao = sc.nextInt();

        System.out.print("Insira o valor que deseja movimentar: ");
        double valor = sc.nextDouble();

        switch (operacao){

            case 1: 
            conta1.sacar(valor);
            break;

            case 2:
            conta1.depositar(valor);
            break;

            default: 
            System.out.print("Valor para operacao inserido invalido!");
            return;


        }


        System.out.println("O saldo final do cliente" + nome1 + "portador da conta numero " + numero1 + "corresponde a RS:" + df.format(conta1.getSaldo()));

        sc.close();
    }
    
}
