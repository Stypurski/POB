package Exercícios.Lista09.ContaBancáriaRegraTaxaçãoAbstrata.dominio;

public abstract class ContaBancaria{
    
    private String numero;
    private double saldo;
    
    public ContaBancaria(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    
    
    public String getNUmero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    
    public void depositarValor(double valor){
        this.saldo+=valor;
    }
    
    public void consultarSaldo(){
        System.out.println("Seu saldo atual e de RS " + this.saldo);
    }
    
    public abstract void cobrarTaxaMensal();

}




public class ContaCorrente extends ContaBancaria{
    
    public ContaCorrente(String numero, double saldo){
        super(numero, saldo);
    }
    
    @Override
    public void cobrarTaxaMensal(){
        double novoSaldo = getSaldo()-15;
        setSaldo(novoSaldo);
    }
}



public class ContaEmpresarial extends ContaBancaria{
    
    public ContaEmpresarial(String numero, double saldo){
        super(numero, saldo);
    }
    
    @Override
    public void cobrarTaxaMensal(){
        double taxa = (getSaldo() * 0.005 ) + 30;
        double novoSaldo =  getSaldo() - taxa;
        setSaldo(novoSaldo);
    }
    
}
