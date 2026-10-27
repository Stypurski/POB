package Exercícios.Lista10.ConversãoVetor.ConversãoVetor;
import java.util.Scanner;

public class ConversãoVetor{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String[] vetor = {"10", "25", "abc", "50"};
        
        try{
            System.out.print("Insira um indice: ");
            int indice = sc.nextInt();
            String acessoT = vetor[indice];
            int acessoI = Integer.parseInt(acessoT);
            System.out.println("Dado convertido: " + acessoI);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            //ou
            System.out.println("Indice acessado invalido");
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
            //ou
            System.out.println("Valor contido na posicao selecionada nao e um numero valido");
        }finally{
            sc.close();
        }
        
       
    }
}

