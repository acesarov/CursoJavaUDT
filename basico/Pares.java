package cursoJava.basico;
//Imprime os pares e impares de 1 a 50
public class Pares {

	public static void main(String[] args) {
		for (int i = 1; i<= 50; i++)
			if (i % 2 == 0)
				System.out.println("I: " + i + " É par");
			else
				System.out.println("I: " + i + " É impar");

	}

}
