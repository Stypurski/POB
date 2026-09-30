package Exerxícios.Lista08.FolhaPagamentoPolimórfica.dominio;

public class Funcionario{
    
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public double getSalarioBase(){
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }


    public double calcularSalario(){
        return this.salarioBase;
    }
}





public class Gerente extends Funcionario{

    private double bonusFixo;

    public Gerente(String nome, double salarioBase, double bonusFixo){

        super(nome, salarioBase);
        this.bonusFixo = bonusFixo;
    }


    public double getBonusFixo(){
        return bonusFixo;
    }

    public void setBonusFixo(double bonusFixo){
        this.bonusFixo = bonusFixo;
    }

    @Override
    public double calcularSalario(){
       double salarioFinal = super.calcularSalario() + this.bonusFixo;
       return salarioFinal;
    }
}




public class Vendedor extends Funcionario{

    private double totalVendas;
    private double comissaoPercentual;

    public Vendedor(String nome, double salarioBase, double totalVendas, double comissaoPercentual){
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.comissaoPercentual = comissaoPercentual;
    }


    public double getTotalVendas(){
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas){
        this.totalVendas = totalVendas;
    }


    public double getComissaoPercentual(){
        return comissaoPercentual;
    }

    public void setComissaoPercentual(double comissaoPercentual){
        this.comissaoPercentual = comissaoPercentual;
    }


    @Override
    public double calcularSalario(){
       double comissaoFinal = (totalVendas * comissaoPercentual) / 100;
       double salarioFinalV = super.calcularSalario() + comissaoFinal;
       return salarioFinalV;
    }
}
