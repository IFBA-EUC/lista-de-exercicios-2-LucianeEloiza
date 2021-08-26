import java.util.Scanner;
public class questao18 {
 
	public static void main(String[] args) {
		String[] unidade= new String[22];
		String [] dezena= new String[10];
		String [] centena = new String [11];
		int i = 0;
		
		unidade[0] = "zero";
		unidade[1] = "Um";
		unidade[2] = "Dois";
		unidade[3] = "Três";
		unidade[4] = "Quatro";
		unidade[5] = "Cinco";
		unidade[6] = "Seis";
		unidade[7] = "sete";
		unidade[8] = "oito";
		unidade[9] = "Nove";
		unidade[10] = "Dez";
		unidade[11] = "Onze";
		unidade[12] = "Doze";
		unidade[13] = "Treze";
		unidade[14] = "Quatorze";
		unidade[15] = "Quinze";
		unidade[16] = "Dezesseis";
		unidade[17] = "Dezessete";
		unidade[18] = "Dezoito";
		unidade[19] = "Dezenove";
		
		dezena[0] = "";
		dezena[1] = "dez"; 
		dezena[2] = "vinte";
		dezena[3] = "trinta";
		dezena[4] = "quarenta";
		dezena[5] = "ciquenta";
		dezena[6] = "Sessenta";
		dezena[7] = "setenta";
		dezena[8] = "oitenta";
		dezena[9] = "noventa";
		
		centena[0] = "Cento";
		centena[1] = "Cem";
		centena[2] = "Duzentos";
		centena[3] = "Trezentos";
		centena[4] = "Quatrocentos";
		centena[5] = "Quinhentos";
		centena[6] = "Seiscentos";
		centena[7] = "Setecentos";
		centena[8] = "Oitocentos";
		centena[9] = "Novecentos";
		centena[10]= "Mil";
		
		Scanner digite = new Scanner (System.in);
		 System.out.println("digite um numero: " );
		 int numero = digite.nextInt();
		if (numero == 1000) {
			System.out.println("o numero digitado foi:  " +centena[9] );
		}
		if (numero <= 19) {
			System.out.println("o numero digitado foi:  " +unidade[numero]); }
		
		 if (numero > 19 && numero<= 90) {
			int dez = numero / 10;
			int uni = numero % 10;
			  if (uni == 0) {
			  System.out.println("o numero digitado foi:  " +dezena[dez] ); }
			  else {
				System.out.println("o numero digitado foi:  " +dezena[dez] +" e "  +unidade[uni] );	} }
	      
       if (numero >= 100 && numero < 1000) {
    	   int cent = numero / 100;
			int dezen = (numero %100) / 10;
			int unid =  ((numero%100)%10);
			
	            if (cent ==1 && dezen == 0 && unid == 0) {
				System.out.println("o numero digitado foi:  " +centena[1] ); 	   }
	            else {
	            	
	            }
	            if (dezen ==0) {
					System.out.println("o numero digitado foi:  " +centena[cent]+ " e " +unidade[unid]);	
				}
	            if (unid == 0){
	            	System.out.println("o numero digitado foi:  " +centena[cent]+ " e " +dezena[dezen]); }
	            
	            else {
	            	System.out.println("o numero digitado foi:  " +centena[cent]+ " e " +dezena[dezen]+ " e " +unidade[unid]);
	            }
	            
			}
	}
	}

			  
			
			
		 
			
	

	





		
	
	

	
	


