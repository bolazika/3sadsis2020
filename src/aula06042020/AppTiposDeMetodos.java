package aula06042020;

public class AppTiposDeMetodos {
	public static void main(String[] args) {
		Pessoa maria = new Pessoa();
		maria.setNome("Mariana");
		maria.setAltura(1.70);
		maria.setIdadeEmAnos(30);
		maria.setPeso(62);
		
		//DIA
		//> Declaracao, Instanciacao, Atribuicao <
		
		Pessoa joao = new Pessoa();
		
		joao.setNome("Jose");
		joao.setAltura(1.82);
		joao.setIdadeEmAnos(53);
		joao.setPeso(90);
		
		Pessoa igor = new Pessoa();
		
		igor.setNome("Igor Elias");
		igor.setIdadeEmAnos(20);
		igor.setAltura(1.70);
		igor.setPeso(90);
		
		System.out.println(maria.getNome() + ", IMC =" + maria.getIMC());
		System.out.println(joao.getNome() + ", IMC = " + joao.getIMC());
		System.out.println(igor.getNome() + ", IMC =" + igor.getIMC());
	}

}
