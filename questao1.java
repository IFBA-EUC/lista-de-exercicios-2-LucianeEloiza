import java.util.Scanner;
public class questao1 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double delta= 0;
		double raizquadradadelta = 0;
		double raiz1;
		double raiz2;
		
		Scanner digite = new Scanner (System.in);
		
		System.out.println(" de acordo com a equaçaõ:  ax² + bx + cx = 0");
		
		System.out.println(" digite valor de a: ");
		a = digite.nextDouble();
        System.out.println(" digite valor de b: ");
    	b = digite.nextDouble();
		System.out.println("digite o valor de c: ");
		c =digite.nextDouble();
		 
		 
		 
		 
	 if (a == 0) {
		 System.out.println("valor de a invalido");
	 }
	 else {
		 delta = (b*b)- (4*a*c);
		 raizquadradadelta = (int)Math.sqrt(delta);
	 }
	
	if (delta > 0 ) {
		raiz1 = ((-1)*b + raizquadradadelta)/(2*a);
		raiz2 = ((-1)*b - raizquadradadelta)/(2*a);
		System.out.printf("Raízes: %.1f e %.1f", raiz1, raiz2);
	} else if (delta == 0) {
	    raiz1 = ((-1)*b + raizquadradadelta)/(2*a);
	    System.out.printf(" A Raíz é: %.1f ", raiz1); }
       
	else {
		 System.out.printf("valor de delta é negativo,a equação não terá raízes reais");
	  }
		
		 }
		}
	
