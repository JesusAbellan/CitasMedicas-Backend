package com.jesus.citasmedicas.interfacesService;

import com.jesus.citasmedicas.models.Especialidad;
import java.util.List;
import java.util.Optional;

public interface IEspecialidadService {
	public List<Especialidad> getEspecialidad();
	
	public Optional<Especialidad> getEspecialidadById(String id);
	
	public Optional<Especialidad> getEspecialidadByNombre(String nombre);
}
