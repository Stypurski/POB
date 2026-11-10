package Exercícios.Lista12.CriaçãoUsoInterfacesFuncionaisPersonalizadas;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

@FunctionalInterface
interface TransformadorTexto{
    
    String transformar(String entrada);
}

public class Main{
    public static List<String> processarLista(List<String> lista, TransformadorTexto regra){
        return lista.stream().map(item -> regra.transformar(item)).collect(Collectors.toList());
    }
    public static void main(String[] args){
        List<String> palavras = Arrays.asList("java", "stream", "lambda");
        
        List<String> invertidas = processarLista(palavras, s -> new StringBuilder(s).reverse().toString());
        System.out.println("Invertidas: " + invertidas);
        
        List<String> comColchetes = processarLista(palavras, s -> "[" + s + "]");
        System.out.println("Com colchetes: " + comColchetes);
        
        List<String> maiusculas = processarLista(palavras, String::toUpperCase);
        System.out.println("Maiúsculas: " + maiusculas);
        
    }
}

