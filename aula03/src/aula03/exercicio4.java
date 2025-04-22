package aula03;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String classe, tipo, dieta;
		char verificadorChar;
		boolean verificadorBoolean = true;

		
		do {
	
			System.out.println("===========================");
			System.out.println("Descobrindo os Animais!");
			System.out.println("===========================");
			System.out.println("\n");


			System.out.println("Digite a classe do animal (Vertebrado ou Invertebrado): ");
			classe = leia.nextLine();



		
			if (classe.equalsIgnoreCase("vertebrado")) {
				
				System.out.println("Digite o tipo do animal (Ave, Mam�fero): ");
				tipo = leia.nextLine();
				if (tipo.equalsIgnoreCase("ave")) {
				
					System.out.println("Digite a dieta do animal (Carn�voro, On�voro)");
					dieta = leia.nextLine();
					if (dieta.equalsIgnoreCase("carnivoro")) {
						System.out.println("Voc� descobriu a �guia! ");
						
					
						System.out.println("Deseja jogar novamente? y or n");
						verificadorChar = leia.next().charAt(0);
						leia.nextLine();

						if (verificadorChar == 'y') {
							
							for (int i = 0; i < 25; ++i) {
								System.out.println();
							}
							verificadorBoolean = true;
						} else {
							verificadorBoolean = false;
						}

					} 
					else {
						System.out.println("Voc� descobriu o POMBO! !");
						
						
						System.out.println("Deseja jogar novamente? y or n");
						verificadorChar = leia.next().charAt(0);
						leia.nextLine();

						if (verificadorChar == 'y') {
							
							for (int i = 0; i < 25; ++i) {
								System.out.println();
							}
							verificadorBoolean = true;
						} else {
							verificadorBoolean = false;
						}
					}
				}                 
				else {
					System.out.println("Digite a dieta do animal (On�voro, Herb�voro)");
					dieta = leia.nextLine();
					if (dieta.equalsIgnoreCase("onivoro")) {
						System.out.println("Voc� descobriu o HOMEM!");

						
						System.out.println("Deseja jogar novamente? y or n");
						verificadorChar = leia.next().charAt(0);
						leia.nextLine();

						if (verificadorChar == 'y') {
							
							for (int i = 0; i < 25; ++i) {
								System.out.println();
							}
							verificadorBoolean = true;
						} else {
							verificadorBoolean = false;
						}
					} 
					else {
						System.out.println("Voc� descobriu a VACA!");
						
						
						System.out.println("Deseja jogar novamente? y or n");
						verificadorChar = leia.next().charAt(0);
						leia.nextLine();

						if (verificadorChar == 'y') {
							
							for (int i = 0; i < 25; ++i) {
								System.out.println();
							}
							verificadorBoolean = true;
						} else {
							verificadorBoolean = false;
						}
					}

				} 
			
			}

			
			else {
				
				System.out.println("Digite o tipo do animal (Inseto, Anel�deo): ");
				tipo = leia.nextLine();
				if (tipo.equalsIgnoreCase("inseto")) {
				
					System.out.println("Digite a dieta do animal (Hemat�fago, Herb�voro)");
					dieta = leia.nextLine();
					if (dieta.equalsIgnoreCase("hematofago")) {
						System.out.println("Voc� descobriu a PULGA! E agora est� se co�ando");

				
						
						System.out.println("Deseja jogar novamente? y or n");
						verificadorChar = leia.next().charAt(0);
						leia.nextLine();

						if (verificadorChar == 'y') {
							
							for (int i = 0; i < 25; ++i) {
								System.out.println();
							}
							verificadorBoolean = true;
						} else {
							verificadorBoolean = false;
						}
					} 
					else {
						System.out.println("Voc� descobriu a LAGARTA!");

						
						System.out.println("Deseja jogar novamente? y or n");
						verificadorChar = leia.next().charAt(0);
						leia.nextLine();

						if (verificadorChar == 'y') {
						
							for (int i = 0; i < 25; ++i) {
								System.out.println();
							}
							verificadorBoolean = true;
						} else {
							verificadorBoolean = false;
						}
					} 
				} 
				else {
					System.out.println("Digite a dieta do animal (Hemat�fago, On�voro)");
					dieta = leia.nextLine();
					if (dieta.equalsIgnoreCase("hematofago")) {
						System.out.println("Voc� descobriu a SANGUESUGA! ");

						
						System.out.println("Deseja jogar novamente? y or n");
						verificadorChar = leia.next().charAt(0);
						leia.nextLine();

						if (verificadorChar == 'y') {
							
							for (int i = 0; i < 25; ++i) {
								System.out.println();
							}
							verificadorBoolean = true;
						} else {
							verificadorBoolean = false;
						}
					} 
					else {
						System.out.println("Voc� descobriu a MINHOCA! ");

						
						System.out.println("Deseja jogar novamente? y or n");
						verificadorChar = leia.next().charAt(0);
						leia.nextLine();

						if (verificadorChar == 'y') {
					
							for (int i = 0; i < 25; ++i) {
								System.out.println();
							}
							verificadorBoolean = true;
						} else {
							verificadorBoolean = false;
						}
					} 
				} 
			}
		} while (verificadorBoolean);

		System.out.println("parabens por jogar!");
		leia.close();

	}

}