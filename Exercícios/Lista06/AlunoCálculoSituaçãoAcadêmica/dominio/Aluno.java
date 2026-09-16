package Exercícios.Lista06.AlunoCálculoSituaçãoAcadêmica.dominio;

public class Aluno {

    public String nome;
    public String matricula;
    public double nota1;
    public double nota2;

    public double calcularMedia(){
        return (nota1 + nota2)/2;
    } 

    public String verificarAprovacao(){
        if(this.calcularMedia()>7){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }

    public void imprimirBoletim(){
        System.out.print("Nome do aluno: " + nome);
        System.out.print("Matricula do aluno: " + matricula);
        System.out.print("Media final: " + calcularMedia());
        System.out.print("Situacao do aluno: " + verificarAprovacao());
    }

    
    
}
