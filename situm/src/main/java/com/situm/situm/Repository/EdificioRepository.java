package com.situm.situm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.situm.situm.Model.EdificioModel;

@Repository
public interface EdificioRepository extends JpaRepository<EdificioModel, Integer> {



}
