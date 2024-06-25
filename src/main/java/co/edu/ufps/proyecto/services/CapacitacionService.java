package co.edu.ufps.proyecto.services;

import co.edu.ufps.proyecto.entities.Capacitacion;
import co.edu.ufps.proyecto.repositories.CapacitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class CapacitacionService {

    @Autowired
    CapacitacionRepository capacitacionRepository;

    public Capacitacion getCapacitacionById(Integer id) {

        Optional<Capacitacion> capacitacion = capacitacionRepository.findById(id);
        if(capacitacion.isPresent()) {
            return capacitacion.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }
}
