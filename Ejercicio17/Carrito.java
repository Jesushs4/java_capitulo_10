package Ejercicio17;

import java.util.ArrayList;

public class Carrito {

    ArrayList<Elemento> elementos = new ArrayList<Elemento>();

    public int numeroDeElementos() {
        return elementos.size();
    }

    public void agrega(Elemento e) {
        elementos.add(e);
    }

    public double importeTotal() {
        double total = 0;
        for (Elemento e : elementos) {
        total += (e.getPrecio()*e.getCantidad());
        }
        return total;
    }

    @Override
    public String toString() {
        String texto = "";
        texto += "Contenido del carrito\n===============\n";
        for (Elemento e : elementos) {
        texto += elementos+"\n";
        }
        return texto;
    }
}
