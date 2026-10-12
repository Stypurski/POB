package Exercícios.Lista09.MúltiplaImplementaçãoInterfaces.controle;

import Exercícios.Lista09.MúltiplaImplementaçãoInterfaces.dominio.*;
import java.util.Scanner;

public class Main{
    
    public static void autenticacao(Autenticavel autenticavel, String senha){
        if(autenticavel.autenticar(senha)){
            System.out.println("Sucesso na autenticacao");
        }else{
            System.out.println("Senha informada incorreta");
        }
    }
    
    public static void exportacao(ExportavelJSON exportavel){
        System.out.println("JSON Exportado: " + exportavel.exportarJSON());
    }
    
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Selecione o tipo de conta a criar: \n\t1 - Usuário\n\t2 - Administrador");
        int escolha = sc.nextInt();
        sc.nextLine();
        
        switch (escolha) {
            case 1:
                System.out.println("Insira o login: ");
                String loginU = sc.nextLine();

                System.out.println("Insira a senha cadastrada: ");
                String senhaU = sc.nextLine();

                Usuario user = new Usuario(loginU, senhaU);

                System.out.println("Digite a senha: ");
                String senhaTentativaU = sc.nextLine();

                autenticacao(user, senhaTentativaU);
                break;

            case 2:
                System.out.println("Insira o login: ");
                String loginA = sc.nextLine();

                System.out.println("Insira a senha cadastrada: ");
                String senhaA = sc.nextLine();

                System.out.println("Insira o nível de acesso (número inteiro): ");
                int nivel = sc.nextInt();
                sc.nextLine(); 
                
                Administrador admin = new Administrador(loginA, senhaA, nivel);

                System.out.println("Digite a senha: ");
                String senhaTentativaA = sc.nextLine();

                autenticacao(admin, senhaTentativaA);

                exportacao(admin);;
                break;

            default:
                break;
        }
    }
}
