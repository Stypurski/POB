package  Exercícios.Lista10.EncadeamentoExceçõesProcessamentoArquivosSimulado.controle;

import  Exercícios.Lista10.EncadeamentoExceçõesProcessamentoArquivosSimulado.dominio.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
       boolean novo = false;
       
       do{
           System.out.println("Insira um caminho: ");
           String caminho = sc.nextLine();
           try{
               Processador processado = new Processador(caminho);
               processado.processarArquivo(caminho);
           }catch(ProcessamentoDadosException e){
               System.out.println("Mensagem principal: "+ e.getMessage());
               if(e.getCause() !=  null){
                   System.out.println("Causa raiz: " + e.getCause().getMessage());
               }
           }
           sc.nextLine();
           System.out.println("Inserir um novo caminho? : ");
           novo = sc.nextLine().toUpperCase().equals("S");
       }while(novo);
           sc.close();
    }
}


