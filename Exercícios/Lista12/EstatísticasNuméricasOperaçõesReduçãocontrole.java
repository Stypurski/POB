package Exercícios.Lista12.EstatísticasNuméricasOperaçõesRedução.Controle;

import Exercícios.Lista12.EstatísticasNuméricasOperaçõesRedução.dominio.Produto;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class controle{
    public static void main(String[] args){
        
        List<Produto> produtos = Arrays.asList(
            new Produto("Computador", 14050.00),
            new Produto("Televisao", 5100.00),
            new Produto("Celular", 8250.00),
            new Produto("Carregador", 210.00),
            new Produto("Tablet", 2300.00),
            new Produto("Fone", 600.00)
        );
        
        double total = Produto.Total(produtos);
        System.out.println("Total = RS" + total);
       
        double media = Produto.Media(produtos);
        System.out.println("Media de valores dos produtos = RS" + media);
        
        Optional<Produto> caro = Produto.MaisCaro(produtos);
        caro.ifPresent(produto->System.out.println("O produto mais caro disponivel e o: " + produto.getNome() + "com o valor correspondente a RS " + produto.getPreco()));
        
    }
}
