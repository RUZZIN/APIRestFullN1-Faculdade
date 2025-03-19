package N1Avaliacao.APIRestFull.service;

import N1Avaliacao.APIRestFull.entity.Consulta;
import N1Avaliacao.APIRestFull.entity.Medico;
import N1Avaliacao.APIRestFull.entity.Paciente;
import N1Avaliacao.APIRestFull.repository.ConsultaRepository;
import N1Avaliacao.APIRestFull.repository.MedicoRepository;
import N1Avaliacao.APIRestFull.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService {

    private ConsultaRepository consultaRepository;
    private MedicoRepository medicoRepository;
    private PacienteRepository pacienteRepository;

    public ConsultaService(ConsultaRepository consultaRepository, MedicoRepository medicoRepository, PacienteRepository pacienteRepository) {
        this.consultaRepository = consultaRepository;
        this.medicoRepository = medicoRepository;
        this.pacienteRepository = pacienteRepository;
    }

    public List<Consulta> findAll() {
        return consultaRepository.findAll();
    }

    public Optional<Consulta> findById(Integer id) {
        return consultaRepository.findById(id);
    }

    // Salva uma nova consulta
    public Consulta save(Consulta consulta) {
        // Verifica se o médico e o paciente existem
        Optional<Medico> medico = medicoRepository.findById(consulta.getMedico().getId());
        Optional<Paciente> paciente = pacienteRepository.findById(consulta.getPaciente().getId());

        if (medico.isPresent() && paciente.isPresent()) {
            // Define o médico e o paciente na consulta
            consulta.setMedico(medico.get());
            consulta.setPaciente(paciente.get());

            // Verifica se o paciente já tem uma consulta agendada no mesmo horário
            List<Consulta> consultasNoMesmoHorario = consultaRepository.findByPacienteAndHorario(consulta.getPaciente(), consulta.getHorario());
            if (consultasNoMesmoHorario.isEmpty()) {
                consulta.setStatus("agendada");
                return consultaRepository.save(consulta);
            } else {
                throw new IllegalArgumentException("O paciente já tem uma consulta agendada para este horário.");
            }
        } else {
            throw new IllegalArgumentException("Médico ou paciente não encontrado.");
        }
    }

    public void deleteById(Integer id) {
        consultaRepository.deleteById(id);
    }

    // Cancela uma consulta pelo ID
    public Consulta cancelarConsulta(Integer id) {
        Optional<Consulta> consulta = consultaRepository.findById(id);
        if (consulta.isPresent()) {
            Consulta consultaParaCancelar = consulta.get();
            consultaParaCancelar.setStatus("cancelada");
            return consultaRepository.save(consultaParaCancelar);
        } else {
            throw new IllegalArgumentException("Consulta não encontrada.");
        }
    }

    // Realiza uma consulta pelo ID
    public Consulta realizarConsulta(Integer id) {
        Optional<Consulta> consulta = consultaRepository.findById(id);
        if (consulta.isPresent()) {
            Consulta consultaParaRealizar = consulta.get();
            consultaParaRealizar.setStatus("realizada");
            return consultaRepository.save(consultaParaRealizar);
        } else {
            throw new IllegalArgumentException("Consulta não encontrada.");
        }
    }
}