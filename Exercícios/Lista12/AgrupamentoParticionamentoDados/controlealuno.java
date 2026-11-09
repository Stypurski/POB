package Exercícios.Lista12.AgrupamentoParticionamentoDados.dominio;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Aluno{
    
    private String nome;
    private String curso;
    private double notaFinal;
    
    public Aluno(String nome, String curso, double notaFinal){
        this.nome = nome;
        this.curso = curso;
        this.notaFinal = notaFinal;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public double getNotaFinal(){
        return notaFinal;
    }
    
    
    
    public static void Agrupador(List<Aluno> alunos){
        
        Map<String, List<Aluno>> alunosCursos = alunos.stream().collect(Collectors.groupingBy(aluno -> aluno.getCurso()));
        
        System.out.println(alunosCursos);
    }
    
    
    
    
    public static void Notas(List<Aluno> alunos){
        
        Map<Boolean, List<Aluno>> alunosNotas = alunos.stream().collect(Collectors.partitioningBy(aluno -> aluno.getNotaFinal() > 7.0));
        
        System.out.println("Aluno aprovado: " + alunosNotas.get(true));
        
        System.out.println("Aluno reprovado: " + alunosNotas.get(false));
        
    }
    
    
    
    @Override 
    public String toString(){
        return ("Nome: " + nome + " Nota: " + notaFinal + "\n"); 
    }
}
