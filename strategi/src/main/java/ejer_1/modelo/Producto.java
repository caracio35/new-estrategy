package ejer_1.modelo;

public class Producto {
    private String nombre;
    private double precio;
    private double peso;

    public Producto(String nombre, double precio, double peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }
}