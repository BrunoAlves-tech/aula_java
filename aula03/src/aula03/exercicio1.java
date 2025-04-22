package aula03;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int soma;
				
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Insira o Numero 1:");
		  a = leia.nextInt();
		System.out.println("Insira o Numero 2");
		  b = leia.nextInt();
		System.out.println("Insira o Numero 3");
		  c = leia.nextInt();
		
		soma = a + b;
		if (soma > c) {
		System.out.println(" Soma de A + B é Maior do que C"); 
		}else if (soma < c)
		{
		System.out.println("A Soma de A + B é Menor do que C");
	    }else {
	    System.out.println("A Soma de A + B é Igual a C");
	    
	    }
		leia.close();
	    }
}
