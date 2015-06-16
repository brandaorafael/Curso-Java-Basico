package livraria;

public class RegrasDeDesconto {
	public static void main(String[] args){
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro livro = new MiniLivro(autor);
		livro.setValor(39.90);
		
		if (!livro.aplicarDescontoDe(0.3)){
			System.out.println("Desconto n�o pode ser maior do que 30%!");
		} else {
			System.out.println("Valor do livro com desconto:" + livro.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(59.90);
		
		if (!ebook.aplicarDescontoDe(0.3)){
			System.out.println("Desconto n�o pode ser maior do que 15%!");
		} else {
			System.out.println("Valor do livro com desconto:" + ebook.getValor());
		}
		
	}
}
