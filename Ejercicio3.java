import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();

        System.out.println("Introduzca diez numeros enteros");
        for (int i=0; i<10; i++) {
            a.add(sc.nextInt());
        }

        System.out.print("Numeros sin ordenar: ");
        for(int numeros : a) {
            System.out.print(numeros+" ");
        }
        Collections.sort(a);
        System.out.print("\nNumeros ordenados: ");
        for(int numeros : a) {
            System.out.print(numeros+" ");
        }
    }
}
