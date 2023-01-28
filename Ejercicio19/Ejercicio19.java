package Ejercicio19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap <String, String> diccio = new HashMap<String, String>();

        boolean sinonimos = false;

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
            System.out.println("No conozco sinonimos de esa palabra");
        } }
        else {
            System.out.println("No conozco esa palabra");
        } }
        } while (!espanol.equals("salir"));

    }
}
