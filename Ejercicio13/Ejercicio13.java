package Ejercicio13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int opcion2 = 0;
        ArrayList<Articulo> lista = new ArrayList<Articulo>();
        HashMap<String, Integer> factura = new HashMap<String, Integer>();
        Articulo artaux = null;
        int opcion = 0;
        String codigoint = "";
        String descint = "";
        double preciocompraint = 0;
        double precioventaint = 0;
        int stockint = 0;
        int pos = 0;
        boolean exists = false;
        final double IVA = 0.21;

        do {
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                for(Articulo list: lista) {
                    if (list!=null) {
                        System.out.println(list);
                    }
                }
                break;

                case 2:

                    exists = false;

                System.out.print("Código: ");
                    codigoint = sc.nextLine();


                for (Articulo articulos : lista) {
                    if (articulos.getCodigo().equals(codigoint)) {
                        System.out.print("El código introducido ya existe\n");
                        exists = true;
                    }
                }

                if (!exists) {
                    System.out.print("Descripción: ");
                    descint = sc.nextLine();
                    System.out.print("Precio de compra: ");
                    preciocompraint = Double.parseDouble(sc.nextLine());
                    System.out.print("Precio de venta: ");
                    precioventaint = Double.parseDouble(sc.nextLine());
                    System.out.print("Stock: ");
                    stockint = Integer.parseInt(sc.nextLine());

                    lista.add(new Articulo(codigoint, descint, preciocompraint, precioventaint, stockint));
                }


                break;

                case 3:

                    exists = false;
                    System.out.print("Introduzca el código del artículo que desea dar de baja: ");
                    codigoint = sc.nextLine();

                    for (Articulo articulos : lista) {
                        if (articulos.getCodigo().equals(codigoint)) {
                            exists = true;
                        }
                    }

                    if (!exists) {
                    System.out.println("El artículo no existe");
                    } else {
                        String finalCodigoint = codigoint;
                        lista.removeIf(articulo -> articulo.getCodigo().equals(finalCodigoint));
                    }

                break;

                case 4:
                    exists = false;
                    System.out.print("Introduzca el código del artículo que desea modificar: ");
                    codigoint = sc.nextLine();

                    for (Articulo articulos : lista) {
                        if (articulos.getCodigo().equals(codigoint)) {
                            exists = true;
                            artaux = articulos;
                        }
                    }

                    if (!exists) {
                        System.out.println("El artículo no existe");
                    }
                    else {
                        pos = lista.indexOf(artaux);
                        artaux.setCodigo(codigoint);
                        System.out.print("Descripción: ");
                        artaux.setDescripcion(sc.nextLine());
                        System.out.print("Precio de compra: ");
                        artaux.setPreciocompra(Double.parseDouble(sc.nextLine()));
                        System.out.print("Precio de venta: ");
                        artaux.setPrecioventa(Double.parseDouble(sc.nextLine()));
                        System.out.print("Stock: ");
                        artaux.setStock(Integer.parseInt(sc.nextLine()));

                        lista.set(pos, artaux);
                    }

                break;

                case 5:
                    exists = false;
                    System.out.print("Introduzca el código del artículo del que desea añadir mercancía: ");
                    codigoint = sc.nextLine();

                    for (Articulo articulos : lista) {
                        if (articulos.getCodigo().equals(codigoint)) {
                            exists = true;
                            artaux = articulos;
                        }
                    }

                    if (!exists) {
                        System.out.println("El artículo no existe");
                    }
                    else {
                        pos = lista.indexOf(artaux);
                        System.out.println("El artículo tiene "+artaux.getStock()+" de stock");
                        System.out.print("¿Cuanta mercancía quiere añadir?: ");
                        stockint = Integer.parseInt(sc.nextLine());
                        artaux.setStock(artaux.getStock()+stockint);
                        lista.set(pos, artaux);
                        System.out.println("Ahora hay "+lista.get(pos).getStock()+" artículos");
                    }
                break;

                case 6:
                    do {
                        System.out.println("Elija una de las opciones de la venta:");
                        System.out.println("1. Añadir producto");
                        System.out.println("2. Enseñar factura");
                        System.out.println("3. Cancelar");
                        opcion2 = Integer.parseInt(sc.nextLine());
                        switch (opcion2) {

                            case 1:
                                exists = false;
                                System.out.print("Introduzca el codigo del producto que desee añadir: ");
                                codigoint = sc.nextLine();

                                for (Articulo articulos : lista) {
                                    if (articulos.getCodigo().equals(codigoint)) {
                                        exists = true;
                                        artaux = articulos;
                                    }
                                }

                                if (!exists) {
                                    System.out.println("El artículo no esta disponible");
                                }

                                else if (factura.containsKey(codigoint)) {
                                    System.out.print("Introduzca la cantidad a vender: ");
                                    stockint = Integer.parseInt(sc.nextLine());
                                    if (stockint+factura.get(codigoint) > artaux.getStock()) {
                                        System.out.println("No hay suficiente stock");
                                    } else {
                                        factura.put(codigoint, factura.get(codigoint) + stockint);
                                    }
                                } else {
                                    System.out.print("Introduzca la cantidad a vender: ");
                                    stockint = Integer.parseInt(sc.nextLine());
                                    if (stockint > artaux.getStock()) {
                                        System.out.println("No hay suficiente stock.");
                                    } else
                                    {

                                        if (exists) {
                                            factura.put(codigoint, stockint);
                                        }
                                    }
                                }

                                break;

                            case 2:
                                double total = 0;
                                System.out.println("\nProducto    Descripción     Precio    Cantidad    Subtotal" +
                                        "\n=============================================================");
                                for (Map.Entry facturas : factura.entrySet()) {
                                    for (Articulo articulos : lista) {
                                        if (articulos!=null && articulos.getCodigo().equals(facturas.getKey())) {
                                            artaux = articulos;
                                            System.out.printf("%-10s %-10s %7.2f %11d %11.2f\n",artaux.getCodigo(),artaux.getDescripcion(),artaux.getPrecioventa(),(int)facturas.getValue(), (double)((int)facturas.getValue()*artaux.getPrecioventa()));
                                            total+=(double)((int)facturas.getValue()*artaux.getPrecioventa());
                                        }
                                    }

                                }
                                System.out.printf("=============================================================\nIVA : %.2f\n", IVA*total);
                                System.out.printf("=============================================================\n" +
                                        "TOTAL : %.2f\n", total+IVA*total);
                                break;

                        }
                    } while (opcion2<2);


                break;
            }
        } while (opcion!=7);
    }
}
