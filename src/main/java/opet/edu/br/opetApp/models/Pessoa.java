package opet.edu.br.opetApp.models;

public class Pessoa {
	
	private String id;
	private String senha;
	
	public Pessoa(String id, String senha) {
		super();
		this.id = id;
		this.senha = senha;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
