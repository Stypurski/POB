package Exercícios.Lista12.FiltragemTransformaçãoOrdenaçãoNomes.Main;

import java.util.List;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        
        List<String> Nomes = Arrays.asList("ana", "carlos", "beatriz", "antonio", "amanda", "bernardo");
        
        List<String>processador = Nomes.stream()
        .filter(Nome -> Nome.toLowerCase().startsWith("a"))
        .map(Nome -> Nome.toUpperCase())
        .sorted()
        .toList();
        
        System.out.println(processador);
    }
}
