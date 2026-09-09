package Exercícios.Lista06.ModelagemClasseLivro.controle;

import Exercícios.Lista06.ModelagemClasseLivro.dominio.Livro;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Livro livro1 = new Livro();

        System.out.print("Insira o titulo do livro 1: ");
        livro1.titulo = sc.nextLine();

        System.out.print("Insira o nome do autor do livro 1: ");
        livro1.autor = sc.nextLine();

        System.out.print("Insira o numero de paginas do livro 1: ");
        livro1.numeroPaginas = sc.nextInt();

        sc.nextLine();

        Livro livro2 = new Livro();

        System.out.print("Insira o titulo do livro 2: ");
        livro2.titulo = sc.nextLine();

        System.out.print("Insira o nome do autor do livro 2: ");
        livro2.autor = sc.nextLine();

        System.out.print("Insira o numero de paginas do livro 2: ");
        livro2.numeroPaginas = sc.nextInt();

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();

        sc.close();
        
    }
    
}
