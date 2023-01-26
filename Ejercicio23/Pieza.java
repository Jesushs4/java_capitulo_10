package Ejercicio23;

public class Pieza {
    private String pieza;

    private int cantidad;
    private int valor;

    public Pieza(String p, int c, int v) {
        this.pieza = p;
        this.cantidad = c;
        this.valor = v;
    }

    public String getPieza() {
        return pieza;
    }

    public int getValor() {
        return valor;
    }

    public void capturado() {
        this.cantidad -= 1;
    }

    public boolean esCapturable() {
        if (this.cantidad>0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.pieza+"("+this.valor+" peones)\n";
    }
}
