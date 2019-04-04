package br.com.click.med.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.click.med.service.PacienteService;

@Controller
public class PacienteController {

	@Autowired
	PacienteService pacienteService;

	@RequestMapping(value = "/pacientes", method = RequestMethod.GET)
	public String abrirTelaDePacientes(ModelMap model) {
		model.put("pcs", pacienteService.buscarTodos());
		return "pacientes";
	}

}
