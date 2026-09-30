package Exercícios.Lista08.FolhaPagamentoPolimórfica.controle;

import Exercícios.Lista08.FolhaPagamentoPolimórfica.dominio.Funcionario;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{

    public static void main(Strings[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Deseja inserir quantos funcionarios? ");
        int qttFuncionarios = nextInt();

        Funcionario[] funcionarios = new Funcionario[qttFuncionarios];

        for(int i = 0; i<qttFuncionarios;i++){

            System.out.print("1- Vendedor OU 2- Gerente");
            int opcao = nextInt();
            sc.nextInt();

            switch(opcao){

                case 1: 
                System.out.print("Nome: ");
                String nome = nextLine;
                System.out.print("Salario base:");
                double salarioB = nextDouble();
                System.out.print("Total vendas: ");
                double totalV = nextDouble();
                System.out.print("Comissao percentual: ");
                double comissaoP = nextDouble();

                funcionarios[i].Vendedor(nome, salarioB, totalV, comissaoP);
                double salarioF = funcionarios[i].calcularSalario();
                System.out.println("Salario Final do funcionario " + i + "coresponde a RS" + salarioF);
                break;

                case 2:
                System.out.print("Nome: ");
                String nome = nextLine;
                System.out.print("Salario base:");
                double salarioB = nextDouble();
                System.out.print("Bonus fixo: ");
                double bonusF = sc.nextDouble;

                funcionarios[i].Gerente(nome, salarioB, bonusF);
                double salarioF = funcionarios[i].calcularSalario();
                System.out.println("Salario Final do funcionario " + i + "coresponde a RS" + salarioF);
                break;

                default:
                System.out.print("Numero inserido invalido, tente novamente!");
                break;

            }
        }

        sc.close();
    }
}
