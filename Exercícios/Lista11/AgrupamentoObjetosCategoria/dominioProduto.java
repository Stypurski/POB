package Exercícios.Lista11.AgrupamentoObjetosCategoria.dominio.Produto;

public class Produto {

	private String nome;
	private String categoria;
	private double preco;

	public Produto(String nome, String categoria, double preco) {
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
	}
	
	public String getNome({
	    return nome;
	}
	
	public String getCategoria(){
	    return categoria;
	}
	
	public double getPreco(){
	    return preco;
	}
	
	@Override
    public String toString() {
        return nome + " RS " + preco;
    }
}

public class Agrupamento extends Produto{
    public void preenchedor() {

		List<String> produto = Produto.criarProdto();

		String temp;

		System.out.println("Insira 5 categorias: ");
		for(int i=0; i<5; i++) {
			temp = sc.nextLine();
			produto.add(temp);
		}
	}
	
	public void concatenador() {

		HashMap<String, List<Produtos>> listas = new HashMap<>();

		for(String temp : listas){
		    
		}
}
