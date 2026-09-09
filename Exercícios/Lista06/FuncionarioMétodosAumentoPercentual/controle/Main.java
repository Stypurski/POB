package Exercícios.Lista06.FuncionarioMétodosAumentoPercentual.controle;

import Exercícios.Lista06.FuncionarioMétodosAumentoPercentual.dominio.Funcionario;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        Funcionario funcionario1 = new Funcionario();
        
        System.out.print("Insira o nome do funcionario: ");
        funcionario1.nome = sc.nextLine();

        System.out.print("Insira o nome do cargo do funcionario: ");
        funcionario1.cargo = sc.nextLine();

        System.out.print("Insira o salario bruto do funcionario: ");
        funcionario1.salarioBruto = sc.nextDouble();

        System.out.print("Salario bruto antes do aumento RS" + df.format(funcionario1.salarioBruto));
        double percAumento = 10.0;
        funcionario1.aplicarAumento(percAumento);
        System.out.print("Salario bruto pos aumento RS" + df.format(funcionario1.salarioBruto));

        double descImposto = 2.25;
        double salarioFinal = funcionario1.calcularSalarioLiquido(descImposto);
        System.out.print("Salario liquido pos aumento  e desconto de impostos RS" + df.format(salarioFinal));

        sc.close();

    }
}
