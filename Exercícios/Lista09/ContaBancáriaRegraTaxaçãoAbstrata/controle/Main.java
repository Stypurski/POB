package Exercícios.Lista09.ContaBancáriaRegraTaxaçãoAbstrata.controle;

import Exercícios.Lista09.ContaBancáriaRegraTaxaçãoAbstrata.dominio.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    
    public static void processarConta(ContaBancaria conta){
        conta.cobrarTaxaMensal();
        conta.consultarSaldo();
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        List<ContaBancaria> contas = new ArrayList<>();
        
        System.out.println("Quantas contas deseja cadastrar?");
        int quantidade = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nSelecione o tipo de conta a criar: \n\t1 - Conta Corrente\n\t2 - Conta Empresarial");
            int escolha = sc.nextInt();
            sc.nextLine();

            System.out.println("Insira o número da conta: ");
            String numero = sc.nextLine();

            System.out.println("Insira o saldo inicial: ");
            double saldo = sc.nextDouble();
            sc.nextLine();
            
            switch (escolha) {
                case 1:
                    ContaCorrente cc = new ContaCorrente(numero, saldo);
                    contas.add(cc);
                    break;

                case 2:
                    ContaEmpresarial ce = new ContaEmpresarial(numero, saldo);
                    contas.add(ce);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
    }
    
    for (ContaBancaria c : contas) {
            System.out.print("Conta " + c.getNUmero() + ": ");
            processarConta(c);
        }

        sc.close();
    }
}
