package com.situm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.situm.model.EdificioModel;

@Repository
public interface EdificioRepository extends JpaRepository<EdificioModel, Integer> {

public EdificioModel findByNombre(String nombre);

public EdificioModel findByDireccion(String direccion);

public EdificioModel findbyNombreEdificio(String nombre);

public EdificioModel findbyNombreVia(String nombreVia);

public EdificioModel findbyPais(String pais);

public EdificioModel findbyProvincia(String provincia);

public EdificioModel findbyLocalidad(String localidad);

public EdificioModel findbyCodigoPostal(int codigoPostal);

public EdificioModel findbyCantidadPlantas(int cantidadPlantas);

public EdificioModel findbyCantidadHabitaciones(int cantidadHabitaciones);

public EdificioModel findbyTipoVia(String tipoVia);

public EdificioModel findbyIdEdificio(int idEdificio);


}
