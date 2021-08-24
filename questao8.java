import java.util.Scanner;

public class questao8 {
 
public static void main(String[] args) {
	 
    int f0 = 0;
    int f1 = 1;
    int aux = 0;
    int numero = 0;

    Scanner digite = new Scanner(System.in);
    System.out.println("digite um  numero: ");
    numero = digite.nextInt();

    if (numero < 0) { 
        System.out.println("ERRO,nao aceitamos numeros negativos");
    
    
    } else if (numero == 0) {
            System.out.println(f0);
        } else if (numero == 1) {
            System.out.println(f0 + f1);
    } else {
    	System.out.println(f0);
    	System.out.println(f0 + f1);
        for (int i = 1; i < numero; i++) {
        	aux = f0;
            f0 = f1;
            f1 = f1 + aux;
            
            System.out.println(f1);
        }
    }
}

}




 


