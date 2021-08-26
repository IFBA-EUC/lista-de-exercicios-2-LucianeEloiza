
public class pessoa {
	public String nome;
	public int numero;
	private int codigo;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
		public pessoa(String nome, int numero, int codigo) {
		this.nome = nome;
		this.numero = numero;
		this.codigo = codigo;
	}


		
	
		public void exibirpessoa() {
		System.out.println("nome: " +this.getNome()+ "numero: " +this.getNumero());
	
	}
	
		
	}	
	

