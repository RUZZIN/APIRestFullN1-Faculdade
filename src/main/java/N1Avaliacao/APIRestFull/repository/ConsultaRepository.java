package N1Avaliacao.APIRestFull.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import N1Avaliacao.APIRestFull.entity.Consulta;
import N1Avaliacao.APIRestFull.entity.Paciente;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {
	 List<Consulta> findByPacienteAndHorario(Paciente paciente, String horario);
}
