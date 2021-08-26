//primeiro codigo:
package Agendatelefonica;

public class contato {
	private String nome;
	private String local;
	private String email;
	private int numero;
	
	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	String getLocal() {
		return local;
	}

	void setLocal(String local) {
		this.local = local;
	}

	String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}

	int getNumero() {
		return numero;
	}

	void setNumero(int numero) {
		this.numero = numero;
	}

	public contato(String nome, String local, String email, int numero) {
		this.nome = nome;
		this.local = local;
		this.email = email;
		this.numero = numero;
	}
   public void exibircontato() {
	   System.out.println("nome: " +this.getNome()+ " local: " +this.getLocal()+ " numero: " +this.getNumero()+ " email: " +this.getEmail());
}
}