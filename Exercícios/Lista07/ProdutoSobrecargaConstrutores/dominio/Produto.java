package Exercícios.Lista07.ProdutoSobrecargaConstrutores.dominio;

public class Produto{

    private String nome;
    private double preco;
    private int quantidadeEstoque;
    
    public Produto(String nome, double preco, int quantidadeEstoque){
        this.nome =  nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Produto(String nome, double preco){
        this.nome= nome;
        this.preco= preco;
        this.quantidadeEstoque = 0;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        if(preco<0){
            System.out.print("Valor invalido inserido!");
        }else{
            this.preco = preco;
        }
    }


    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque){
        if(quantidadeEstoque<0){
            System.out.print("Valor invalido inserido!");
        }else{
            this.quantidadeEstoque = quantidadeEstoque;
        }
    }

    public double calcularValorTotalEmEstoque(){
        return (this.preco * this.quantidadeEstoque);
    }



}
