package Ejercicio23;

import java.util.ArrayList;

public class Ejercicio23 {
    public static void main(String args[]) {

        int capturasTotales = (int)((Math.random()*15)+1);;
        int puntosTotales = 0;
        int capturas = 0;

        ArrayList<Pieza> piece = new ArrayList<Pieza>();

        piece.add(new Pieza("Dama",1,9));
        piece.add(new Pieza("Torre",2,5));
        piece.add(new Pieza("Alfil",2,3));
        piece.add(new Pieza("Caballo",2,2));
        piece.add(new Pieza("Peón",8,1));

        do {
        Pieza randompiece = piece.get((int)(Math.random()*5));
        if (randompiece.esCapturable()) {
            randompiece.capturado();
            puntosTotales += randompiece.getValor();
            System.out.print(randompiece);
            capturas++;
        }
        } while (capturasTotales>capturas);

        System.out.print("Puntos totales "+puntosTotales+" peones");


    }
}
