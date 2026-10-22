import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CatalogoService{
    
    private final List<Produto> produtos = new ArrayList<>();
    
    
    public void cadastrar(Produto p){
        if(p == null){
            throw new IllegalArgumentException("Valor nulo");
        }
        if(this.produtos.contains(p)){
            throw new IllegalArgumentException("Codigo ja cadastrado");
        }
        
        this.produtos.add(p);
    }
    
    
    public Produto obterPorPosicao(int indice){
        if(indice< 0){
            throw new IllegalArgumentException("Valores negativos sao invalidos");
        }
        if(indice >= this.produtos.size()){
            throw new IndexOutOfBoundsException("Indice estoura a memoria");
        }
        return produtos.get(indice);
    }
    
    
    public boolean excluirPorCodigo(String codigo){
        if(codigo == null || codigo.trim().isEmpty()){
            throw new NullPointerException("Codigo vazio/ nulo");
        }

        Produto aux = new Produto(codigo, "", 0.0, 0);
        
        if(this.produtos.contains(aux)){
            this.produtos.remove(aux);
            return true;
        }
        
        return false;
    }
    
    
    public void ordenarPorPreco(){
        Collections.sort(this.produtos);
    }
}
