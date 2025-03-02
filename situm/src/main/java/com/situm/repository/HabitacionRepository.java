package com.situm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.situm.model.HabitacionModel;

@Repository
public interface HabitacionRepository extends JpaRepository<HabitacionModel, Integer> {

    public HabitacionModel save(HabitacionModel habitacion);

    public List findAll();

    public List findById(int id);

    public List deleteById(int id);

    public int count(int id);

}
