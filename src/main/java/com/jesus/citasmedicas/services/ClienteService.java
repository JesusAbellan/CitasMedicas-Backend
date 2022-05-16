package com.jesus.citasmedicas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jesus.citasmedicas.dto.ClienteRegistroDTO;
import com.jesus.citasmedicas.interfaces.ICliente;
import com.jesus.citasmedicas.interfacesService.IClienteService;
import com.jesus.citasmedicas.models.Cliente;

@Service
public class ClienteService implements IClienteService {

	@Autowired
	private ICliente clienteRepository;
	@Override
	public List<Cliente> getClientes() {
		return (List<Cliente>) clienteRepository.findAll();
	}

	@Override
	public Optional<Cliente> getClienteId(String dni) {
		return clienteRepository.findById(dni);
	}
	
	public Cliente save(ClienteRegistroDTO clienteDTO) {
		Cliente cl = new Cliente(clienteDTO.getDni(), clienteDTO.getNombre(), clienteDTO.getEmail(),
				clienteDTO.getContrasenia());
		return clienteRepository.save(cl);
	}

}
