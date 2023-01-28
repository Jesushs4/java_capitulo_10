package Ejercicio14;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String args[]) {

        String nombre = "";
        int cantidad;
        double total = 0;

        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> productos = new HashMap<String, Double>();

        ArrayList<Articulo> compras = new ArrayList<Articulo>();

        productos.put("avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre", 3.13);
        productos.put("quinoa", 4.50);
        productos.put("guisantes", 1.60);

        do {
            System.out.print("Producto: ");
            nombre = sc.next();
            if (productos.containsKey(nombre)) {
                System.out.print("Cantidad: ");
                cantidad = sc.nextInt();
                compras.add(new Articulo(nombre, productos.get(nombre), cantidad));
                total += cantidad*productos.get(nombre);
            }

        } while (!nombre.equals("fin"));

        System.out.printf("%10s %10s %10s %10s\n","Producto","Precio","Cantidad","Subtotal");
        System.out.println("----------------------------------------------------");
        for (Articulo lista : compras) {
            System.out.print(lista);
        }
        System.out.println("----------------------------------------------------");
        System.out.printf("TOTAL: %.2f",total);

    }
}
