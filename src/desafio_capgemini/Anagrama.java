package desafio_capgemini;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author omega
 */
public class Anagrama {
    
public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String palavra="";

		System.out.println("Quer verificar quantos pares de anagramas tem em uma palavra?");
		System.out.println("Digite a palavra que deseja verificar: \n");
		palavra=leia.next();

		// chamamos função para contagem.
		contagem_palavra(palavra);
	}

	static int contagem_palavra(String string) {

		//Uso de HashMap para quardar elementos
		HashMap<String, Integer> lista = new HashMap<>();

		//o valor y percorre sempre que valor x finalizar de percorrer e
		//o limite de ambos é o tamanho da palavra
		for (int y = 0; y <= string.length(); y++) { 
		  for (int x = y; x < string.length(); x++) {

			// char[] guarda as sub-arrays, contando +1 no tamanho até chegar ao limite da palavra
			char[] palavraArray = string.substring(y, x + 1).toCharArray();
			Arrays.sort(palavraArray); //sort() para troca de posições
			String pseudoP = new String(palavraArray); //string pseudoP recebe valor de todo o conjunto do array palavraArray
				if (lista.containsKey(pseudoP)) {
				lista.put(pseudoP, lista.get(pseudoP) + 1);
				} else {lista.put(pseudoP, 1);
			 }
		  }
	   }
		//contagem final para resultado de anagramas
		int contagemP = 0;
		for (String cont : lista.keySet()) {
			int z = lista.get(cont);
			contagemP += ((z - 1)*z)/2;
		}
		System.out.print(contagemP);
                return contagemP;
		}
	}