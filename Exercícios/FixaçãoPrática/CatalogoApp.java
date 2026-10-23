package Exercícios.FixaçãoPrática.CatalogoApp;

import Exercícios.FixaçãoPrática.Produto;
import Exercícios.FixaçãoPrática.CatalogoService;

public class CatalogoApp{
    public static void main(String[] args){
        
        CatalogoService catalogo = new CatalogoService();
        
        //cadastro
        Produto p1 = new Produto("P01", "Teclado", 250.00, 10);
        Produto p2 = new Produto("P02", "Mouse", 120.00, 15);
        Produto p3 = new Produto("P03", "Monitor", 900.00, 5);
        Produto p4 = new Produto("P04", "Mousepad", 50.00, 20);
        
        catalogo.cadastrar(p1);
        catalogo.cadastrar(p2);
        catalogo.cadastrar(p3);
        catalogo.cadastrar(p4);
        
        //exibindo por indice
        imprimirCatalogo(catalogo, 4);
        
        //excluindo
        boolean removido = catalogo.excluirPorCodigo("P02");
        
        //ordenando
        catalogo.ordenarPorPreco();
        
        //reimprimindo
        imprimirCatalogo(catalogo, 3);
    }
    
    //metodo para comprovacao
    private static void imprimirCatalogo(CatalogoService catalogo, int totalItens){
        for (int i = 0; i< totalItens; i++) {
            Produto p = catalogo.obterPorPosicao(i);
            System.out.println("Índice"+ i + " -> " + p);
        }
    }
}
