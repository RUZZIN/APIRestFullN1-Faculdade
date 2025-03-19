package N1Avaliacao.APIRestFull.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import N1Avaliacao.APIRestFull.entity.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Integer> {
	
}
