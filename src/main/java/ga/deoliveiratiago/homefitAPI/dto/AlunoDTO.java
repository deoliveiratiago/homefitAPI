package ga.deoliveiratiago.homefitAPI.dto;

import java.io.Serializable;

import ga.deoliveiratiago.homefitAPI.domain.Aluno;

public class AlunoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	Integer id;
	String nome;

	public AlunoDTO() {
		super();
	}

	public AlunoDTO(Aluno obj) {
		id = obj.getId();
		nome = obj.getNome();
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoDTO other = (AlunoDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
