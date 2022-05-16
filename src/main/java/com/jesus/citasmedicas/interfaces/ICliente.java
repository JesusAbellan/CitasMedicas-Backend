package com.jesus.citasmedicas.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jesus.citasmedicas.models.Cliente;

@Repository
public interface ICliente extends CrudRepository<Cliente, String> {

}
