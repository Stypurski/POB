package Exercícios.Lista10.ValidaçãoIdadeExceçãoNVerificada.dominio;

class IdadeInvalidaException extends RuntimeException{
    public IdadeInvalidaException(String msg){
        super(msg);
    }
}

public class Eleitor{
    
    private String nome;
    private int idade;
    
    public Eleitor(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void cadastrar(String nome, int idade) throws IdadeInvalidaException{
        if(idade<0 || idade>130){
            throw new IdadeInvalidaException("Idade inválida inserida");
        }else{
            this.nome = nome;
            this.idade = idade;
            System.out.println("Cadastro realizado com sucesso");
        }
    }
}
