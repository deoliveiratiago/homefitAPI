package ga.deoliveiratiago.homefitAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import ga.deoliveiratiago.homefitAPI.domain.Aluno;
import ga.deoliveiratiago.homefitAPI.repositories.AlunoRepository;
import ga.deoliveiratiago.homefitAPI.services.exceptions.DataIntegrityViolation;
import ga.deoliveiratiago.homefitAPI.services.exceptions.ObjectNotFound;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository repo;

	public Aluno find(Integer id) {
		Optional<Aluno> obj = repo.findById(id);
		return obj.orElseThrow(
				() -> new ObjectNotFound("Objeto não encontrado! Id: " + id + ", Tipo: " + Aluno.class.getName()));
	}

	public Aluno insert(Aluno obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Aluno update(Aluno obj) {
		find(obj.getId());
		return repo.save(obj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolation("Não foi possível excluir.");
		}
	}

	public List<Aluno> findAll() {
		return repo.findAll();
	}
}
