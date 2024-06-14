package ejer_1.modelo;

public class ColectivoSur implements EstrategiaEnvio {
    private static final double costoEnvioCapital = 1000;
    private static final double costoEnvioGranBuenosAires = 1500;
    private static final double costoEnvioRestoPais = 3000;

    public ColectivoSur() {
    }

    public double calcularCosto(double peso, String destino) {

        double costoEnvioFijo = 0;
        double costoPeso = 0;

        if (destino.equals("capital federal")) {
            costoEnvioFijo = costoEnvioCapital;
        } else if (destino.equals("gran buenos aires")) {
            costoEnvioFijo = costoEnvioGranBuenosAires;
        } else {
            costoEnvioFijo = costoEnvioRestoPais;
        }
        if (peso < 5) {
            costoPeso = 0;
        } else if (peso < 30) {
            costoPeso = 500;
        } else {
            costoPeso = 2000;
        }

        return costoEnvioFijo + costoPeso;

    }

}
