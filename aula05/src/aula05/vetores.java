package aula05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetorInteiros[] = {10, 15, 35, 70, 140, 280, 320, 480};
		
		Float vetorReal[] = new Float[5];
		
		String vetorStrings[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi" };
		
		float soma = 0;
		
		for(int indice = 0; indice < vetorInteiros.length; indice ++) {
		System.out.printf("\nvetorInteiros[%d] = %d:", indice, vetorInteiros[indice]);
		
		}
			
		for(int indice = 0; indice < vetorReal.length; indice ++) {
			System.out.printf("\nDigite um numero Real: ");
			vetorReal[indice] = leia.nextFloat();
		}
		
		for(var valor : vetorReal) {
			soma += valor;
		}
			System.out.println("Resultado da Soma" + soma );
			
			
			Arrays.sort(vetorReal);
			
			for(var valor : vetorReal) {
				System.out.println("Elemento atual" + valor);
				}
			Arrays.sort(vetorReal, Collections.reverseOrder());
			
			for (var valor : vetorReal) {
				System.out.println("Elemento atual: " + valor);
			}
			Arrays.sort(vetorStrings);
			
			for (var valor : vetorStrings) {
				System.out.println("Elemento atual: " + valor);
			}

		leia.close();
	}
}

