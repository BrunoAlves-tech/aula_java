package aula03;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		
		String nome;
		String cargos[] = {"Gerente", "Vendedor", "Supervisor","Motorista", "Estoquista",  "Tecnico de TI"};
		int codCargo;
		float ajuste[] = {0.10f,0.07f,0.09f,0.06f,0.05f,0.08f};
		float salario, novoSalario;
		char verificadorChar;
		boolean verificadorBoolean = true;
		
		
		do {
			
			System.out.println("======================");
			System.out.println("Reajuste de sal�rio");
			System.out.println("======================");
			
			
			System.out.println("Digite o nome do colaborador: ");
			nome = leia.nextLine();
			
			
			for(int i = 0; i < 6 ; i++) {
				System.out.printf("%s ----------- %d\n",cargos[i], i+1);
			}
			
			
			do {
				System.out.println("Digite o codigo do cargo: ");
				codCargo = leia.nextInt();
				
				if(codCargo < 1 || codCargo > 6) {
					System.out.println("Insira um n�mero v�lido!");
				}
				
			}while(codCargo < 1 || codCargo > 6 );
			
			
			
			System.out.println("Digite o sal�rio: ");
			salario = leia.nextFloat();
			
			switch (codCargo) {
		    case 1:
		    case 2:
		    case 3:
		    case 4:
		    case 5:
		    case 6:
		        novoSalario = salario + (salario * ajuste[codCargo]);
		        System.out.printf("\nNome: %s\nCargo: %s\nNovo sal�rio: %.2f\n", 
		                          nome, cargos[codCargo - 1], novoSalario);
		        break;
			}

			
			System.out.printf("Deseja fazer uma nova consulta? (y or n): ");
			verificadorChar = leia.next().charAt(0);
			leia.nextLine();
			
			if(verificadorChar == 'y') {
				
				for (int i = 0; i < 25; ++i) {
				    System.out.println();
				}
				verificadorBoolean = true;
			}else {
				verificadorBoolean = false;
			}
			
		}while(verificadorBoolean);
		
		System.out.println("Obrigado!");
		leia.close();
		
		
		
	}

}