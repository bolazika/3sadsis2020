package atividadeBimestral.Computador;

public class AppDiscord {
	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		
		usuario.setCriarNomeDeUsuario("igor elias");
		usuario.setCriarSenha(123);
		usuario.setNomeDoGrupo("Meu Grupo Do Discord");
		usuario.setSimularAnoCriado(2005);
		
		Usuario igor = new Usuario("igor elias", 2311, "Os Zikas", 2010);
		
		System.out.println(igor);
		

		
	}
}
