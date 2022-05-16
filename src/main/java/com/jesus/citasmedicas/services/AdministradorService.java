package com.jesus.citasmedicas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jesus.citasmedicas.interfaces.IAdministrador;
import com.jesus.citasmedicas.interfacesService.IAdministradorService;
import com.jesus.citasmedicas.models.Administrador;

@Service
public class AdministradorService implements IAdministradorService {

	@Autowired
	private IAdministrador administradorRepository;
	
	@Override
	public List<Administrador> getAdministradores() {
		return (List<Administrador>) administradorRepository.findAll();
	}

	@Override
	public Optional<Administrador> getAdministrador(String dni) {
		return administradorRepository.findById(dni);
	}

}
