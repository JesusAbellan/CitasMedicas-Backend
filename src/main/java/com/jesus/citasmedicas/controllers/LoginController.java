package com.jesus.citasmedicas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jesus.citasmedicas.dto.ClienteRegistroDTO;
import com.jesus.citasmedicas.models.Cliente;
import com.jesus.citasmedicas.services.ClienteService;

@CrossOrigin
@RestController
@RequestMapping("/api/")
public class LoginController {
	@Autowired
	private ClienteService clienteService;
	@GetMapping("/prueba")
	public String prueba() {
		return "Esto es una prueba";
	}
	
	@ModelAttribute("/cliente")
	public ClienteRegistroDTO getNewCliente() {
		return new ClienteRegistroDTO();
	}
	
	@PostMapping("/registroCliente")
	public ResponseEntity<Cliente> signupCliente(@ModelAttribute("cliente") ClienteRegistroDTO clDTO) {
		Cliente cl = clienteService.save(clDTO);
		if(cl == null) {
			return ResponseEntity.notFound().build();
		}
		return new ResponseEntity<Cliente>(HttpStatus.CREATED);
	}

}
