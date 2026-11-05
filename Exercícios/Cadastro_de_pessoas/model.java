package Exercícios.Cadastro_de_Pessoas.model;

public class Pessoa{
    
    private int id;
    private int idade;
    private double altura;
    private String nome;
    
    public Pessoa(int id, int idade, double altura, String nome){
        this.id = id;
        this.idade = idade;
        this.altura = altura; 
        this.nome = nome;
    }
    
    
    public int getId(){
        return id;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String retorno(){
        return (this.id + ";" + this.nome + ";" + this.idade + ";" + this.altura);
    }
    
}
