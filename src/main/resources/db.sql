INSERT INTO medicos (nome, especialidade, crm) VALUES
('Dr. João Silva', 'Cardiologia', 'CRM12345'),
('Dr. Maria Oliveira', 'Dermatologia', 'CRM67890'),
('Dr. Pedro Santos', 'Neurologia', 'CRM11223'),
('Dr. Ana Costa', 'Pediatria', 'CRM44556'),
('Dr. Carlos Pereira', 'Ortopedia', 'CRM77889');

INSERT INTO pacientes (nome, cpf, data_nascimento, telefone) VALUES
('Paula Souza', '123.456.789-00', '1995-04-20', '(11) 98765-4321'),
('Rafael Lima', '987.654.321-00', '1980-05-15', '(21) 99876-5432'),
('Juliana Mendes', '456.123.789-00', '1992-09-10', '(31) 91234-5678'),
('Marcos Fernandes', '321.654.987-00', '1970-12-25', '(41) 92345-6789'),
('Beatriz Almeida', '654.987.321-00', '1985-07-30', '(51) 93456-7890');

INSERT INTO consultas (data, horario, paciente_id, medico_id, status) VALUES
('2025-03-20', '10:00:00', 1, 1, 'agendada'),
('2025-03-21', '11:00:00', 2, 2, 'agendada'),
('2025-03-22', '09:00:00', 3, 3, 'agendada'),
('2025-03-23', '14:00:00', 4, 4, 'agendada'),
('2025-03-24', '16:00:00', 5, 5, 'agendada');