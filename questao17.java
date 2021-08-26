import java.util.Scanner;
public class questao17 {
	 public static void main(String[] args) {
	int[] Numero = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    String[] Romano = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    
    Scanner teclado = new Scanner (System.in);
    System.out.println("digite um numero: ");
    int numero = teclado.nextInt();
    
  if (numero < 1000) {
       
      if (numero == 0)
        System.out.printf("%-4d ", numero);
        int i = 0;
        while (numero > 0) {
            if (numero >= Numero[i]) {
                System.out.print(Romano[i]);
                numero -=Numero[i]; 
             } else {
            i++; }
        }
        
	 }
  else {
	  System.out.println("Só é aceito numeros de 3 digitos" );
  }
}
}




