package Exercícios.Lista12. PipelineInterfacesFuncionaisNativas.controle;

import Exercícios.Lista12. PipelineInterfacesFuncionaisNativas.dominio.Funcionario;
import java.util.List;
import java.util.Arrays;
import java.util.function.*;

public class Main{
    public static void main(String[] args){
        
        List<Funcionario> funcionarios = Arrays.asList(
            new Funcionario("Ana", "TI", 5000.0),
            new Funcionario("Bruno", "RH", 4000.0),
            new Funcionario("Carla", "TI", 6000.0)
            );
            
        Predicate<Funcionario> eDoTI = f -> f.getDepartamento().equalsIgnoreCase("TI");

        Function<Funcionario, Double> reajuste = f -> f.getSalario() * 1.10;

        Consumer<Double> impressor = salario -> System.out.println("Salário com reajuste: R$ " + salario);

        funcionarios.stream()
            .filter(eDoTI)
            .map(reajuste)
            .forEach(impressor);
    }
}
