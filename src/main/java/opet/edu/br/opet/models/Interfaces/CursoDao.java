package opet.edu.br.opet.models.Interfaces;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import opet.edu.br.opetApp.models.Curso;

@Repository
@Transactional

public interface CursoDao extends JpaRepository<Curso, Integer> {

	public Curso findById(int id);

}
