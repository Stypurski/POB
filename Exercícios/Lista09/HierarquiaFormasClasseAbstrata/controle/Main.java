package Exercícios.Lista09.HierarquiaFormasClasseAbstrata.controle;

import Exercícios.Lista09.HierarquiaFormasClasseAbstrata.dominio.*;
import java.util.Scanner;

public class Main{
    
    public static void exibirF(Forma forma){
        
        forma.exibirCor();
        System.out.println("A area calculada da forma selecionada foi de: " + forma.calcularArea());
    }
    
    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Insira a forma de sua escolha: \n\t1-Retangulo \n\t2-Circulo");
    int escolha = sc.nextInt();
    sc.nextLine();
    
    switch(escolha){
        
        case 1: 
            System.out.println("Insira a cor: ");
            String cor = sc.nextLine();
            
            System.out.println("Insira a largura: ");
            double largura = sc.nextDouble();
            
            System.out.println("Insira a altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            
            Retangulo r1 = new Retangulo(cor, largura, altura);
            exibirF(r1);
            break;
            
        case 2: 
            System.out.println("Insira a cor: ");
            String cor = sc.nextLine();
            
            System.out.println("Insira o raio: ");
            double raio = sc.nextDouble();
            
            Circulo c1 = new Circulo(cor, raio);
            exibirF(c1);
            break;
            
        default: 
            return;
    }
    }
    
}
