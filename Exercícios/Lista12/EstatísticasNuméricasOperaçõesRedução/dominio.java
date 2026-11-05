package Exercícios.Lista12.EstatísticasNuméricasOperaçõesRedução.dominio;

import java.util.List;
import java.util.Comparator;
import java.util.Optional;

public class Produto{
    
    private String nome; 
    private double preco;
    
    public Produto(String nome, double preco){
        this.nome =  nome;
        this.preco = preco;
    }
    
    
    public String getNome(){
        return this.nome;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public static double Total(List<Produto> produtos){
        return produtos.stream()
        .mapToDouble(Produto :: getPreco)
        .sum();
    }
    
    
    public static double Media(List<Produto> produtos){
        return produtos.stream()
        .mapToDouble(Produto :: getPreco)
        .average()
        .orElse(0.0);
    }
    
    
    public static Optional<Produto> MaisCaro(List<Produto> produtos){ 
        return produtos.stream() 
        .max(Comparator.comparingDouble(Produto::getPreco));
    } 

}
