package ar.edu.utn.frba.dds.ejercicio_02.converters;

import ar.edu.utn.frba.dds.ejercicio_02.elementos.Arco;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Escudo;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Espada;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ElementoDefensorConverter implements AttributeConverter<ElementoDefensor, String> {

    @Override
    public String convertToDatabaseColumn(ElementoDefensor metodo) {
        if (metodo == null) {
            return null;
        } else
        if (metodo instanceof Arco) {
            return "ARCO";
        } else if (metodo instanceof Espada) {
            return "ESPADA";
        } else if (metodo instanceof Escudo) {
            return "ESCUDO";
        }
        throw new IllegalArgumentException("Unknown elemento defensor type");
    }

    @Override
    public ElementoDefensor convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return null;
        }
        switch (dbData) {
            //DEBERIAMOS HACER CON UN SERVICE LOCATOR
            case "ARCO":
                return new Arco();
            case "ESPADA":
                return new Espada();
            case "ESCUDO":
                return new Escudo();
            default:
                return null;
        }
    }
}
