package livraria;

public class CadastroDeLivros {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("123.456.789 - 10");
		
		MiniLivro livro = new MiniLivro(autor);
		livro.setNome("Java 8 Pr‡tico");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");
		
		livro.mostrarDetalhes();
	}
	
}
