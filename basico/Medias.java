package cursoJava.basico;

public class Medias {

	public static void main(String[] args) {
		double media1, media2, somaMedias, mediaGeral;
		
		media1 = (8+9+7)/3;
		media2 = (4+5+6)/3;
		
		somaMedias = media1 + media2;
		
		mediaGeral = (media1 + media2) / 2;
		
		System.out.println("Valor da m�dia 1 >> " + media1);
		System.out.println("Valor da m�dia 2 >> " + media2);
		System.out.println("Valor da soma das m�dias >> " + somaMedias);
		System.out.println("Valor da m�dia Geral >> " + mediaGeral);
	}

}
