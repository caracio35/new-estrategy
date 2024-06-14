import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import ejer_1.modelo.CarritoDeCompras;
import ejer_1.modelo.ColectivoSur;
import ejer_1.modelo.CorreoArgentino;
import ejer_1.modelo.Producto;

public class TestEnvios {
    @Test
    public void testCorreoArgentino() {
        CarritoDeCompras carrito = new CarritoDeCompras();
        Producto notebook = new Producto("notebook", 1000000, 2);
        Producto mouse = new Producto("mouse", 3000, 1);
        Producto impresora = new Producto("impresora", 10000, 5);
        carrito.agregarProducto(notebook);
        carrito.agregarProducto(mouse);
        carrito.agregarProducto(impresora);

        assertEquals(1018800.0, carrito.calcularTotal("rosario", new CorreoArgentino()), 0.01);

        assertEquals(1013500.0, carrito.calcularTotal("capital federal", new CorreoArgentino()), 0.01);
    }

    @Test
    public void testColectivoSur() {
        CarritoDeCompras carrito = new CarritoDeCompras();
        Producto notebook = new Producto("notebook", 1000000, 2);
        Producto mouse = new Producto("mouse", 3000, 1);
        Producto impresora = new Producto("impresora", 10000, 5);
        carrito.agregarProducto(notebook);
        carrito.agregarProducto(mouse);
        carrito.agregarProducto(impresora);

        assertEquals(1016500.0, carrito.calcularTotal("rosario", new ColectivoSur()), 0.01);

        assertEquals(1014500.0, carrito.calcularTotal("capital federal", new ColectivoSur()), 0.01);
        assertEquals(1015000.0, carrito.calcularTotal("gran buenos aires", new ColectivoSur()), 0.01);
    }

}
