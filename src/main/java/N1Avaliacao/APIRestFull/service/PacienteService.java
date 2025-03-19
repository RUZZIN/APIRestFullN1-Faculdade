package N1Avaliacao.APIRestFull.service;

import N1Avaliacao.APIRestFull.entity.Paciente;
import N1Avaliacao.APIRestFull.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    private final PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> findById(Integer id) {
        return pacienteRepository.findById(id);
    }

    public Paciente save(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public void deleteById(Integer id) {
        pacienteRepository.deleteById(id);
    }
}