package cursoJava.basico;
/*
 * Classe de demonstração de operadores 10/03/2020
 */

public class Operadores {

	public static void main(String[] args) {
		//Operadores aritméticos + - * / %
		
		int numero1 = 10, numero2 = 8;
		
		int resultado1 = numero1 + numero2;
		System.out.println(resultado1);
		
		int resultado2 = numero1 - numero2;
		System.out.println(resultado2);

		int resultado3 = numero1 * numero2;
		System.out.println(resultado3);
		
		double resultado4 = (double) numero1 / numero2;
		System.out.println(resultado4);
		
		int resultado5 = numero1 % numero2;
		System.out.println(resultado5);
		
		int x = 20;
		System.out.println(x*=0.25);
		
	}

}
