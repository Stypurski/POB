package Exercícios.Lista12. PipelineInterfacesFuncionaisNativas.dominio;

import java.util.function.*;

public class Funcionario{
    
    private String nome;
    private String departamento;
    private double salario;
    
    public Funcionario(String nome, String departamento, double salario){
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }
    
    
    public String getNome(){
        return nome;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
    public double getSalario(){
        return salario;
    }
    
    
    Predicate<Funcionario> pertenceTI = funcionario -> funcionario.getDepartamento().equalsIgnoreCase("TI");
    
    Function<Funcionario, Double> reajuste = funcionario -> funcionario.getSalario() * 1.10;
    
    Consumer<Double> impressor = salario -> System.out.println("Salario pos ajuste de 10% : RS" + salario);
}
