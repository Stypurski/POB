package Exercícios.Lista08.FormasGeométricasCálculoÁrea.dominio;

public class FiguraGeometrica{

    public double calcularArea(){
        return 0.0;
    }
}



class Quadrado extends FiguraGeometrica{

    private double lado;

    public Quadrado(double lado){
        this.lado= lado;
    }

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado*lado;
    }
}

class Retangulo extends FiguraGeometrica{

    private double largura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura= altura;
    }

    public double getLargura(){
        return largura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }



    private double altura;

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

class Circulo extends FiguraGeometrica{

    private double raio;

    public Circulo(double raio){
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
        return Math.PI * raio * raio;
    }
}
