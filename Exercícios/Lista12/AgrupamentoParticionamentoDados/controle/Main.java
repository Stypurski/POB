package Exercícios.Lista12.AgrupamentoParticionamentoDados.controle;

import Exercícios.Lista12.AgrupamentoParticionamentoDados.dominio.Aluno;
import java.util.List;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        
        List<Aluno> alunos = Arrays.asList(
            new Aluno("Ana Santos", "Ciência da Computação", 8.5),
            new Aluno("Bruno Silva", "Engenharia", 6.0),
            new Aluno("Carla Moura", "Ciência da Computação", 9.0),
            new Aluno("Daniel Pereira", "Direito", 5.5),
            new Aluno("Eduarda Fragoso", "Engenharia", 7.5),
            new Aluno("Felipe Duarte", "Direito", 8.0),
            new Aluno("Gabriela Lima", "Ciência da Computação", 6.5)
        );
        
        System.out.print("Separação por curso: ");
        Aluno.Agrupador(alunos);
        
        System.out.println("Situação academica: ");
        Aluno.Notas(alunos);
        
        
        
    }
}
