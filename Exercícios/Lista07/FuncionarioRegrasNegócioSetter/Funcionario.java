package Exercícios.Lista07.FuncionarioRegrasNegócioSetter.dominio.

public class Funcionario{

    private String nome;
    private String matricula;
    private double salario;

    public Funcionario(String nome, String matricula, double salario){
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }


    public double getSalario(){
        return salario;
    }

    public void setSalario(double novoSalario){
        if(novoSalario > salario){
            this.salario = novoSalario;
        }else{
            System.out.print("Erro ao alterar salario");
        }

    }

    public void exibirDados(){
        System.out.println("Dados do funcionario: \n\tNome:" + nome + "\tMatricula: " + matricula + "\tSalario: " + salario);
    }
}
