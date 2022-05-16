package com.jesus.citasmedicas.interfacesService;

import java.util.List;
import java.util.Optional;

import com.jesus.citasmedicas.models.Medico;

public interface IMedicoService {
	public List<Medico> getMedicos();
	
	public Optional<Medico> getMedicoById(String dni);

}
