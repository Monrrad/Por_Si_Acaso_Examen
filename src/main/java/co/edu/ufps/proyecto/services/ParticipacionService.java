package co.edu.ufps.proyecto.services;

import co.edu.ufps.proyecto.entities.Participacion;
import co.edu.ufps.proyecto.repositories.ParticipacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class ParticipacionService {

    @Autowired
    ParticipacionRepository participacionRepository;

    public Participacion getParticipacionById(Integer id) {

        Optional<Participacion> participacion = participacionRepository.findById(id);
        if(participacion.isPresent()) {
            return participacion.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    public Participacion deleteParticipacion(Integer id) {
        Participacion participacion = getParticipacionById(id);
        if (participacion != null) {
            participacionRepository.delete(participacion);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return participacion;
    }
}
