package aula03;

import java.util.Scanner;

public class ConversorMoedas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valorconvertido = 0.0f;
		String moeda = "";
		
		System.out.println("****************************************************");
		System.out.println("               Conversor de Moedas"                  );
		System.out.println("****************************************************");
		System.out.println("                                                    ");
		System.out.println("1 - converter para Dolar (US$)                      ");
		System.out.println("2 - converter para Euros (EUR$)                     ");
		System.out.println("3 - converter para Pesos (AR$)                      ");
		System.out.println("                                                    ");
		System.out.println("****************************************************");
		System.out.println("DIgite a opção desejada:");
		
		
		int opcao = leia.nextInt();
		
		System.out.println("Digite ó valor em Reais (R$) ");
		double valor = leia.nextDouble();
		
		
		switch(opcao) {
		case 1:
			valorconvertido = valor / 5.86;
			moeda = "Dolar";
			break;
		case 2:
			valorconvertido = valor / 6.63;
			moeda = "Euro";	
			break;
		case 3:	
			valorconvertido = valor / 0.0049;
			moeda = "Peso Argentino";
			break;
		default: // 
			System.out.println("Opção invalida:");
			leia.close();
			return; // sair do programa
			
		}
		
		
		System.out.printf("valor convertido em %s: %.2f", moeda, valorconvertido);
		
		leia.close();

	}

}
