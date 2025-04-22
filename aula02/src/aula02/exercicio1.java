package aula02;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o salario");
		float salario = leia.nextFloat();
		System.out.println("Digite o abono");
		float abono = leia.nextFloat();
		float novosalario;
		
		novosalario = salario + abono;
		System.out.printf("Mostrar novo salario %.2f" ,novosalario);
	
		
	
	}
	

}
