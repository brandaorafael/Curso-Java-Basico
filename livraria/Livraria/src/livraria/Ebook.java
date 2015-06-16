package livraria;


public class Ebook extends Livro implements Promocional{
	private String waterMark;
	
	public Ebook(Autor autor){
		super(autor);
	}

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	public boolean aplicarDescontoDe(double porcentagem){
		if(porcentagem > 0.15){
			return false;
		}
		double novoValor = (getValor() - (getValor()*porcentagem));
		
		this.setValor(novoValor);
		
		return true;
	}
}
