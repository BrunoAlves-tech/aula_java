package aula04;

import java.util.Scanner;

public class tabuadawhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
	int contador = 1;
	
		System.out.println("Digite um numero inteiro:");
		int numero = leia.nextInt();
		
		while(contador <= 10) {
			System.out.printf("\n %d x %d = %d", numero, contador, (numero + contador));
			contador++;
			
			
		}
		
		leia.close();

	}

}
