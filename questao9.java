
public class questao9 {
	//A saida do programa a seguir da questão 9 terá as seguintes saidas :
	//2, 2, 1
	//2, 3, 1
	//2, 3, 3
	//2, 4, 1
	//2, 4, 3
	//4, 4, 1
	public class Loop {
		 public static void main(String[] args) {
		 for (int i = 2; i <= 8; i = i + 2) {
		 for (int j = i; j <= 4; j++) {
		 for (int k = 1; k <= j; k = k + i) {
		 System.out.println(i + ", " + j + ", " + k);
		 }
		 }
		 }
		 }
	}
}
