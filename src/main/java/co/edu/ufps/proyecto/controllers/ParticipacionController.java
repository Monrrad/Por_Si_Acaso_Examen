package co.edu.ufps.proyecto.controllers;

import co.edu.ufps.proyecto.entities.Participacion;
import co.edu.ufps.proyecto.services.ParticipacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/participacion")
public class ParticipacionController {

    @Autowired
    ParticipacionService participacionService;

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteParticipacion(@PathVariable Integer id) {
        try {
            Participacion participacion = participacionService.deleteParticipacion(id);
            return ResponseEntity.ok(participacion);
        } catch (Exception e) {
            return ResponseEntity.status(404).body("Participacion not found");
        }
    }
}
