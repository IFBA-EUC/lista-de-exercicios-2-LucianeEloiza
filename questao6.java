import java.util.Scanner;
public class questao6 {

	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		System.out.println("digite um numero: ");
		int num = digite.nextInt();
		int cont= 0;
		
		while(num !=0) {
		num = num/10; cont++;
		
	}
   System.out.println( "o numero tem : " +cont+ " digitos");
   }
}