package Ejercicio9;

import java.util.*;

public class Ejercicio9 {
    public static void main(String args[]) {

        Carta primeraCarta = new Carta();

        ArrayList<Carta> cartas = new ArrayList<Carta>();
        cartas.add(primeraCarta);

        for (int i=0; i<9; i++) {
            do {
                primeraCarta = new Carta();
            } while (cartas.contains(primeraCarta));
            cartas.add(primeraCarta);
        }

        Collections.sort(cartas);

        for(Carta todascartas : cartas) {
            System.out.println(todascartas);
        }
    }
}