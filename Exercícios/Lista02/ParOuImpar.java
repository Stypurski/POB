package Exercícios.Lista02;

import java.util.scanner; 

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Insira seu numero: ");
    int numero = sc.nextint();


    int resultado = numero % 2 ;

    if(resultado == 0){
        System.out.println("O numero digitado e par");
    }else{
        System.out.println("O numero digitado e par");
    }

    sc.close();

}