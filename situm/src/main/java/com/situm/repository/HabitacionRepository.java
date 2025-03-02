package com.situm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.situm.model.HabitacionModel;

@Repository
public interface HabitacionRepository extends JpaRepository<HabitacionModel, Integer> {

    public List<HabitacionModel> findByidEdificio(int idEdificio);

    public List<HabitacionModel> findByNumeroPlanta(int NumeroPlanta);

    public List<HabitacionModel> findByCategoria(String categoria);

    public List<HabitacionModel> findByCapacidad(int capacidad);

    public List<HabitacionModel> findByEstado(String estado);

    public List<HabitacionModel> findByLetraPuerta(String letraPuerta);

    public List<HabitacionModel> findByNumeroBanios(int numeroBanios);

    public List<HabitacionModel> findByidEdificioAndNumeroPlanta(int idEdificio, int NumeroPlanta);

    public List<HabitacionModel> findByidEdificioAndCategoria(int idEdificio, String categoria);

    public List<HabitacionModel> findByidEdificioAndCapacidad(int idEdificio, int capacidad);

    public List<HabitacionModel> findByidEdificioAndEstado(int idEdificio, String estado);

    public List<HabitacionModel> findByidEdificioAndLetraPuerta(int idEdificio, String letraPuerta);

    public List<HabitacionModel> findByidEdificioAndNumeroBanios(int idEdificio, int numeroBanios);    

}
