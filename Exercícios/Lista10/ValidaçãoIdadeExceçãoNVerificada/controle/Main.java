package Exercícios.Lista10.ValidaçãoIdadeExceçãoNVerificada.controle;

import Exercícios.Lista10.ValidaçãoIdadeExceçãoNVerificada.dominio.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        boolean novoCadastro = false;
        String nome;
        int idade; 
        
        Eleitor eleitor = new Eleitor("", 0);
        
        do{
            try{
            System.out.println("Insira o nome do eleitor: ");
            nome = sc.nextLine();
            System.out.println("Insira a idade: ");
            idade = sc.nextInt();
            eleitor.cadastrar(nome, idade);
            System.out.println("Eleitor " + nome +" de idade "+ idade + "cadastrado com sucesso");
            }catch(IdadeInvalidaException e){
                System.out.println(e.getMessage());
            }
            sc.nextLine();
            System.out.println("Novo cadastro?: ");
            novoCadastro = sc.nextLine().toUpperCase().equals("S");
        }while(novoCadastro);
        
        sc.close();
       
    }
}


