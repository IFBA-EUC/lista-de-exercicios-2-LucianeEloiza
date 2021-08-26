//segundo codigo:
package Agendatelefonica;
import java.util.Scanner; 
public class agenda {

	public static void main(String[] args) {
		Scanner digite = new Scanner (System.in);
		System.out.println("olá, seja bem vindo a sua agenda");
		System.out.println("digite 1 para ter acesso ao seus contatos ou 0 para sair");
		int acesso =digite.nextInt();
		
		if (acesso == 1) {
		contato c1 = new contato("paula", "Euclides","pauala@gamil.com", 99873456);
		contato c2 = new contato("eduardo", "são paulo","eduardo12@gamil.com", 9763456);
		contato c3 = new contato("maria", "rio de janeiro","maria34@gamil.com", 99897645);
		contato c4 = new contato("pedro", "Aracaju","Pedro.lucas@gmail.com", 98645896);
		contato c5 = new contato("henrique", "Minas Gerais","henrique15oliver@gmail.com", 92354678);
		
		c1.exibircontato();
		c2.exibircontato();
		c3.exibircontato();
		c4.exibircontato();
		c5.exibircontato(); }
		 
		else {
			System.out.println("tchau até a proxima!");
		}
		
		

	}

}
