package co.edu.ufps.proyecto.controllers;

import co.edu.ufps.proyecto.entities.Semillero;
import co.edu.ufps.proyecto.models.SemilleroDTO;
import co.edu.ufps.proyecto.services.SemilleroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/semillero")
public class SemilleroController {

@Autowired
    SemilleroService semilleroService;

@PutMapping("/{id}")
public ResponseEntity<Semillero> update(@PathVariable Integer id, @RequestBody SemilleroDTO semilleroDTO) {

    Semillero updateSemillero = semilleroService.updateSemillero(id, semilleroDTO);
    if (updateSemillero == null) {
        return ResponseEntity.status(404).body(null);
    }
    return ResponseEntity.ok(updateSemillero);

}

}


