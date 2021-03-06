package livraria;

public class LivroFisico extends Livro implements Promocional {

	public LivroFisico(Autor autor){
		super(autor);
	}
	
	public double getTaxaimpressao(){
		return this.getValor()*0.05;
	}
	
	public boolean aplicarDescontoDe(double porcentagem){
		if(porcentagem > 0.30){
			return false;
		}
		double novoValor = (getValor() - (getValor()*porcentagem));
		
		this.setValor(novoValor);
		
		return true;
	}
}
