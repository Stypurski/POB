package Exercícios.Lista06.FuncionarioMétodosAumentoPercentual.dominio;

public class Funcionario {
    
    public String nome;
    public String cargo;
    public Double salarioBruto;

    public void aplicarAumento(double porcentagem){
        salarioBruto += (salarioBruto % porcentagem);
    }

    public double calcularSalarioLiquido(double descontoImposto){
        return salarioBruto-= (salarioBruto % descontoImposto);
    }

}
