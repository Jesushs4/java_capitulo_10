package Ejercicio21;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String anfibio = "";
        String habitat = "";
        String alimentacion = "";

        HashMap<String, String> anfihabi = new HashMap<String, String>();
        HashMap<String, String> anfiali = new HashMap<String, String>();

        anfihabi.put("rana", "En los trópicos y cerca de las zonas húmedas y acuáticas");
        anfihabi.put("salamandra", "Ecosistemas húmedos");
        anfihabi.put("sapo","En cualquier sitio salvo el desierto y la Antártida");
        anfihabi.put("tritón","América y África");

        anfiali.put("rana", "Larvas e insectos");
        anfiali.put("salamandra", "Pequeños crustáceos e insectos");
        anfiali.put("sapo","Insectos, lombrices y pequeños roedores");
        anfiali.put("tritón", "Insectos");

        System.out.print("Introduzca el tipo de anfibio: ");
        anfibio = sc.nextLine();
        if (anfihabi.containsKey(anfibio)) {
            System.out.println("Hábitat: "+anfihabi.get(anfibio));
            System.out.println("Alimentación: "+anfiali.get(anfibio));
        }
        else {
            System.out.println("Ese tipo de anfibio no existe");
        }

    }
}
