package com.jesus.citasmedicas.interfacesService;

import java.util.List;
import java.util.Optional;

import com.jesus.citasmedicas.models.Cliente;

public interface IClienteService {
	public List<Cliente> getClientes();
	
	public Optional<Cliente> getClienteId(String dni);
}
