package Ejercicio16;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        String pais = "";
        String capital = "";

        HashMap <String,String> lista = new HashMap<String,String>();

        lista.put("España", "Madrid");
        lista.put("Portugal", "Lisboa");
        lista.put("Francia", "Paris");

        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            pais = sc.nextLine();
        if (pais.equals("salir")) {
            exit = true;
        }
        else if (lista.containsKey(pais)) {
            System.out.println("La capital de "+pais+" es "+lista.get(pais));
        }
        else {
            System.out.print("No conozco la respuesta ¿cuál es la capital de "+pais+"?:");
            capital = sc.nextLine();
            lista.put(pais,capital);
            System.out.println("Gracias por enseñarme nuevas capitales");
        }
        } while (!exit);



    }
}
