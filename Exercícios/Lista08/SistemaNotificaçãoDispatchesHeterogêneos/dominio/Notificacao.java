package Exercícios.Lista08.SistemaNotificaçãoDispatchesHeterogêneos.dominio;

public class Notificacao{

    private String destinatario;

    public Notificacao(String destinatario){
        this.destinatario = destinatario;
    }

    public String getDestinatario(){
        return destinatario;
    }

    public void setDestinatario(String destinatario){
        this.destinatario = destinatario;
    }

    public void enviar(String mensagem){
    }

    public static void processarEnvio(Notificacao notificacao, String texto){
    notificacao.enviar(texto);
}
}



public class EmailNotificacao extends Notificacao{

    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando E-mail para " + getDestinatario() + ":" + mensagem);
    }
}

public class SmsNotificacao extends Notificacao{

    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando SMS para o número " + getDestinatario() + ":" + mensagem);
    }
}

public class PushNotificacao extends Notificacao{

    @Override
    public void enviar(String mensagem){
        System.out.println( "Enviando Push Notification para o dispositivo " + getDestinatario() + ":" + mensagem);
    }
}

