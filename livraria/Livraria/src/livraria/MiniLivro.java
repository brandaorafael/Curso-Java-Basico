package livraria;

public class MiniLivro extends Livro {
	public MiniLivro(Autor autor){
		super(autor);
	}
	
	public boolean aplicarDescontoDe(double porcentagem){
		return false;
	}
}
