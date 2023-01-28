package Ejercicio14;

public class Articulo {

    private String nombre;
    private double precio;
    private int cantidad;

    public Articulo(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return String.format("%10s%10.2f%10d%10.2f\n",nombre,precio,cantidad,precio*cantidad);
    }
}
