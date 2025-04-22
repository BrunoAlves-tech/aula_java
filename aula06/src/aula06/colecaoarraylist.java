package aula06;

import java.util.Scanner;

public class colecaoarraylist {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Arraylist<Double> numeros = new Arraylist<Double>();
		
		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(9.0);
		numeros.add(6.0);
		numeros.add(2.0);
		
		System.out.println("Digite um numero real:");
		double input = leia.nextDouble();
		
		numeros.add(input);
		
		for(var numero : numeros) {
			System.out.println(numero);
			
			
		}
		System.out.println("Indice do numero9.0:" + numeros.indexOf(9.0));
		
		System.out.println("O numero 9.0 existe na coleção?" + numeros.conteins(9.0));
		
		System.out.println("Qual valor esta armazenado no indice 2?" + numeros.get(2));
		
		
		numeros.set(2, 10.0);
		
		numero.forEach(System.out::println);

		
		leia.close();
	}

}
