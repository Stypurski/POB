package Exercícios.Lista07.FuncionarioRegrasNegócioSetter.controle;

import Exercícios.Lista07.FuncionarioRegrasNegócioSetter.dominio.Funcionario;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome do funcionario: ");
        String nome1 = sc.nextLine();

        System.out.print("Insira o numero de matricula do funcionario: ");
        String matricula1 = sc.nextLine();

        System.out.print("Insira o valor do salario do funcionario: ");
        double salario1 = sc.nextDouble();

        Funcionario funcionario1 = new Funcionario(nome1, matricula1, salario1);

        System.out.print("Insira a acao que deseja executar:\n 1- Alterar salario\n 2-  Consultar dados\n Qualquer outro numero - Sair");
        int condicao = sc.nextInt();

        switch(condicao){

            case 1:
            System.out.print("Insira o novo salario:");
            double valor = sc.nextDouble();
            funcionario1.setSalario(valor);
            break;

            case 2: 
            funcionario1.exibirDados();
            break;

            default: 
            System.out.print("Programa encerrado");
            return;
        }

        sc.close();
        
    }
}