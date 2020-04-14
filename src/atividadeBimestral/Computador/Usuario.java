package atividadeBimestral.Computador;

import java.util.Calendar;

public class Usuario {
	private String criarNomeDeUsuario;
	private int criarSenha;
	private String nomeDoGrupo;
	private int simularAnoCriado;
	
	public String toString() {
		return "Bem Vindo ao Discord! \nUsuário: " + getCriarNomeDeUsuario() + " " + "\nGrupo criado: " + getNomeDoGrupo() + "." + "\nGrupo foi criado a " + getIdadeDoGrupo() + " " + "anos atras.";
		}
	
	// padrao
	public Usuario() {
		
	}
	
	// alternativo
	public Usuario(String criarNomeDeUsuario, int criarSenha, String nomeDoGrupo, int simularAnoCriado) {
		setCriarNomeDeUsuario(criarNomeDeUsuario);
		setCriarSenha(criarSenha);
		setNomeDoGrupo(nomeDoGrupo);
		setSimularAnoCriado(simularAnoCriado);
		
		
	}
	
//--
	private int setAnoAtual() {
		return Calendar.getInstance().get(Calendar.YEAR);
	}

	public void setCriarNomeDeUsuario(String criarNomeDeUsuario) {
		this.criarNomeDeUsuario = criarNomeDeUsuario;
		
	}
	
	public String getCriarNomeDeUsuario() {
		return criarNomeDeUsuario;
	}
	
// --
	
	public void setCriarSenha(int criarSenha) {
		this.criarSenha = criarSenha;
		
	}
	public int getCriarSenha() {
		return criarSenha;
	}
	
//--
	
	public void setNomeDoGrupo(String nomeDoGrupo) {
		this.nomeDoGrupo = nomeDoGrupo;
		
	}
	public String getNomeDoGrupo() {
		return nomeDoGrupo;
	}

	public void setSimularAnoCriado(int simularAnoCriado) {
		this.simularAnoCriado = simularAnoCriado;
		
	}
	public int getIdadeDoGrupo() {
		return setAnoAtual() - simularAnoCriado;
	}
}
