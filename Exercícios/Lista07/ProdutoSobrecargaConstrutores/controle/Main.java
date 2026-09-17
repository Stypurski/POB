package Exercícios.Lista07.ProdutoSobrecargaConstrutores.controle;

import java.util.Scanner;

import Exercícios.Lista07.ProdutoSobrecargaConstrutores.dominio.Produto;

import java.text.DecimalFormat;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        

        System.out.print("Insira o nome do produto A: ");
        String nomeA = sc.nextLine();

        System.out.print("Insira o preco do produto A: ");
        double precoA = sc.nextDouble();

        System.out.print("Insira a quantidades de produtos A existentes em estoque: ");
        int quantidadeEstoqueA = sc.nextInt();

        Produto produtoA = new Produto(nomeA, precoA, quantidadeEstoqueA);



        sc.nextLine();
        System.out.print("Insira o nome do produto B: ");
        String nomeB = sc.nextLine();

        System.out.print("Insira o preco do produto B: ");
        double precoB = sc.nextDouble();

        Produto produtoB = new Produto(nomeB, precoB);

        produtoA.setPreco(-10.0);
        System.out.print(df.format(produtoA.getPreco()));

        double totalA = produtoA.calcularValorTotalEmEstoque();
        double totalB = produtoB.calcularValorTotalEmEstoque();

        System.out.println("O valor total em estoque do produto A corresponde a RS:" + df.format(totalA));
        System.out.println("O valor total em estoque do produto B corresponde a RS:" + df.format(totalB));



        sc.close();
    }
}
