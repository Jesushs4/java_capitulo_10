package Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        ArrayList<Disco> a = new ArrayList<Disco>();

        do {
            System.out.println("\n\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                
                case 1:
                for(Disco discos : a) {
                    System.out.println(discos);
                }
                break;
                case 2:
                break;
                case 3:
                case 4:
                case 5:
            }
        } while (opcion!=5);
    }
}
