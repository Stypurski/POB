package Exercícios.Lista10.ExceçãoCustomizadaVerificada.controle;

import Exercícios.Lista10.ExceçãoCustomizadaVerificada.dominio.*;

public class Main {
    public static void main(String[] args){

        
        ContaCorrente conta = new ContaCorrente("123", 565.0);
        
        try{
            conta.sacar(55.0);
        }catch(SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
       
    }
}

