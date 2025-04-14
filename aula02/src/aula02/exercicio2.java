package aula02;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		System.out.println("Insira sua Nota 1");
		float nota1 = leia.nextFloat();
		System.out.println("Insira sua Nota 2");
		float nota2 = leia.nextFloat();
		System.out.println("Insira sua Nota 3");
		float nota3 = leia.nextFloat();
		System.out.println("Insira sua Nota 4");
		float nota4 = leia.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("Media final: %.1f",media);
	}

}
