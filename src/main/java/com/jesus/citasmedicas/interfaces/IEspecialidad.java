package com.jesus.citasmedicas.interfaces;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jesus.citasmedicas.models.Especialidad;

@Repository
public interface IEspecialidad extends CrudRepository<Especialidad, String> {
	@Query(value ="SELECT * FROM CitasMedicas.especialidad as e WHERE e.nombre_especialidad = :nombre", nativeQuery=true)
	Optional<Especialidad> findByNombre(@Param("nombre")String nombre);
}
