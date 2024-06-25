package co.edu.ufps.proyecto.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SemilleroDTO {

    private int id;
    private String estrategiaTrabajo;
    private String mision;
    private String nombre;
    private String objetivoEspecifico;
    private String objetivoGeneral;
    private String sigla;
    private String vision;



}
