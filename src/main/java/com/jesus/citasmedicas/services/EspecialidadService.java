package com.jesus.citasmedicas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jesus.citasmedicas.interfaces.IEspecialidad;
import com.jesus.citasmedicas.interfacesService.IEspecialidadService;
import com.jesus.citasmedicas.models.Especialidad;

@Service
public class EspecialidadService implements IEspecialidadService {

	@Autowired
	private IEspecialidad especialidadRepository;
	@Override
	public List<Especialidad> getEspecialidad() {
		return (List<Especialidad>) especialidadRepository.findAll();
	}

	@Override
	public Optional<Especialidad> getEspecialidadById(String id) {
		return especialidadRepository.findById(id);
	}

	@Override
	public Optional<Especialidad> getEspecialidadByNombre(String nombre) {
		return especialidadRepository.findByNombre(nombre);
	}

}
