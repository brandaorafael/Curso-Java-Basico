package livraria;

public class Autor {
	private String nome;
	private String email;
	private String cpf;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	void mostrarDetalhes(){
		String mensagem = "Mostrando detalhes do autor:";
		System.out.println(mensagem);
		System.out.println("nome:\t\t" + nome);
		System.out.println("Email:\t\t" + email);
		System.out.println("CPF:\t\t" + cpf);
	}
}
