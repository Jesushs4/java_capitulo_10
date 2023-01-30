package Ejercicio13;

public class Articulo {
    private String codigo;
    private String descripcion;
    private double preciocompra;
    private double precioventa;
    private int stock;

    public Articulo(String c, String d, double pc, double pv, int s) {
        this.codigo = c;
        this.descripcion = d;
        this.preciocompra = pc;
        this.precioventa = pv;
        this.stock = s;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPreciocompra() {
        return preciocompra;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public int getStock() {
        return stock;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPreciocompra(double preciocompra) {
        this.preciocompra = preciocompra;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Código: "+this.codigo+" Descripción: "+this.descripcion+" Precio de compra: "+this.preciocompra+" Precio de venta: "+this.precioventa+" Stock: "+this.stock;
    }
}
