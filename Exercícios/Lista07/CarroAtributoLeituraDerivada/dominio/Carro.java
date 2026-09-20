package Exercícios.Lista07.CarroAtributoLeituraDerivada.dominio;

public class Carro{

    private String modelo;
    private int ano;
    private int velocidadeAtual;

    public Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getVelocidadeAtual(){
        return velocidadeAtual;
    }

    public int getAno(){
        return ano;
    }

    public void acelerar(int incremento){
        this.velocidadeAtual += incremento;
    }

    public void frear(int decremento){

        int aux = this.velocidadeAtual;
        if((aux -= decremento) < 0){
            System.out.print("Valor inserido invalido");
            return;
        }else{
             this.velocidadeAtual -= decremento;
        }
    }

    public boolean isEmMovimento(){
        return velocidadeAtual > 0;
    }


}