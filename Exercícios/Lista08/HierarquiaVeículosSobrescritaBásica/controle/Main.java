package Exercícios.Lista08.HierarquiaVeículosSobrescritaBásica.controle;

import Exercícios.Lista08.HierarquiaVeículosSobrescritaBásica.dominio.Veiculo;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Que tipo de veiculo deseja manipular(\n1- Carro \n2-Moto \nOutra opcao-sair): ");
        int tipo = sc.nextInt();
        sc.nextLine();

        if(tipo == 1){

            System.out.print("Insira os seguintes dados do carro:");
            System.out.print("Marca: ");
            String marca = sc.nextLine();
            System.out.print("Modelo: ");
            String modelo = sc.nextLine();
            System.out.print("Numero de portas: ");
            int quantidadePortas = sc.nextInt();

            Carro carro1 = new Carro(marca, modelo, quantidadePortas);
            carro1.exibirDetalhes();

        }else{

        if(tipo == 2){

            System.out.print("Insira os seguintes dados da moto:");
            System.out.print("Marca: ");
            String marca = sc.nextLine();
            System.out.print("Modelo: ");
            String modelo = sc.nextLine();
            System.out.print("Cilindradas: ");
            int cilindradas = sc.nextInt();

            Moto moto1 = new Moto(marca, modelo, cilindradas);
            moto1.exibirDetalhes();
            
        }else{
            System.out.println("Valor inserido invalido. \n FIM DE PROGRAMA!");
            return;
        }
        }

    }
}
