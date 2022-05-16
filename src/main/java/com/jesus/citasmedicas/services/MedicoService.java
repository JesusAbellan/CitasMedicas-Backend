package com.jesus.citasmedicas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jesus.citasmedicas.interfaces.IMedico;
import com.jesus.citasmedicas.interfacesService.IMedicoService;
import com.jesus.citasmedicas.models.Medico;

@Service
public class MedicoService implements IMedicoService {
	
	@Autowired
	private IMedico medicoRepository;
	@Override
	public List<Medico> getMedicos() {
		return (List<Medico>) medicoRepository.findAll();
	}

	@Override
	public Optional<Medico> getMedicoById(String dni) {
		return medicoRepository.findById(dni);
	}
}
