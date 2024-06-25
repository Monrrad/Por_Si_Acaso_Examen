package co.edu.ufps.proyecto.controllers;

import co.edu.ufps.proyecto.entities.Capacitacion;
import co.edu.ufps.proyecto.repositories.CapacitacionRepository;
import co.edu.ufps.proyecto.services.CapacitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/capacitacion")
public class CapacitacionController {

    @Autowired
    CapacitacionService capacitacionService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getManga(@PathVariable Integer id) {
        try {
            Capacitacion capacitacion = capacitacionService.getCapacitacionById(id);
            return ResponseEntity.ok(capacitacion);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }



}
