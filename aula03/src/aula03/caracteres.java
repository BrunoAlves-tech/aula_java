package aula03;

public class caracteres {

	public static void main(String[] args) {
		
		String frase_01 = "Turma Java 82";
		String frase_02 = "TURMA JAVA 82";
		String frase_03 = "Turma Java 82";
		String frase_04 = "TURMA JAVA 82";
		
		
		System.out.println(frase_01 == frase_02);
		System.out.println(frase_04 == frase_02);
		
		System.out.println(frase_01.equals(frase_02));
		System.out.println(frase_04.equals(frase_02));
		
		System.out.println(frase_01.equalsIgnoreCase(frase_02));
		System.out.println(frase_04.equalsIgnoreCase(frase_02));
		
		System.out.println(frase_01.compareTo(frase_02));
		System.out.println(frase_02.compareTo(frase_02));
		

	}

}
