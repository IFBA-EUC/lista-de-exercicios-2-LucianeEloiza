 //a) O programa correto � o programa A
// b) segue abaixo o programa corrigido:

 import java.util.Scanner;

   public class questao7 {
   public static void main(String[] args) {
  
    
	 Scanner teclado = new Scanner(System.in);
	 int codigo;
	 System.out.print("Informe o c�digo: ");
	 codigo = teclado.nextInt();
	 do {
	  System.out.println("C�digo: " + codigo);
	  System.out.print("Informe o c�digo: ");
	 codigo = teclado.nextInt();
	
	 } while (codigo != -1 ); 
	 
	    
   }
	 
   }
  
   
   
   
   
