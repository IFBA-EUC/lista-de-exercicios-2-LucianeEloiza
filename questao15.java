import java.util.Scanner;
public class questao15 {
 static double resultado;
      
	public void media (double nota1, double nota2, double nota3) {
		resultado = (nota1+nota2+nota3)/3;
		System.out.println("a media é: " + resultado);
	}
	public static void exibir(double resultado) {
		if (resultado < 4) {
			System.out.println("REPROVADO"); }
		else if (resultado >=4 && resultado<=6) {
			System.out.println("VERIFICAÇÃO SUPLEMENTAR");}
		else {
			System.out.println("APROVADO"); }
	}
		public static void main(String[] args) {
	        
	        Scanner digite = new Scanner(System.in);
	        System.out.println("Digite NOTA 1: ");
	        double nota1 = digite.nextDouble();
	        System.out.println("Digite NOTA 2: ");
	        double nota2 = digite.nextDouble();
	        System.out.println("Digite NOTA 3: ");
	        double nota3 = digite.nextDouble(); 
	        
	       questao15 calculos = new questao15();
	        calculos.media(nota1,nota2,nota3);
	        exibir(resultado); 
	
	
	}
}
	

