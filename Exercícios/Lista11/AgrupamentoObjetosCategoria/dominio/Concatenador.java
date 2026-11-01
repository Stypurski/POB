package Exercícios.Lista11.AgrupamentoObjetosCategoria.dominio.Concatenador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concatenador{
    
    public Map<String, List<Produto>> concatenador(List<Produto> listaProdutos) {
        Map<String, List<Produto>> agrupado = new HashMap<>();

        for(Produto vez : listaProdutos) {
            
            String categoria = vez.getCategoria();
            
            if (!agrupado.containsKey(categoria)) {
                agrupado.put(categoria, new ArrayList<>());
            }
            agrupado.get(categoria).add(vez);
        }
        
        
        return agrupado;
    }
    
    public void exibidor(Map<String, List<Produto>> mapa) {
        for (Map.Entry<String, List<Produto>> categoria : mapa.entrySet()) {
            System.out.println("Categoria: " + categoria.getKey() + "\n");
            for (Produto produto : categoria.getValue()) {
                System.out.println("\t" + produto);
            }
        }
    }
}
