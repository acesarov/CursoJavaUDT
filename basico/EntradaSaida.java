package cursoJava.basico;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		//Criação de variáveis
		String nome;
		String idade;
		String altura;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu nome:");
		nome = leitor.nextLine();
		System.out.println(nome);

	}

}
