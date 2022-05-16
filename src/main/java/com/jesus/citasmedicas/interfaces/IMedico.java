package com.jesus.citasmedicas.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jesus.citasmedicas.models.Medico;

@Repository
public interface IMedico extends CrudRepository<Medico, String> {

}
