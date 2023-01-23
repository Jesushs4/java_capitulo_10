package Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int option;
        int posicion;
        ArrayList<Disco> a = new ArrayList<Disco>();
        a.add(new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));
        String codigo;
        String autor;
        String titulo;
        String genero;
        int duracion;
        do {
            System.out.println("\n\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                
                case 1:
                for(Disco discos : a) {
                    System.out.println(discos);
                }
                break;
                case 2:
                    System.out.println("Por favor, introduzca los datos del disco.");
                    System.out.print("Código: ");
                    codigo = sc.nextLine();
                    while (a.contains(new Disco(codigo,"", "", "", 0))) {
                        System.out.println("Ese código ya existe en la base de datos.");
                        System.out.print("Introduzca otro código: ");
                        codigo = sc.nextLine();
                    }
                    System.out.print("Introduzca el autor: ");
                    autor = sc.nextLine();
                    System.out.print("Introduzca el titulo: ");
                    titulo = sc.nextLine();
                    System.out.print("Introduzca el genero: ");
                    genero = sc.nextLine();
                    System.out.print("Introduzca la duracion: ");
                    duracion = Integer.parseInt(sc.nextLine());

                    a.add(new Disco(codigo, autor, titulo, genero, duracion));

                break;
                case 3:
                    System.out.println("Introduzca el codigo del album que desea modificar");
                    codigo = sc.nextLine();

                    while (!a.contains(new Disco(codigo,"","","", 0))) {
                        System.out.print("El codigo no existe, introduzcalo de nuevo.");
                        codigo = sc.nextLine();
                    }
                    posicion = a.indexOf(new Disco(codigo, "", "", "", 0));
                    System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.\n");

                    System.out.println("Codigo: "+(a.get(posicion).getCodigo()));
                    System.out.print("Nuevo codigo: ");
                    codigo = sc.nextLine();
                    a.get(posicion).setCodigo(codigo);
                    if (!codigo.equals("")) {
                        a.get(posicion).setCodigo(codigo);
                    }
                    System.out.println("Autor"+(a.get(posicion).getAutor()));
                    System.out.print("Nuevo autor: ");
                    autor = sc.nextLine();
                    if (!autor.equals("")) {
                        a.get(posicion).setAutor(autor);
                    }

                    System.out.println("Titulo"+(a.get(posicion).getTitulo()));
                    System.out.print("Nuevo titulo: ");
                    titulo = sc.nextLine();
                    if (!titulo.equals("")) {
                        a.get(posicion).setTitulo(titulo);
                    }

                    System.out.println("Genero"+(a.get(posicion).getGenero()));
                    System.out.print("Nuevo genero: ");
                    genero = sc.nextLine();
                    if (!genero.equals("")) {
                        a.get(posicion).setGenero(genero);
                    }
                    String duracionString;

                    System.out.println("Duracion"+(a.get(posicion).getDuracion()));
                    System.out.print("Nueva duracion: ");
                    duracionString = sc.nextLine();
                    if (!duracionString.equals("")) {
                        a.get(posicion).setDuracion(Integer.parseInt(duracionString));
                    }
                    break;
                case 4:
                    System.out.print("Introduzca el código del disco que desea borrar: ");
                    codigo = sc.nextLine();
                    if (!a.contains(new Disco(codigo, "", "", "", 0))) {
                        System.out.print("El codigo del disco no existe");
                    }
                    else {
                        a.remove(a.indexOf(new Disco(codigo, "", "", "", 0)));
                        System.out.print("Album borrado");
                    }
                case 5:
            }
        } while (option!=5);
    }
}
