
public class produto {
	private static String nome;
	private static String pre�o;
	private static int quantidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPre�o() {
		return pre�o;
	}
	public void setPre�o(String pre�o) {
		this.pre�o = pre�o;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public static void exibirprodutos( String nome, String pre�o ,int quantidade ) {
		System.out.println("nome: " +nome+ " pre�o: " +pre�o+ " quantidade: " +quantidade);
		nome = nome;
		pre�o = pre�o;
		quantidade= quantidade;
	
	
}
}
