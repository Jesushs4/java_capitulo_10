package Ejercicio18;

public class Elemento {
    public String producto;
    private double precio;
    public int cantidad;

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
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (this.producto != ((Elemento) obj).producto) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return this.getProducto()+" PVP: "+getPrecio()+" Unidades: "+getCantidad()+" Subtotal: "+String.format("%.2f",getPrecio()*getCantidad());
    }
}
