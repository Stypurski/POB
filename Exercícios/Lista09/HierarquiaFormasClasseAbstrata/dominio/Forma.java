package Exercícios.Lista09.HierarquiaFormasClasseAbstrata.dominio;

public abstract class Forma{
    
    protected String cor;
    
    public Forma(String cor){
        this.cor = cor;
        
    }
    
    public String getCor(){
        return cor;
    }
    
    public abstract double calcularArea();
    
    public void exibirCor(){
        System.out.println("Cor da forma: " + this.cor);
    }
}





public class Retangulo extends Forma{
    
    private double largura;
    private double altura;
    
    public Retangulo(String cor, double largura, double altura){
        
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }
    
    
    public double getLargura(){
        return largura;
    }
    
    public void setLargura(double largura){
        this.largura = largura;
    }
    
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    
    @Override
    public double calcularArea(){
        return largura*altura;
    }
    
}




public class Circulo extends Forma{
    
    private double raio;
    
    public Circulo(String cor, double raio){
        super(cor);
        this.raio = raio;
    }
    
    public double getRaio(){
        return raio;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }
}
