package Ejercicio8;

import java.util.ArrayList;

public class Ejercicio8 {
    public static void main(String args[]) {
        ArrayList<Carta> cartas = new ArrayList<Carta>();

        for (int i=0; i<10; i++) {
            cartas.add(new Carta());
        }

        for(Carta todascartas : cartas) {
            System.out.println(todascartas);
        }
    }
}
