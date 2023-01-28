package Ejercicio12;

import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio12 {
    public static void main(String args[]) {

        Carta primeraCarta = new Carta();

        ArrayList<Carta> cartas = new ArrayList<Carta>();
        HashMap<String, Integer> valor = new HashMap<String, Integer>();
        valor.put("as", 11);
        valor.put("tres", 10);
        valor.put("sota", 2);
        valor.put("caballo", 3);
        valor.put("rey", 4);
        int puntos = 0;
        cartas.add(primeraCarta);
        for (int i=0; i<4; i++) {
            do {
                primeraCarta = new Carta();
            } while (cartas.contains(primeraCarta));
            cartas.add(primeraCarta);
        }

        for(Carta todascartas : cartas) {
            System.out.println(todascartas);
            if (valor.containsKey(todascartas.getNumero())) {
                puntos += valor.get(todascartas.getNumero());
            }
        }

        System.out.print(puntos+" puntos");
    }
}
