package terceira_questao;

import java.util.Scanner;

	public class TerceiraQuestao {
		public static void main (String[] args){
			System.out.println("Digite a primeira palavra: ");
			try (Scanner teclado = new Scanner(System.in)) {
				String s1 = teclado.next();
				System.out.println("Digite a segunda palavra: ");
				String s2 = teclado.next();
				if (isAnagrama(s1, s2)) {
					
				System.out.println("As palavras digitadas são anagramas!");				
				}else
				System.out.println("As palavras digitadas são não anagramas!");
			    
				
	}    
			
}

		private static boolean isAnagrama(String s1, String s2) {
			int r = 0; 
			
			for (int i = 0; i < s1.length(); i++)
				r = r ^ s1.charAt(i);
			for (int i = 0;i<s2.length(); i++)
				r = r ^ s2.charAt(i);		
			return (r==0);
		
			
	}		
		
}