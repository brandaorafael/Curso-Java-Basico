package livraria;

public class CarrinhoDeCompras {
	private double total;
	
	public void adicionar(Produto produto){
		System.out.println("Adicionado:\t" + produto);
		total += produto.getValor();
	}
	
	public double getTotal(){
		return this.total;
	}
}
