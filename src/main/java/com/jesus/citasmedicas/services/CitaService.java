package com.jesus.citasmedicas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jesus.citasmedicas.interfaces.ICita;
import com.jesus.citasmedicas.interfacesService.ICitaService;
import com.jesus.citasmedicas.models.Cita;

@Service
public class CitaService implements ICitaService {

	@Autowired
	private ICita citaRepository;
	
	@Override
	public List<Cita> getCitas() {
		return (List<Cita>) citaRepository.findAll();
	}

	@Override
	public Optional<Cita> getCitaId(Integer id) {
		return citaRepository.findById(id);
	}

	@Override
	public List<Cita> getCitasByMedico(String dni) {
		return (List<Cita>) citaRepository.findByMedico(dni);
	}

}
