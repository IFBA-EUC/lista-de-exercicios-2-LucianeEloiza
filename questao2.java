import java.util.Scanner;
public class questao2 {

	public static void main(String[] args) {
	Scanner digite = new Scanner ( System.in);
	
	double x1;
	double y1;
	double z1;
	
	double x2;
	double y2;
	double z2;
	
	  //dados do ponto A:
	  System.out.println(" digite o x do ponto A: ");
	  x1 = digite.nextDouble();
	  System.out.println(" digite o y do ponto A: ");
	  y1 = digite.nextDouble();
	  System.out.println(" digite o z do ponto A: ");
	  z1 = digite.nextDouble(); 
	  
	 //dados do ponto B:
	  System.out.println(" digite o x do ponto B: ");
	  x2 = digite.nextDouble();
	  System.out.println(" digite o y do ponto B: ");
	  y2= digite.nextDouble();
	  System.out.println(" digite o z do ponto B: ");
	  z2= digite.nextDouble(); 
	  
	  // calculo da distância;
	   
	  double distanciaAB = Math.sqrt(Math.pow(x2 - x1 , 2 ) + Math.pow(y2 - y1 , 2 ) + Math.pow(z2 - z1 , 2 ) ) ;
	  
	  System.out.printf("A distancia entre os dois pontos: %.1f%n  ",distanciaAB);	  
	}

}
