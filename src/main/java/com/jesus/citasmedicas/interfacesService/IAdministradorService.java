package com.jesus.citasmedicas.interfacesService;

import java.util.List;
import java.util.Optional;

import com.jesus.citasmedicas.models.Administrador;

public interface IAdministradorService {
	public List<Administrador> getAdministradores();
	public Optional<Administrador> getAdministrador(String dni);
}
