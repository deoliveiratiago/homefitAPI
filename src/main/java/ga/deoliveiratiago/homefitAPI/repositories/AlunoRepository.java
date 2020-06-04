package ga.deoliveiratiago.homefitAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ga.deoliveiratiago.homefitAPI.domain.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
