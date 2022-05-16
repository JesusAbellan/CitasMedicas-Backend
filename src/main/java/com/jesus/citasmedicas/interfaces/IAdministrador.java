package com.jesus.citasmedicas.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jesus.citasmedicas.models.Administrador;

@Repository
public interface IAdministrador extends CrudRepository<Administrador, String> {
}
