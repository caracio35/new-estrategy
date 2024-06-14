package ejer_1.modelo;

import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class CorreoArgentino implements EstrategiaEnvio {
    final static double costoEnvioCapital = 500;
    final static double costoEnvioRestoPais = 800;

    public CorreoArgentino() {
    }

    @Override
    public double calcularCosto(double peso, String destino) {
        double costoEnvio = 0;
        if (destino.equals("capital federal")) {
            costoEnvio = costoEnvioCapital;
        } else {
            int distancia = obtenerDistancia(destino);
            costoEnvio = costoEnvioRestoPais + (distancia * 5);
        }
        return costoEnvio;

    }

    public static int obtenerDistancia(String destino) {
        int distancia = 0;
        // try {
        // String urlStr = "https://distancia.ar?orgen=capital&destino=" + destino;
        // URL url = new URL(urlStr);
        // HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        // urlConnection.setRequestMethod("GET");
        // BufferedReader in = new BufferedReader(new
        // java.io.InputStreamReader(urlConnection.getInputStream()));
        // String inputLine;
        // StringBuffer response = new StringBuffer();
        // while ((inputLine = in.readLine()) != null) {
        // response.append(inputLine);
        // }
        // in.close();
        // distancia = Integer.parseInt(response.toString().split(" ")[0]);
        // } catch (Exception e) {
        // throw new RuntimeException(e);
        // }
        try {
            // Random r = new Random();
            // distancia = r.nextInt(10000);
        } catch (Exception e) {
            // throw new RuntimeException(e);
        }
        return 1000;

    }

}
