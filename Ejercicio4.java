import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();

        System.out.println("Introduzca diez palabras");
        for (int i=0; i<10; i++) {
            a.add(sc.next());
        }

        System.out.print("Palabras sin ordenar: ");
        for(String numeros : a) {
            System.out.print(numeros+" ");
        }
        Collections.sort(a);
        System.out.print("\nPalabras ordenadas: ");
        for(String numeros : a) {
            System.out.print(numeros+" ");
        }
    }
}
