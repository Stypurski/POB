package Exercícios.Lista06.BancariaParâmetroValidaçõesSimples.dominio;

public class ContaBancaria {
    
    public String titular;
    public String numeroConta;
    public double saldoConta=0;

    public void depositar(double valor){
        if(valor>0){
            saldoConta += valor;
        }
    }

    public void sacar(double valor){
        if((saldoConta>=valor) && (valor>0)){
            saldoConta-=valor;
        }else{
            System.out.print("Saldo insuficiente ou valor inválido");
        }
    }

    public void consultarSaldo(){
        System.out.print("Saldo atual corresponde a RS" + saldoConta);
    }

}



