package livraria;

public class RegistroDeVendas {
	public static void main(String[] args){
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-drive Development");
		fisico.setValor(5900.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-drive Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionar(fisico);
		carrinho.adicionar(ebook);
		
		System.out.println("Total:\t" + carrinho.getTotal());
		
		
	}
}
