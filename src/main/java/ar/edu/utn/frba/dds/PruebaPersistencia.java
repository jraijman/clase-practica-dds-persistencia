package ar.edu.utn.frba.dds;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
public class PruebaPersistencia {


    public Integer id;


    public String nombre;
}
