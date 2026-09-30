package Exercícios.Lista08.SistemaNotificaçãoDispatchesHeterogêneos.controle;

import Exercícios.Lista08.SistemaNotificaçãoDispatchesHeterogêneos.dominio.*;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o numero do destinatario: ");
        String destinatario = sc.nextLine();

        System.out.print("Insira a sua mensagem: ");
        String mensagem = sc.nextLine();

        System.out.print("Insira o meio que deseja enviar a notificacao(1- Email 2- Sms 3- Push): ");
        int escolha = sc.nextInt();

        switch(escolha){

        case 1:
            Notificacao email = new emailNotificacao(destinatario);
            Notificacao.processarEnvio(email, mensagem);
            break;

        case 2: 
            Notificacao sms = new smsNotificacao(destinatario);
            Notificacao.processarEnvio(sms, mensagem);
            break;

        case 3: 
            Notificacao push = new pushnotificacao(destinatario);
            Notificacao.processarEnvio(push, mensagem);
            break;

        default:
            System.out.print("Numero inserido de operacao invalido");
            break;
        }

        sc.close();

    }
}
