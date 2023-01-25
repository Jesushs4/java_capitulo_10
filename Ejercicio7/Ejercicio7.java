package Ejercicio7;

import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String args[]) {
        ArrayList<Moneda> coin = new ArrayList<Moneda>();
        for (int i=0; i<6; i++) {
            coin.add(new Moneda());
        }
        for(Moneda monedas : coin) {
            System.out.print(monedas);
        }
    }
}
