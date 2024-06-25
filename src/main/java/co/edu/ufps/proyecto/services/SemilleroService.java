package co.edu.ufps.proyecto.services;

import co.edu.ufps.proyecto.entities.Semillero;
import co.edu.ufps.proyecto.models.SemilleroDTO;
import co.edu.ufps.proyecto.repositories.SemilleroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class SemilleroService {

    @Autowired
    private SemilleroRepository semilleroRepository;

    public Semillero getSemilleroById(Integer id) {
        Optional<Semillero> semillero = semilleroRepository.findById(id);
        if(semillero.isPresent()) {
            return semillero.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }


    public Semillero updateSemillero(Integer id, SemilleroDTO semilleroDTO) {

        Semillero semilleroFound = getSemilleroById(id);

        semilleroFound.setEstrategiaTrabajo(semilleroDTO.getEstrategiaTrabajo());
        semilleroFound.setMision(semilleroDTO.getMision());
        semilleroFound.setNombre(semilleroDTO.getNombre());
        semilleroFound.setObjetivoEspecifico(semilleroDTO.getObjetivoEspecifico());
        semilleroFound.setObjetivoGeneral(semilleroDTO.getObjetivoGeneral());
        semilleroFound.setSigla(semilleroDTO.getSigla());
        semilleroFound.setVision(semilleroDTO.getVision());

        return semilleroFound;
    }

}