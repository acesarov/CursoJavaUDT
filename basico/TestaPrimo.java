package cursoJava.basico;
//Diz se o n�mero digitado � primo ou n�o
import java.util.Scanner;

public class TestaPrimo {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		int contador = 0;
		
		System.out.print("Digite o n�mero a ser testado >>");
		int x = numero.nextInt();
				
		for (int i =1; i <= x ; i++)
			if (x % i == 0)
				contador++;
		if (contador == 2)
			System.out.println("O n�mero testado � primo");
		else
			System.out.println("O n�mero testado n�o � primo");
		
	}


	

}
