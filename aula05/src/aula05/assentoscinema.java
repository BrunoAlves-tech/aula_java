package aula05;

public class assentoscinema {

	public static void main(String[] args) {
	
		int assentos[][] = {
				{0,1,1,0,1,0},
				{1,1,1,0,1,0},
				{0,1,0,1,1,1},
				{1,0,0,1,1,0},
				{1,1,1,0,1,1},
				{1,0,1,0,1,0}
		};
		int ocupadas = 0, livres = 0;
		
		for(var fila : assentos) {
			for(var assento : fila) {
				if(assento == 1) {
					ocupadas++;
				}else {
					livres++;
				}
			}		
		}
		
		System.out.printf("Assentos ocupados: %d\n", ocupadas);
		System.out.printf("Assentos livres: %d\n", livres);
		
		
	}

}