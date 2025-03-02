package com.situm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.situm.model.EdificioModel;
import com.situm.Service.EdificioService;

@RestController
@RequestMapping("/api/edificios")
public class EdificioController {

    @Autowired
    @Lazy
    private EdificioService edificioService;

    @GetMapping
    public List<EdificioModel> getAllEdificios() {
        return edificioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EdificioModel> getEdificioById(@PathVariable Integer id) {
        Optional<EdificioModel> edificio = edificioService.findById(id);
        return edificio.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public EdificioModel createEdificio(@RequestBody EdificioModel edificio) {
        return edificioService.save(edificio);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EdificioModel> updateEdificio(@PathVariable Integer id, @RequestBody EdificioModel edificioDetails) {
        Optional<EdificioModel> edificio = edificioService.findById(id);
        if (edificio.isPresent()) {
            EdificioModel updatedEdificio = edificio.get();
            updatedEdificio.setNombre(edificioDetails.getNombre());
            updatedEdificio.setTipoVia(edificioDetails.getTipoVia());
            updatedEdificio.setCodigoPostal(edificioDetails.getCodigoPostal());
            updatedEdificio.setCantidadPlantas(edificioDetails.getCantidadPlantas());
            updatedEdificio.setCantidadHabitaciones(edificioDetails.getCantidadHabitaciones());
            updatedEdificio.setPais(edificioDetails.getPais());
            updatedEdificio.setProvincia(edificioDetails.getProvincia());
            updatedEdificio.setLocalidad(edificioDetails.getLocalidad());
            return ResponseEntity.ok(edificioService.save(updatedEdificio));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEdificio(@PathVariable Integer id) {
        if (edificioService.existsById(id)) {
            edificioService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
