package Exercícios.Lista07.ContaBancariaProteçãoSaldoSSetter.dominio;

public class ContaBancaria{

    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }

    public ContaBancaria(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }


    public String getNumeroConta(){
        return numeroConta;
    }

    public String getTitular(){
            return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }
}
