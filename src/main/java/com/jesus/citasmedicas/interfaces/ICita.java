package com.jesus.citasmedicas.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jesus.citasmedicas.models.Cita;

@Repository
public interface ICita extends CrudRepository<Cita, Integer> {
	@Query(value ="SELECT * FROM CitasMedicas.citas as c WHERE c.medico_id = :id", nativeQuery=true)
	List<Cita> findByMedico(@Param("id")String id);
}
