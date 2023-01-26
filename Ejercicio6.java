import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String args[]) {

        HashMap<String, String> acceso = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        String nombre;
        String contraseña;
        int oportunidades = 3;

        acceso.put("Jesus Herrera", "a1b2c3");
        acceso.put("Denisa Belean", "contraseña");
        acceso.put("Pablo Garcia", "123");

        boolean correct = false;

        do {
        System.out.print("Introduzca el nombre: ");
        nombre = sc.nextLine();
            if (acceso.containsKey(nombre)) {
                System.out.print("Introduzca la contraseña: ");
                contraseña = sc.nextLine();
                if (acceso.get(nombre).equals(contraseña)) {
                    correct = true;
                }
                else {
                    System.out.print("Lo siento, la contraseña no es correcta");
                    oportunidades--;
                }
            }
            else {
                System.out.print("Lo siento, el nombre no existe");
                oportunidades--;
            }

        } while(oportunidades!=0 && !correct);

        if (correct) {
            System.out.print("Ha accedido al área restringida");
        } else {
            System.out.print("Lo siento, no tiene acceso al área restringida");
        }
    }
}
