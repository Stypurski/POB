package Exercícios.Lista10.ExceçãoCustomizadaVerificada.dominio;

class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String msg){
        super(msg);
    }
}

public class ContaCorrente{
    
    private String numero;
    private double saldo;
    
    public ContaCorrente(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public void sacar(double valor) throws SaldoInsuficienteException{
        if(valor > this.saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente para saque desejado");
        }else{
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        }
    }
}
