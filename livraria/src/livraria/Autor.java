package livraria;

public class Autor {
	String nome;
	String email;
	String cpf;
	
	void mostrarDetalhes(){
		String mensagem = "Mostrando detalhes do autor:";
		System.out.println(mensagem);
		System.out.println("nome:\t\t" + nome);
		System.out.println("Email:\t\t" + email);
		System.out.println("CPF:\t\t" + cpf);
	}
}
