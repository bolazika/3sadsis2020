package aula06042020;

public class Pessoa {
	private String nome;
	private int idadeEmAnos;
	private double peso;
	private double altura;
	
	public double getIMC() {
		return peso/(altura*altura);
	}
	
	
	// Getter
	public String getNome() {
		return this.nome;
	}
	
	// Setter
	public void setNome(String nome) {
		if (nome.length() == 0 || nome.trim().length() <= 1 ){
			throw new RuntimeException("Nome invalido!");
		}
		this.nome = nome;
	}
	
	public double getAltura() {
		return this.altura;
	}
	public void setAltura(double altura) {
		if (altura <= 0.25) {
			throw new RuntimeException("Altura invalida! A sua altura tem que ser maior que 25cm");
		}
		this.altura = altura;
	}
	
	public int getIdadeEmAnos() {
		return this.idadeEmAnos;
	}
	public void setIdadeEmAnos(int idadeEmAnos) {
		this.idadeEmAnos = idadeEmAnos;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		if (peso <= 0 ) {
			throw new RuntimeException("Peso invalido! peso tem que ser maior que 0");
		}
		
		this.peso = peso;
	}
	

}
