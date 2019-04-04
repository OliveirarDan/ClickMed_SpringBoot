package br.com.click.med.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.click.med.model.Paciente;
import br.com.click.med.repository.PacienteRepository;
import br.com.click.med.service.implementation.IPacienteService;

@Service
@Transactional
public class PacienteService implements IPacienteService {

	private PacienteRepository pacienteRepository;

	@Autowired
	public void setPacienteRepository(PacienteRepository pacienteRepository) {
		this.pacienteRepository = pacienteRepository;
	}
	
	@Override
	public List<Paciente> buscarTodos() {
		return pacienteRepository.findAll();
	}

}
