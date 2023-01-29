package Ejercicio20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap <String, String> diccio = new HashMap<String, String>();

        boolean sinonimos = false;

        String opcion = "";

        String espanol = "";
        String ingles = "";

        diccio.put("caliente", "hot");
        diccio.put("rojo", "red");
        diccio.put("ardiente", "hot");
        diccio.put("verde", "green");
        diccio.put("agujetas", "stiff");
        diccio.put("abrasador", "hot");
        diccio.put("hierro", "iron");
        diccio.put("grande", "big");

        do {
        System.out.print("Introduzca una palabra y le daré los sinónimos: ");
        espanol = sc.nextLine();
        sinonimos = false;
        if (!espanol.equals("salir")) {
        if (diccio.containsKey(espanol)) {
        for(Map.Entry a : diccio.entrySet()) {
            if (espanol.equals(a.getKey())) {
            }
            else if (diccio.get(espanol).equals(a.getValue())) {
                sinonimos = true;
            }
        }

        if (sinonimos) {
            System.out.print("Los sinonimos de "+espanol+" son: ");
            for (Map.Entry a : diccio.entrySet()) {
                if (espanol.equals(a.getKey())) {
                } else if (diccio.get(espanol).equals(a.getValue())) {
                    System.out.print(a.getKey() + " ");
                    sinonimos = true;
                }
            }
            System.out.println();
        } else {
            System.out.print("No conozco sinonimos de esa palabra ¿quiere añadir alguno? (s/n): ");
            opcion = sc.nextLine();
            if (opcion.equals("s")) {
                System.out.print("Introduzca un sinonimo de "+espanol+": ");
                ingles = sc.nextLine();
                diccio.put(ingles, diccio.get(espanol));
                System.out.println("Gracias por enseñarme nuevos sinónimos");
            }
        } }
        else {
            System.out.print("No conozco esa palabra ¿quiere añadirla al diccionario? (s/n): ");
            opcion = sc.nextLine();
            if (opcion.equals("s")) {
                System.out.print("Introduzca la traducción de "+espanol+" en inglés: ");
                ingles = sc.nextLine();
                diccio.put(espanol, ingles);
            }

        } }
        } while (!espanol.equals("salir"));

    }
}
