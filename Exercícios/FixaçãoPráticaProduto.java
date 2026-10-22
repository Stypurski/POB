import java.util.Objects;

public class Produto implements Comparable<Produto>{
    
    private String codigo;
    private String descricao;
    private double preco;
    private int quantidade;
    
    public Produto(String codigo, String descricao, double preco, int quantidade){
        this.codigo = codigo;
        this.descricao = descricao;
        
        if(preco <0){
            throw new IllegalArgumentException("Variaveis negativas nao sao validas");
        }
        this.preco = preco;
        
        if(quantidade < 0){
            throw new IllegalArgumentException("Variaveis negativas nao sao validas");
        }
        this.quantidade = quantidade;
    }
    
    @Override
    public int compareTo(Produto pOutro){
        return Double.compare(this.preco, pOutro.preco);
    }
        
    @Override 
    public boolean equals(Object cdOutro){
        if(this == cdOutro){
            return true;
        }
        if(cdOutro == null || getClass() != cdOutro.getClass()){
            return false;
        }
        Produto outro = (Produto) cdOutro;
        
        return Objects.equals(this.codigo, outro.codigo);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(this.codigo);
    }
    
    @Override
    public String toString(){
        return String.format("\n\tProduto \n[codigo: %s\n descricao: %s\npreco: %.2f\nquantidade: %d]", 
                            this.codigo, this.descricao, this.preco, this.quantidade);
    }
}


