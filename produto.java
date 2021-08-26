
public class produto {
	private static String nome;
	private static String preço;
	private static int quantidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPreço() {
		return preço;
	}
	public void setPreço(String preço) {
		this.preço = preço;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public static void exibirprodutos( String nome, String preço ,int quantidade ) {
		System.out.println("nome: " +nome+ " preço: " +preço+ " quantidade: " +quantidade);
		nome = nome;
		preço = preço;
		quantidade= quantidade;
	
	
}
}
