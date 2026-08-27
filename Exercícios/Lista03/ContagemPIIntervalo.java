package Exercícios.Lista03;

import java.util.Scanner;

public class ContagemPIIntervalo {

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Insira o valor que indica o inicio do intervalo: ");
    int inicio = sc.nextInt();

    System.out.print("Insira o valor que indica o fim do intervalo: ");
    int fim = sc.nextInt();

    if(fim <= inicio){

        System.out.print("Erro ao executar o programa, o valor referente ao inicio deve ser menorque o do final!");
        return; 

    }

    int qttP = 0;
    int qttI = 0;

    for(int i = inicio; i <= fim; i++){

        if(i%2 == 0){
            qttP++;
        }else{
            qttI++;
        }
    }

    System.out.println("A quantidade de numeros pares no intervalo e: " + qttP);
    System.out.println("A quantidade de numeros impares no intervalo e: " + qttI); 

    sc.close();


}
    
}
