package Ejercicio8;

import java.util.ArrayList;

public class Ejercicio8 {
    public static void main(String args[]) {

        Carta primeraCarta = new Carta();

        ArrayList<Carta> cartas = new ArrayList<Carta>();

        for (int i=0; i<9; i++) {
            do {
            primeraCarta = new Carta();
            } while (cartas.contains(primeraCarta));
            cartas.add(primeraCarta);
        }

        for(Carta todascartas : cartas) {
            System.out.println(todascartas);
        }
    }
}
