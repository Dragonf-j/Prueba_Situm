package com.situm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.situm.model.EdificioModel;

@Repository
public interface EdificioRepository extends JpaRepository<EdificioModel, Integer> {

public EdificioModel save(EdificioModel edificio);

public List findAll();

public EdificioModel findById(int id);

public EdificioModel deleteById(int id);

public int count(int id);

}
