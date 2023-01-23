import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String args[]) {
        ArrayList<String> a = new ArrayList<String>();

        a.add("Jesús");
        a.add("Denisa");
        a.add("Pablo");
        a.add("Marco");
        a.add("Adrian");
        a.add("Miguel");

        for(String nombres : a) {
            System.out.println(nombres);
        }
    }
}