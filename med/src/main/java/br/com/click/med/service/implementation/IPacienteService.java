package br.com.click.med.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.click.med.model.Paciente;

@Service
public interface IPacienteService {

	List<Paciente> buscarTodos();
	
}
