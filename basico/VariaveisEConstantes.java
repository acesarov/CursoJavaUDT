package cursoJava.basico;

public class VariaveisEConstantes {

	public static void main(String[] args) {
		//Criação de constantes;
		
		final double ACELERACAO_GRAVIDADE = 9.80665;
		
		//Criação de variaáveis;
		String nome = "Augusto César";
		int idade = 37;
		double peso = 75.65, altura = 1.73;
		char sexo = 'M', cnh = 'B';
		boolean doadorOrgaos = true;
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("Sexo: " + sexo);
		System.out.println("Habilitação: " + cnh);
		System.out.println("É doador de órgãos: " + doadorOrgaos);
		System.out.println("Gravidade na terra >> " + ACELERACAO_GRAVIDADE);
		

	}

}
