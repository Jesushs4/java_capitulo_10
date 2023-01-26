
import  java.util.*;
public class Ejercicio10 {
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

        System.out.print("Introduzca la palabra que quiere traducir: ");
        String palabra = sc.nextLine();

        System.out.print("La traducción es "+diccionario.get(palabra));


    }
}
