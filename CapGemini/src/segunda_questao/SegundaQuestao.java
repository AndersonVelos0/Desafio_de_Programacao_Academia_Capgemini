package segunda_questao;

import java.util.Scanner;

public class SegundaQuestao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean fimDoPrograma = false;
		do {
			System.out.println("Informe a senha: ");
			String senha = teclado.next();
			String texto[] = senha.split("");
			int maiusculas = 0, minusculas = 0, numeros = 0, especiais = 0;
			
			if (texto.length <= 0) {
				System.out.println("Tamanho da senha não pode ser 0 caracteres.");
			}
			if (texto.length < 6) {
				System.out.println(
						"Informe senha com 6 caracteres ou mais. Falta: " + (6 - texto.length) + " Caracteres.");
			}
			for (int i = 0; i < senha.length(); i++) {
				char c = senha.charAt(i);
	
				if (Character.isDigit(c)) {
					numeros++;
				} else if (Character.isUpperCase(c)) {
					maiusculas++;
				} else if (Character.isLowerCase(c)) {
					minusculas++;
				} else {
					especiais++;
				}
			}
			if (maiusculas == 0) {
				System.out.println("Informe uma letra maiuscula!");
			}
			if (minusculas == 0) {
				System.out.println("Informe uma letra maiuscula!");
			}
			if (numeros == 0) {
				System.out.println("Informe uma letra minuscula!");
			}
			if (especiais == 0) {
				System.out.println("Informe um caracter especial!");
			}
			if (maiusculas > 0 && minusculas > 0 && numeros > 0 && especiais > 0) {
				System.out.println("A senha é considerada segura!");
				fimDoPrograma = true;
			}
		} while (fimDoPrograma != true);
		teclado.close();
	}
}


