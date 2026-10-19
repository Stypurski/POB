import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.print("Insira um numero: ");
            int n1 = sc.nextInt();
        
            System.out.println("Insira um segundo numero: ");
            int n2 = sc.nextInt();
             
            int div = n1/ n2;
            System.out.print("Resultado da divisão: " + div);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            //ou
            System.out.println("Não é possível dividir por zero");
        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
            //ou
            System.out.println("Digite apenas números inteiros");
        }finally{
            System.out.println("Operação Finalizada");
            sc.close();
        }
        
        
    }
}


