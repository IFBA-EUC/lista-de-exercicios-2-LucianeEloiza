import java.util.Scanner;



public class emprestimo {

	public static void main(String[] args) {
		
		Scanner digite = new Scanner (System.in);
		System.out.println("ol�, seja bem vindo(a)");
		System.out.println("Digite o seu codigo:  ");
		int codigopessoa = digite.nextInt();
		 if (codigopessoa == 100) {
			 System.out.println("ol� Fernando"); }
		 else if (codigopessoa == 101) {
			 System.out.println("ol� Paula"); }
		 else if (codigopessoa== 102) {
			 System.out.println("ol� Pedro"); }
		 else {
			 System.out.println("ol� usuario novo"); }
		 
		System.out.println("qual fun��o pretende utilizar? ");
		System.out.println("1- pegar livro");
		System.out.println("2- devolver livro");
		System.out.println("3-emprestar livro");
		System.out.println("4-veja quem est� cadrasto");
		int acesso = digite.nextInt(); 
        
		if (acesso == 1) {
		System.out.println("Os livros disponiveis s�o: " );
		Livros c1 = new Livros("Amanhecer", 123, "lauren Cauper");
		Livros c2= new Livros("romace1998", 100, "Lindisy bly");
		Livros c3 = new Livros("Miranda", 111, "lohanny switch");
		Livros c4 = new Livros("Iracema", 112, "Jos� de Alencar"); 	
		
		c1.exibirLivro();
		c2.exibirLivro();
		c3.exibirLivro();
		c4.exibirLivro();
		System.out.println("digite o nome do livro que deseja obter: " );
		String nome = digite.next();
		System.out.println("voc� fez uma boa escolha! lembre-se que o emprestimo do livro � de 15 dias" );
		System.out.println("aproveite seu livro " + nome ); }
		else if (acesso == 2) {
		  System.out.println("Digite o codigo do livro: " );
		  int codigolivro = digite.nextInt();
		  System.out.println("Livro devolvido com sucesso!! " ); 
		  }
		else if (acesso == 3) {
			System.out.println("digite o nome do livro: " );
			String nomelivro = digite.next();
			System.out.println("crie o codigo do seu livro:" );
			 int codigolivro = digite.nextInt();
			 System.out.println("o nome do livro �: " +nomelivro+ " e o codigo �: " +codigolivro);
			 System.out.println("obrigado pelo emprestimo!!"); }
		else if (acesso == 4) {
		System.out.println("As pessoas cadastradas s�o: "); 
		
		
		pessoa c1 = new pessoa( "Paula ", 9989986, 101);
		pessoa c2= new pessoa("Pedro ", 99788967, 102);
		pessoa c3 = new pessoa("Fernando ", 9989374, 103);
		
	    c1.exibirpessoa();
	    c2.exibirpessoa();
	    c3.exibirpessoa();	 
	  }
		System.out.println("At� a proxima, tchau!! ");	
	}
	
}

