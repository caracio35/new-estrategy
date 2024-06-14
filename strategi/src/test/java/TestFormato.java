import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;
import ejer_2.modelo.FormatoCortoFecha;
import ejer_2.modelo.FormatoLargoFecha;
import ejer_2.modelo.Persona;

public class TestFormato {
    @Test
    public void testFormatoFechaCorto() {
        Persona p = new Persona("jose", "sanchez", LocalDate.of(1990, 1, 1));
        assertEquals("01/01/1990", p.getFechaNacimiento(new FormatoCortoFecha()));
    }

    @Test
    public void testFormatoFechaLargo() {
        Persona p = new Persona("jose", "sanchez", LocalDate.of(1990, 1, 1));
        assertEquals("1 de enero de 1990", p.getFechaNacimiento(new FormatoLargoFecha()));
    }

    @Test
    public void testFormatoFechaLargoYCorto() {
        Persona p = new Persona("jose", "sanchez", LocalDate.of(1990, 1, 1));
        assertEquals("1 de enero de 1990", p.getFechaNacimiento(new FormatoLargoFecha()));
        assertEquals("01/01/1990", p.getFechaNacimiento(new FormatoCortoFecha()));
    }
}
