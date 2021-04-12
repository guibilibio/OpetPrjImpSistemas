package opet.edu.br.opetApp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Pes")
public class Pessoa{
	
	@Id
	@GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
	private String id;
	@NotNull
	private int id_curso;
	@NotNull
	private String nome;
	@NotNull
	private int periodo;
	@NotNull
	@Column(unique = true, length = 50)
	private String login;
	@NotNull
	@Column(length = 50)
	private String senha;
	
	
	public Pessoa(String id, int id_curso, String nome, int periodo, String login, String senha){
		super();
		this.id = id;
		this.id_curso = id_curso;
		this.nome = nome;
		this.periodo = periodo;
		this.login = login;
		this.senha = senha;
	}
	
	public Pessoa() {
		
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public int getId_curso() {
		return id_curso;
	}

	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}
	
}
