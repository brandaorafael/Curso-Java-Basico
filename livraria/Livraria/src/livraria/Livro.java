package livraria;

public class Livro {
	String nome;
	String descricao;
	double valor;
	String isbn;
	Autor autor;
	
	void mostrarDetalhes(){
		String mensagem = "Mostrando detalhes do livro:";
		System.out.println(mensagem);
		System.out.println("Nome:\t\t" + nome);
		System.out.println("Descrição:\t" + descricao);
		System.out.println("Valor:\t\t" + valor);
		System.out.println("Código isbn:\t" + isbn);
		System.out.println("--");
		autor.mostrarDetalhes();
	}
}
