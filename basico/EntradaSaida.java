package cursoJava.basico;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		//Cria��o de vari�veis
		String nome;
		String idade;
		String altura;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu nome:");
		nome = leitor.nextLine();
		System.out.println(nome);

	}

}
