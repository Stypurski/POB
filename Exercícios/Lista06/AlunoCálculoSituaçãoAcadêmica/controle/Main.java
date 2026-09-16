package Exercícios.Lista06.AlunoCálculoSituaçãoAcadêmica.controle;

import Exercícios.Lista06.AlunoCálculoSituaçãoAcadêmica.dominio.Aluno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Aluno aluno1 = new Aluno();

        System.out.print("Insira o nome do aluno: ");
        aluno1.nome =sc.nextLine();

        System.out.print("Insira a matricula do aluno: ");
        aluno1.matricula= sc.nextLine();

        System.out.print("Insira a primeira nota: ");
        aluno1.nota1= sc.nextDouble();

        System.out.print("Insira a segunda nota: ");
        aluno1.nota2= sc.nextDouble();

        aluno1.imprimirBoletim();

        sc.close();

    }
    
}
