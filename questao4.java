import java.util.Scanner;
public class questao4 {

	public static void main(String[] args) {
		
		String produto;
		double preço;
		int quantidade;
		double desconto10 = 0.1;
		double desconto20 = 0.2;
		double desconto25 = 0.25;
		
		Scanner digite = new Scanner(System.in); 
		
		// informação sobre os produtos:
		  System.out.println(" digite o nome do produto: ");
		  produto = digite.next();
		  System.out.println(" digite o preço do produto: ");
		  preço = digite.nextDouble();
		  System.out.println(" digite a quantida de produto: ");
		  quantidade = digite.nextInt(); 
		  
		  // calculo do valor final;
		  double valorfinal = preço * quantidade; 
		  
		  
		  if (quantidade <=10) {
		  System.out.println("o nome do produto é " + produto +" e possui o valor: " + valorfinal); 
		  }
		  else if (quantidade >= 11 && quantidade <= 20) {
			  double totalcomdesconto10 = (valorfinal * desconto10) - valorfinal; 
			  System.out.println("o nome do produto é " + produto +" e possui o valor: " + totalcomdesconto10+ " com desconto de 10%"); 
			  }
		  else if(quantidade >= 21 && quantidade <= 50) {
				  double totalcomdesconto20 = (valorfinal * desconto20) - valorfinal;
				  System.out.println("o nome do produto é " + produto +" e possui o valor: " + totalcomdesconto20+ " com desconto de 20%");
				  }
			  else {
				  double totalcomdesconto25 = (valorfinal * desconto25) - valorfinal;
				  System.out.println("o nome do produto é " + produto +" e possui o valor: " + totalcomdesconto25+ " com desconto de 25%");
				  }
		  }

		  }

			  

		  



