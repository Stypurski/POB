package Exercícios.Lista08.ContasBancáriasSobrescritaRegraSaque(super).dominio;

public class Conta{

    private String numero;
    private double saldo;


    public Conta(String numero, double saldo){
        this.numero = numero;
        this.saldo= saldo;
    }

    public String getNumero(){
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



    public void depositar(double valor){

        this.saldo += valor;
    }

    public void sacar(double valor){

        if(valor<= this.saldo){
            this.saldo -= valor;
        }else{
            System.out.print("Saldo insuficiente!");
        }
    }


}




public class ContaPoupanca extends Conta{

    private double taxaRendimento;

    public ContaPoupanca(String numero, double saldo, double taxaRendimento){
        super(numero, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento(){
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento){
        this.taxaRendimento = taxaRendimento;
    }

    public void  aplicarRendimento(){

        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
    }
}





public class ContaCorrente extends Conta{

    private double limiteChequeEspecial;

     public ContaCorrente(String numero, double saldo, double limiteChequeEspecial){
        super(numero, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial(){
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial){
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor){

        double valorCTaxa = valor + 2.0;

        if(getSaldo() + limiteChequeEspecial >= valorCTaxa){

            setSaldo(getSaldo() - valorCTaxa);
            System.out.println("Saque de R$ " + valor + "  (Taxa: R$ 2.0) realizado!");
        }else{
            System.out.println("Saque invalido, limite cheque especial excedido");
        }
    }

}
