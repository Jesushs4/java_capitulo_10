package Ejercicio17;

public class Elemento {
    private String producto;
    private double precio;
    private int cantidad;

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Elemento(String producto, double precio, int cantidad) {
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return this.getProducto()+" PVP: "+getPrecio()+" Unidades: "+getCantidad()+" Subtotal: "+String.format("%.2f",getPrecio()*getCantidad());
    }
}
