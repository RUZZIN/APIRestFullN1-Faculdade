package N1Avaliacao.APIRestFull.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicos")
public class Medico {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "especialidade", nullable = false, length = 100)
	private String especialidade;
	
	@Column(name = "crm", nullable = false, length = 100)
	private String crm;

	public Medico(Integer id, String nome, String especialidade, String crm) {
		this.id = id;
		this.nome = nome;
		this.especialidade = especialidade;
		this.crm = crm;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	@Override
	public String toString() {
		return "Consulta [id=" + id + ", nome=" + nome + ", especialidade=" + especialidade + ", crm=" + crm + "]";
	}
}
