package Exercícios.Lista13.ParserProcessamentoCSVCálculoTotais.dominio;


public class Produto{
    
    private String nome;
    private int quantidade;
    private double precoUn;
    
    public Produto(String nome, int quantidade, double precoUn){
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUn = precoUn;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public double getPrecoUn(){
        return precoUn;
    }
    
    
    public double calculadoraTotalUn(){
        return (this.quantidade * this.precoUn);
    }
}
