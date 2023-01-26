import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String args[]) {
        HashMap<String, String> diccionario = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);

        diccionario.put("recibir", "get");
        diccionario.put("tomar", "take");
        diccionario.put("clave", "key");
        diccionario.put("bicicleta", "bike");
        diccionario.put("coche", "car");
        diccionario.put("linterna", "flashlight");
        diccionario.put("campeon", "champion");
        diccionario.put("sol", "sun");
        diccionario.put("escribir", "write");
        diccionario.put("sonido", "sound");
        diccionario.put("juego", "game");
        diccionario.put("ordenador", "computer");
        diccionario.put("injusto", "unfair");
        diccionario.put("furia", "fury");
        diccionario.put("magia", "magic");
        diccionario.put("pocion", "potion");
        diccionario.put("espada", "sword");
        diccionario.put("animacion", "animation");
        diccionario.put("ajedrez", "chess");
        diccionario.put("raton", "mouse");

        String[] lista = diccionario.keySet().toArray(new String[0]);
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add((int)(Math.random()*20));

        int numero;

        for (int i=0; i<4; i++) {
            do {
            numero = (int)(Math.random()*20);
            } while (arraylist.contains(numero));
            arraylist.add(numero);
        }

        int puntos = 0;
        for (int i=0; i<5; i++) {
            System.out.print(lista[arraylist.get(i)]+": ");
            String guess = sc.nextLine();
            if (guess.equals(diccionario.get(lista[arraylist.get(i)]))) {
                System.out.println("Correcto");
                puntos++;
            }
            else {
                System.out.println("Incorrecto");
            }
        }
        System.out.println("Obtuviste "+puntos+" puntos");


    }
}
