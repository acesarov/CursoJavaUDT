package cursoJava.basico;

import java.util.*;

public class antecessorSucessor {

	public static void main(String[] args) {
		int numero;
		
		Scanner n = new Scanner(System.in);
		
		System.out.print("Digite um n�mero >>");
		numero = n.nextInt();
		
		System.out.println("O antecessor de " + numero + " � >> " + (numero-1));
		System.out.println("O Sucessor de " + numero + " � >> " + (numero+1));

	}

}
