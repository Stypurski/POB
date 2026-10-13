package Exercícios.Lista09.IntegraçãoCompleta.dominio;



public interface Tributavel{
    
    double calcularTributo();
}





public abstract class Item{
    
    private int codigo;
    private double precoBase;
    
    public Item(int codigo, double precoBase){
        this.codigo = codigo;
        this.precoBase = precoBase;
    }
    
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    
    public double getPrecoBase(){
        return precoBase;
    }
    
    public void setPrecoBase(double precoBase){
        this.precoBase = precoBase;
    }
}



public class Eletronico extends Item implements Tributavel{
    
    public Eletronico(int codigo, double precoBase){
       super(codigo, precoBase);
    }
    
    
    @Override
    public double calcularTributo(){
        return getPrecoBase()*0.15;
    }
}



public class Alimento extends Item{
    
    public Alimento(int codigo, double precoBase){
       super(codigo, precoBase);
    }
}
