package cursoJava.basico;

public class VariaveisEConstantes {

	public static void main(String[] args) {
		//Cria��o de constantes;
		
		final double ACELERACAO_GRAVIDADE = 9.80665;
		
		//Cria��o de varia�veis;
		String nome = "Augusto C�sar";
		int idade = 37;
		double peso = 75.65, altura = 1.73;
		char sexo = 'M', cnh = 'B';
		boolean doadorOrgaos = true;
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("Sexo: " + sexo);
		System.out.println("Habilita��o: " + cnh);
		System.out.println("� doador de �rg�os: " + doadorOrgaos);
		System.out.println("Gravidade na terra >> " + ACELERACAO_GRAVIDADE);
		

	}

}
