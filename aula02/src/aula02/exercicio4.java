package aula02;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner leia = new Scanner(System.in);
		System.out.println("Insira sua Numero1");
		float numero1 = leia.nextFloat();
		System.out.println("Insira sua Numero2");
		float numero2 = leia.nextFloat();
		System.out.println("Insira sua Numero3");
		float numero3 = leia.nextFloat();
		System.out.println("Insira sua Numero4");
		float numero4 = leia.nextFloat();
		float calculo = (numero1 * numero2)-(numero3 * numero4);
		
		System.out.printf("Media final: %.1f",calculo);

	}
	

}
