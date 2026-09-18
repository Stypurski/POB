package Exercícios.Lista07.RetanguloValidaçãoSetters.dominio;

public class Retangulo {

    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        setLargura(largura);
        setAltura(altura);
    }

    public void setLargura(double largura){
        if(largura>0){
            this.largura = largura;
        }else{
            this.largura = 1.0;
            System.out.println("Valor inserido invalido, o sistema atribuiu o valor padrao 1.0");
        }
    }

    public void setAltura(double altura){
        if(altura>0){
            this.altura = altura;            
        }else{
            this.altura = 1.0;
            System.out.println("Valor inserido invalido, o sistema atribuiu o valor padrao 1.0");
        }

    }

    public double calcularArea(){
            return largura * altura;
        }
        
    public double calcularPerimetro(){
            return 2* (largura + altura);
        }
    
}
