package aula02;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o Salario Bruto:");
		float salariobruto = leia.nextFloat();
		System.out.println("Digite o Adicional Noturno:");
		float adicionalnoturno = leia.nextFloat();
		System.out.println("Digite o Horas Extras:");
		float horasextras = leia.nextFloat();
		System.out.println("Descontos:");
		float descontos = leia.nextFloat();
		float salarioliquido = salariobruto + adicionalnoturno + (horasextras*5) - descontos;
		System.out.printf("Salario Liquido:%.2f",salarioliquido);
	
		
	}
	
	

}
