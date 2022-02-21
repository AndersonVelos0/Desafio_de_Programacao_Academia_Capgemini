package primeira_questao;

import java.util.Scanner;

public class PrimeiraQuestao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o valor:");
		int i = 0, j = 0;
		int numero = teclado.nextInt();
			for (i = numero; i > 0; i--) {
				for (j = i; j > 1; j--) {
				System.out.print(" ");
			}
			for (j = numero; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		teclado.close();
		System.out.println("Você chegou ao fim do programa!");
		
	}
}
	
	

