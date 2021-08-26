import java.util.Scanner;


public class supermecado {


	public static void main(String[] args) {
	
		Scanner digite = new Scanner (System.in);
		System.out.println("seja bem vindo(a) ao supermercado!!!");
		System.out.println("Qual função pretende utilizar?");
		System.out.println("1- fazer um pedido");
		System.out.println("2- cadrastar um produto");
		System.out.println("3- Sair");
		int ac = digite.nextInt();
		  
		if (ac == 1) {
			System.out.println("olá, vc deseja fazer um pedido");
			System.out.println("vamos começar");
			System.out.println("Os produtos disponiveis nesse mercado são: ");
			supermecado calculos = new supermecado();
   
			produto c1 = new produto();
			produto c2 = new produto();
			produto c3 = new produto();
			
	      c1.exibirprodutos("1-kit de limpeza", "50,00 reais", 100);
          c2.exibirprodutos("2-kit de cozinha" , "100,00 reais", 45);
          c3.exibirprodutos("3-Kit de banho", "250,00 reais", 134);
          
          System.out.println("Escolha seu produto de acordo com a numeração ao lado do mesmo:   ");
          int prodt = digite.nextInt();
          System.out.println("otima escolha!!");
          System.out.println("Agora vamos fechar o pedido");
          System.out.println("Digite seu nome: ");
	      String nomedocliente = digite.next();
	      System.out.println("Digite quantidade itens: ");
	      int quantidadedeitens= digite.nextInt();
	      System.out.println("Digite forma de pagamento: ");
	      System.out.println("1- pagamento em cartão: ");
	      System.out.println("2- pagamento em cheque: ");
	      System.out.println("3- pagamento em Dinheiro: ");
	      int formadepagamento1 = digite.nextInt();
	      if ( formadepagamento1 == 1) {
				System.out.println("pagamento em Cartão"); }
			else if (formadepagamento1 == 2) {
				System.out.println("pagamento em Cheque");}
			else {
				System.out.println("pagamento em dinheiro");
				} }
		else if ( ac == 2) {
			System.out.println("voce deseja cadrastar um produto, então bora la");
			System.out.println("Digite o nome de produto:  ");
			String p1 = digite.next();
			System.out.println("A quantidade desse produto:  ");
			int Q1 = digite.nextInt();
			System.out.println("Digite o preço que o produto será vendido:  ");
			double N1 = digite.nextDouble();
			 System.out.println("prontinho seu produto foi cadrastado, veja as informações a seguir: ");
			 System.out.println("nome: " +p1+ " quantidade:  " +Q1+ " preço: " +N1+ "R$" ); }
	        
		else {
			System.out.println("saindo do perfil !");
		}
        
		System.out.println("Obrigado por visitar nosso perfil !");
		System.out.println("volte sempre !");
		
		
		
		}
		
		
		
		
	}


