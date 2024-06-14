package ejer_2.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatoCortoFecha implements FormatoFecha {
    private static final DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public FormatoCortoFecha() {
    }

    public String formatearFecha(LocalDate fecha) {

        return fecha.format(formato);
    }

}
