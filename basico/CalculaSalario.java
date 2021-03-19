package cursoJava.basico;

import java.util.*;

public class CalculaSalario {

	public static void main(String[] args) {
		
		double sal_Minimo = 788.00,sal_Usuario;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite o valor do seu SALÁRIO >> ");
		sal_Usuario = s.nextDouble();
		
		System.out.println("O usuário ganha " + sal_Usuario/sal_Minimo + " SM");
		
		
	}

}
