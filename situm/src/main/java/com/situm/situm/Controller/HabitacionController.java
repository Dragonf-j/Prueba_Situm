package com.situm.situm.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.situm.situm.Model.HabitacionModel;
import com.situm.situm.Service.HabitacionService;

/**
 * Esta clase es la encargada de gestionar las peticiones HTTP de la tabla habitación
 */
@RestController
@RequestMapping("/api/habitaciones")
public class HabitacionController {

    @Autowired
    @Lazy
    private HabitacionService habitacionService;

    @GetMapping
    public List<HabitacionModel> getAllHabitaciones() {
        return habitacionService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<HabitacionModel> getHabitacionById(@PathVariable Integer id) {
        Optional<HabitacionModel> habitacion = habitacionService.findById(id);
        return habitacion.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public HabitacionModel createHabitacion(@RequestBody HabitacionModel habitacion) {
        return habitacionService.save(habitacion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HabitacionModel> updateHabitacion(@PathVariable Integer id, @RequestBody HabitacionModel habitacionDetails) {
        Optional<HabitacionModel> habitacion = habitacionService.findById(id);
        if (habitacion.isPresent()) {
            HabitacionModel updatedHabitacion = habitacion.get();
            updatedHabitacion.setCapacidad(habitacionDetails.getCapacidad());
            updatedHabitacion.setCategoria(habitacionDetails.getCategoria());
            updatedHabitacion.setEstado(habitacionDetails.getEstado());
            updatedHabitacion.setLetraPuerta(habitacionDetails.getLetraPuerta());
            updatedHabitacion.setNumeroBanios(habitacionDetails.getNumeroBanios());
            updatedHabitacion.setNumeroPlanta(habitacionDetails.getNumeroPlanta());
            updatedHabitacion.setIdEdificio(habitacionDetails.getIdEdificio());
            return ResponseEntity.ok(habitacionService.save(updatedHabitacion));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHabitacion(@PathVariable Integer id) {
        if (habitacionService.existsById(id)) {
            habitacionService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

