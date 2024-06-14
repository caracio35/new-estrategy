package ejer_1.modelo;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<Producto> productos;
    private EstrategiaEnvio estrategia;

    public CarritoDeCompras() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal(String destino, EstrategiaEnvio estrategia) {
        double totalProductos = productos.stream().mapToDouble(p -> p.getPrecio()).sum();
        double pesoTotal = productos.stream().mapToDouble(p -> p.getPeso()).sum();
        double costoEnvio = estrategia.calcularCosto(pesoTotal, destino);

        return totalProductos + costoEnvio;
    }
}
