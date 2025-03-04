package com.situm.situm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.situm.situm.Model.EdificioModel;

/**
 * Esta interfaz es la encargada de gestionar las consultas a la base de datos de la tabla edificio
 */

@Repository
public interface EdificioRepository extends JpaRepository<EdificioModel, Integer> {



}
