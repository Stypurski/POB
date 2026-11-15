package Exercícios.Lista13.ParserProcessamentoCSVCálculoTotais.controle;

import Exercícios.Lista13.ParserProcessamentoCSVCálculoTotais.dominio.Produto;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.List;


public class Main{
    private static void preenchedor(Path arq){
    try{
        
        Files.write(arq, List.of("Nome,Quantidade,PrecoUnitario", "Monitor,5,1200.00", "Teclado Mecanico,12,798.90", 
                                    "Mouse pad GG,8,35.50", "Notebook,9,7.800.99", "Mouse,17,99.80"));

    }catch(IOException e){
        System.out.println("ERRO : " + e.getMessage());
    }
    }
    public static void main(String[] args){
        
        Path arq = Path.of("produtos.csv");
        
        preenchedor(arq);
      
        try{
             
            List<String> linhas =  Files.readAllLines(arq);
             
            double total= 0;
            double temp;
        
            for(int i=1; i<linhas.size(); i++){
                
                String linha = linhas.get(i);
                String[] itens = linha.split(",");
                
                try{
                    
                    String nome = itens[0];
                    int qtt = Integer.parseInt(itens[1]);
                    double preco = Double.parseDouble(itens[2]);
                
                    Produto p = new Produto(nome, qtt, preco);
                
                    temp = p.calculadoraTotalUn();
                    System.out.println("O valor total em estoque do item: " + p.getNome() + " corresponde a RS" + temp);
                    total += temp;
                    
                }catch(NumberFormatException e){
                    
                    System.out.println("ERRO : " + e.getMessage());
                }
            }
            
            System.out.println("O valor total de todos os itens em estoque corresponde a RS" + total);
            
        }catch(IOException e){
            System.out.println("ERRO " + e.getMessage());
        }
        
    }
}
