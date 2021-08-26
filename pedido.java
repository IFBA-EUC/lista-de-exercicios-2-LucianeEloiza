
public class pedido {
	String nomedocliente;
	int quantidadedeintens;
	int formadepagamento;
	
	public String getNomedocliente() {
		return nomedocliente;
	}
	public void setNomedocliente(String nomedocliente) {
		this.nomedocliente = nomedocliente;
	}
	public int getQuantidadedeintens() {
		return quantidadedeintens;
	}
	public void setQuantidadedeintens(int quantidadedeintens) {
		this.quantidadedeintens = quantidadedeintens;
	}
	public int getFormadepagamento() {
		return formadepagamento;
	}
	public void setFormadepagamento(int formadepagamento) {
		this.formadepagamento = formadepagamento;
	}
	private static void pedido(String nomedocliente, int quantidadedeintens, int formadepagamento) {
	    nomedocliente = nomedocliente;
	    quantidadedeintens = quantidadedeintens;
		formadepagamento = formadepagamento;
		System.out.println("nome do cliente: " +nomedocliente+ " quantidade de itens: " + quantidadedeintens+ "forma de pagamento: " + formadepagamento);
	}
	

}
