package Exercícios.Lista09.MeiosPagamentoInterface.dominio;

public interface MetodoPagamento{
    
    void processarPagamento(double valor);
    String obterDetalhes();
}


public class CartaoCredito implements MetodoPagamento{
    
    private String numeroCartao;
    private double limite;
    
    
    public CartaoCredito(String numeroCartao, double limite){
        this.numeroCartao = numeroCartao;
        this.limite = limite;
    }
    
    
    public String getNumeroCartao(){
        return numeroCartao;
    }
    
    public void setNumeroCartao(String numeroCartao){
        this.numeroCartao = numeroCartao;
    }
    
    
    public double getLimite(){
        return limite;
    }
    
    public void setLimite(double limite){
        this.limite = limite;
    }
    
    
    @Override 
    public void processarPagamento(double valor){
        System.out.println("O pagamento de RS" + valor + "foi processada na conta portadora do cartao numero: " + this.numeroCartao);
    }
    
    @Override
    public String obterDetalhes(){
        return ("O saldo limite da conta portadora do cartão de numero: " + this.numeroCartao + "e de RS " + this.limite);
    }
}




public class Pix implements MetodoPagamento{
    
    private String chavePix;
    
    public Pix(String chavePix){
        this.chavePix = chavePix;
    }
    
    public String getChavePix(){
        return chavePix;
    }
    
    public void setChavePix(String chavePix){
        this.chavePix = chavePix;
    }
    
    
    @Override
    public void processarPagamento(double valor){
        System.out.println("O pagamento de RS" + valor + "foi processada na conta portadora da chave pix: " + this.chavePix);
    }
    
    @Override
    public String obterDetalhes(){
        return ("A chave pix da conta consultada corresponde a: " + this.chavePix);
    }
    
}
