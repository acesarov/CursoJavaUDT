package cursoJava.basico;

import java.util.*;

public class antecessorSucessor {

	public static void main(String[] args) {
		int numero;
		
		Scanner n = new Scanner(System.in);
		
		System.out.print("Digite um número >>");
		numero = n.nextInt();
		
		System.out.println("O antecessor de " + numero + " é >> " + (numero-1));
		System.out.println("O Sucessor de " + numero + " é >> " + (numero+1));

	}

}
