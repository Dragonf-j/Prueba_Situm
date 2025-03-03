package com.situm.situm.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.situm.situm.Model.HabitacionModel;

@Repository
public interface HabitacionRepository extends JpaRepository<HabitacionModel, Integer> {



}

