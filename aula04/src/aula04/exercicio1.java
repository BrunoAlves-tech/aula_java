package aula04;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int primeiroNumero, segundoNumero;
		
		System.out.println("Digite o Primeiro Numero:");
		
		primeiroNumero = leia.nextInt();
		
		System.out.println("Digite o Segundo Numero:");
		
		segundoNumero = leia.nextInt();
		
		if(primeiroNumero > segundoNumero) {
			System.out.println("Numero Invalido");
		}else {
			
			System.out.printf("%d", (primeiroNumero % 2));
			for(int valor = primeiroNumero; valor <= segundoNumero; valor++){
				
			System.out.printf("%d \n", valor);
			}
		}
	}
}
