package cursoJava.basico;
import java.util.*;

public class CalculaIdade {

	public static void main(String[] args) {
		int idade, ano, mes, dia;
		Scanner i = new Scanner(System.in);
		
		System.out.println("Digite a sua idade abaixo:");
		System.out.print("Anos >> ");
		ano = i.nextInt();
		System.out.print("Meses >> ");
		mes = i.nextInt();
		System.out.print("Dias >> ");
		dia = i.nextInt();
		
		idade = ano * 365 + mes * 30 + dia;
		
		System.out.print("Sua idade equivale a " + idade + " dias");
		
		

	}

}
