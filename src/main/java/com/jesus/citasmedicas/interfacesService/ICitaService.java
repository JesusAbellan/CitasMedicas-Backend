package com.jesus.citasmedicas.interfacesService;

import com.jesus.citasmedicas.models.Cita;
import java.util.List;
import java.util.Optional;

public interface ICitaService {
	public List<Cita> getCitas();
	public Optional<Cita> getCitaId(Integer id);
	public List<Cita> getCitasByMedico(String dni);
}
