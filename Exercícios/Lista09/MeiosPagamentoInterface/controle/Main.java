package Exercícios.Lista09.MeiosPagamentoInterface.controle;

import Exercícios.Lista09.MeiosPagamentoInterface.dominio.*;
import java.util.Scanner;

public class Main{
    
    public static void finalizarCompra(MetodoPagamento metodo, double total){
            
        metodo.processarPagamento(total);
        System.out.println(metodo.obterDetalhes());
            
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o metodo de pagamento escolhido\n\t1-Cartao Credito \n\t2-Pix");
        int MetodoPagamento = sc.nextInt();
        
        System.out.println("Insira o valor total da compra: ");
        double total = sc.nextDouble();
        sc.nextLine();
        
        switch(MetodoPagamento){
            
            case 1:
                
                System.out.println("Insira o numero do cartao: ");
                String numeroCartao = sc.nextLine();
                
                System.out.println("Insira o limite: ");
                double limite = sc.nextDouble();
                sc.nextLine();
                
                CartaoCredito cartao1 = new CartaoCredito(numeroCartao, limite);
                finalizarCompra(cartao1, total);
                break;
            
            case 2:
                
                System.out.println("Insira a chave pix: ");
                String chavePix = sc.nextLine();
                
                Pix pix1 = new Pix(chavePix);
                finalizarCompra(pix1, total);
                break;
                
            default: 
            
                return;
        }
     
     sc.close();
     
    }
}
