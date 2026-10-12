package Exercícios.Lista09.MúltiplaImplementaçãoInterfaces.dominio;

public interface Autenticavel{
    
    boolean autenticar(String senha);
}

public interface ExportavelJSON{
    
    String exportarJSON();
}





public class Usuario implements Autenticavel{
    
    private String login;
    private String senha;
    
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }
    
    
    public String getLogin(){
        return login;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    
    @Override
    public boolean autenticar(String senha){
        return this.senha.equals(senha); // Comparando o atributo do objeto (this.senha) com o parâmetro recebido (senha)
    }
}




public class Administrador implements  Autenticavel, ExportavelJSON{
    
    private String login;
    private String senha;
    private int nivelAcesso;
    
    public Administrador(String login, String senha, int nivelAcesso){
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }
    
    
    public String getLogin(){
        return login;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    
    public int getNivelAcesso(){
        return nivelAcesso;
    }
    
    public void setNivelAcesso(int nivelAcesso){
        this.nivelAcesso = nivelAcesso;
    }
    
    
    @Override
    public boolean autenticar(String senha){
        return this.senha.equals(senha);
    }
    
    @Override
    public String exportarJSON(){
        return ("O usuario portador do login numero: " + login + "tem o nivel: " + nivelAcesso + "de acesso");
    }
    
}

