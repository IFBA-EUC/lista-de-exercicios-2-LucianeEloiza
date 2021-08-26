import java.util.Scanner;
public class questao16 {
	public static double segundo;
	public static double minutos;
	public static double hora;
	
	public static double getSegundo() {
			return segundo;
		
	}
	public void setSegundo(double segundo) {
		if ((segundo >= 0) && (segundo <= 60)) {
		this.segundo = segundo; }
	}
	public static double getMinutos() {
		return minutos;
	}
	public void setMinutos(double minutos) {
		if ((minutos >= 0 && (minutos <= 60))) {
		this.minutos = minutos; }
	}
	public static double getHora() {
		return hora; 
	}
	public void setHora(double hora) {
		if ((hora > 0) && (hora <= 23)) {
		this.hora = hora;
		}
	}
	public static void conversao (int a) {
	int conversaoSH = a /3600;
	int conversaoHM= ((a - (conversaoSH * 3600)) / 60);
	int conversaoMS = a - (conversaoSH * 3600) - (conversaoHM * 60);
	System.out.println (" hora: " +conversaoSH+ "," +conversaoHM+ "minutos,"+conversaoMS+ "segundos" );	
		
	}
	
	public static void main(String[] args) {
	 Scanner digite = new Scanner (System.in);
	 
	 System.out.println (" digite os segundos para saber quanto vale em horas, minutos e segundos");
	 int a=digite.nextInt(); 
	 questao16 calculos = new questao16();
     calculos.conversao(a);	 
	 }
	
}





	

		
		




