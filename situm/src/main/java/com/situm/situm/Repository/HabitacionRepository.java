package com.situm.situm.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.situm.situm.Model.HabitacionModel;
/*
 * Esta interfaz es la encargada de gestionar las consultas a la base de datos de la tabla habitación
*/
@Repository
public interface HabitacionRepository extends JpaRepository<HabitacionModel, Integer> {



}

