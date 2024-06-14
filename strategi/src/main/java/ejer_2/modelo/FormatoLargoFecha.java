package ejer_2.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatoLargoFecha implements FormatoFecha {
    private static final DateTimeFormatter FORMATO_LARGO = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");

    public FormatoLargoFecha() {
    }

    public String formatearFecha(LocalDate fecha) {
        return fecha.format(FORMATO_LARGO);
    }
}
