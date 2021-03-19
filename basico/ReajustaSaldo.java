package cursoJava.basico;
import java.util.*;
public class ReajustaSaldo {

	public static void main(String[] args) {
		double saldo;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Informe seu saldo >> ");
		saldo = leitor.nextDouble();
		
		saldo += saldo * 0.01;
		
		System.out.println("O saldo reajustado é >> " + saldo);

	}

}
