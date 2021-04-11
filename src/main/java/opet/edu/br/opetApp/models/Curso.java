package opet.edu.br.opetApp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Curso")
public class Curso {

	@Id
	private int id_curso;
	private String des_curso;

	public Curso(int id_curso, String des_curso) {
		super();
		this.id_curso = id_curso;
		this.des_curso = des_curso;
	}

	public int getId_curso() {
		return id_curso;
	}
	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}
	public String getDes_curso() {
		return des_curso;
	}
	public void setDes_curso(String des_curso) {
		this.des_curso = des_curso;
	}

}
