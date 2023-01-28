package Ejercicio15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String args[]) {

        String nombre = "";
        int cantidad;
        double total = 0;
        boolean found = false;
        boolean discount = false;

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
            found = false;
            System.out.print("Producto: ");
            nombre = sc.nextLine();
            if (productos.containsKey(nombre)) {
                System.out.print("Cantidad: ");
                cantidad = Integer.parseInt(sc.nextLine());
                for (Articulo list : compras) {
                    if(nombre.equals(list.getNombre())) {
                        list.setCantidad(list.getCantidad()+cantidad);
                        found = true;
                    }
                }
                if (!found) {
                    compras.add(new Articulo(nombre, productos.get(nombre), cantidad));
                }

                total += cantidad*productos.get(nombre);
            }

        } while (!nombre.equals("fin"));
        System.out.print("Introduzca código de descuento si tiene (INTRO si no tiene ninguno): ");
        nombre = sc.nextLine();
        if (nombre.equals("ECODTO")) {
            discount = true;
        }

        System.out.printf("%10s %10s %10s %10s\n","Producto","Precio","Cantidad","Subtotal");
        System.out.println("----------------------------------------------------");
        for (Articulo lista : compras) {
            System.out.print(lista);
        }
        if (discount) {
            System.out.println("----------------------------------------------------");
            System.out.printf("Descuento: %.2f\n", total*10/100);
        }
        System.out.println("----------------------------------------------------");
        System.out.printf("TOTAL: %.2f",(discount?total-total*10/100:total));

    }
}
