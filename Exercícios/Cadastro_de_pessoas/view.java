package Exercícios.Cadastro_de_Pessoas.view;

import Exercícios.Cadastro_de_Pessoas.controller.PessoaController;
import Exercícios.Cadastro_de_Pessoas.model.Pessoa;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        
        PessoaController controller = new PessoaController();
        
        Scanner sc = new Scanner(System.in);
        
        int escolha = 0;
        
        while(escolha != 4){
            
            System.out.println("Escolha a acao que deseja realizar: \n\t-1Cadastrar pessoa \n\t2-Listar pessoas \n\t3-Salvar no arquivo \n\t4-Sair");
            
            try{
                
                escolha = sc.nextInt();
                sc.nextLine();
                
                switch(escolha){
                    
                    case 1:
                        cadastrar(controller, sc);
                        break;
                        
                    case 2:
                        listar(controller);
                        break;
                        
                    case 3:
                        controller.salva();
                        break;
                        
                    case 4:
                        System.out.println("Fim do programa");
                        break;
                        
                    default:
                        System.out.println("Opcao invalida, tente novamente");
                }
            }catch(InputMismatchException e){
                System.out.println("ERRO - digite apenas numeros");
                sc.nextLine();
            }
    }
    
    sc.close();
} 





private static void cadastrar(PessoaController controller, Scanner sc){
    
    try{
        
    System.out.print("ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Nome: ");
    String nome = sc.nextLine();

    System.out.print("Idade: ");
    int idade = sc.nextInt();

    System.out.print("Altura: ");
    double altura = sc.nextDouble();
    sc.nextLine();
    
    Pessoa novaPessoa = new Pessoa(id, idade, altura, nome);
    
    controller.adicionar(novaPessoa);
            
    System.out.println("Pessoa adicionada com sucesso");

    }catch(InputMismatchException e){
    
    System.out.println("ERRO - tipo de dado invalido - tente novamente");
    sc.nextLine();
        
    }
}
    
    
    
    
private static void listar(PessoaController controller){
    
    if(controller.getListaPessoas().isEmpty()){
            
        System.out.println("Nenhuma pessoa cadastrada.");
        return;
    }

    for(Pessoa p : controller.getListaPessoas()){
            
        System.out.println("ID: " + p.getId() + " - Nome: " + p.getNome() + " - Idade: " + p.getIdade() + " - Altura: " + p.getAltura());
    }
}
}

