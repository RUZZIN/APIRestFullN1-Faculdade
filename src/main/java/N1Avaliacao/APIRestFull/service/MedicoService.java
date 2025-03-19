package N1Avaliacao.APIRestFull.service;

import N1Avaliacao.APIRestFull.entity.Medico;
import N1Avaliacao.APIRestFull.repository.MedicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoService {

    private final MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public List<Medico> findAll() {
        return medicoRepository.findAll();
    }

    public Optional<Medico> findById(Integer id) {
        return medicoRepository.findById(id);
    }

    public Medico save(Medico medico) {
        return medicoRepository.save(medico);
    }

    public void deleteById(Integer id) {
        medicoRepository.deleteById(id);
    }
}