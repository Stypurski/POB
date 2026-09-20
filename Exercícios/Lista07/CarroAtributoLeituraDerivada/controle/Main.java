package Exercícios.Lista07.CarroAtributoLeituraDerivada.controle;

import Exercícios.Lista07.CarroAtributoLeituraDerivada.dominio.Carro;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o modelo do carro: ");
        String mdl1 = sc.nextLine();

        System.out.print("Insira o ano do carro: ");
        int ano1 = sc.nextInt();

        Carro c1 = new Carro(mdl1, ano1);

        System.out.print("Insira a acao que deseja executar:\n 1- Acelerar\n 2- Desacelerar\n 3- Consultar estado\n Qualquer outro numero - Sair");
        int condicao = sc.nextInt();

        int valor;
        switch(condicao){

            case 1: 
            System.out.print("Insira quanto deseja acelerar:");
            valor = sc.nextInt();
            c1.acelerar(valor);
            break;

            case 2:
            System.out.print("Insira quanto deseja desacelerar:");
            valor = sc.nextInt();
            c1.frear(valor);
            break;

            case 3:
            if(c1.isEmMovimento()){
                System.out.print("Seu carro esta em movimento.");
            }else{
                System.out.print("Seu carro esta parado.");
            }
            break;

            default:
            System.out.print("Programa encerrado");
            return;
        }

        sc.close();

    }
}