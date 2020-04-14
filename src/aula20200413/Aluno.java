package aula20200413;

import java.util.Calendar;

public class Aluno {
	
	private String RA;
	private String primeiroNome;
	private String segundoNome;
	private String curso;
	private int anoDeIngresso;
	
	
	
	// contrutor padrao
	public Aluno() {
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR); // calendario 
		setAnoDeIngresso(anoAtual);
	
		
	}
	
	// construtor alternativo
	public Aluno(String RA, String primeroNome, String segundoNome, String curso, int anoDeIngresso) {
	}
	
	public void setRA(String RA) {
		this.RA = RA;
	}
	
	public void setPrimeiroNome(String primeoroNome) {
		this.primeiroNome = primeoroNome;
	}
	
	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void setAnoDeIngresso(int anoDeIngresso) {
		this.anoDeIngresso = anoDeIngresso;
	}

}
