package cursoJava.basico;

import java.util.*;

public class valorCompra {

	public static void main(String[] args) {
		int cod_Peca1, cod_Peca2, valor_Peca1, valor_Peca2,
		qtd_Peca1, qtd_Peca2; 
		
		double valor_Ipi, valor_Compra;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Qual a porcentagem do IPI >> ");
		valor_Ipi = leitor.nextDouble();
		
		System.out.print("Digite o c�digo da pe�a 01 >> ");
		cod_Peca1 = leitor.nextInt();
		
		System.out.print("Quantidade de pe�as " + cod_Peca1+ " >> ");
		qtd_Peca1 = leitor.nextInt();
		
		System.out.print("Valor da pe�a C�digo " + cod_Peca1 + " >> ");
		valor_Peca1 = leitor.nextInt();
		
		System.out.print("Digite o c�digo da pe�a 02 >> ");
		cod_Peca2 = leitor.nextInt();
		
		System.out.print("Quantidade de pe�as " + cod_Peca2+ " >> ");
		qtd_Peca2 = leitor.nextInt();
		
		System.out.print("Valor da pe�a C�digo " + cod_Peca2+ " >> ");
		valor_Peca2 = leitor.nextInt();
		
		valor_Compra = (valor_Peca1*qtd_Peca1 + valor_Peca2*qtd_Peca2)* (valor_Ipi/100+1);
		
		System.out.println("O valor total da compra foi >> " + valor_Compra);
		
	}

}
