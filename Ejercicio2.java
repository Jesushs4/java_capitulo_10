import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String args[]) {
    ArrayList<Integer> a = new ArrayList<Integer>();

    for (int i=0; i<=(int)(Math.random()*21); i++) {
        a.add((int)(Math.random()*101));
    }

    for(int numeros: a) {
        System.out.println(numeros);
    }
}
}
