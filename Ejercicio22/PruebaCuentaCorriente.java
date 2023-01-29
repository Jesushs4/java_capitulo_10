package Ejercicio22;

public class PruebaCuentaCorriente {
    public static void main(String args[]) {
        Ejercicio22 cuenta1 = new Ejercicio22();
        Ejercicio22 cuenta2 = new Ejercicio22(1500);
        Ejercicio22 cuenta3 = new Ejercicio22(6000);
        cuenta1.ingreso(2000);
        cuenta1.cargo(600);
        cuenta3.ingreso(75);
        cuenta1.cargo(55);
        cuenta2.transferencia(cuenta1, 100);
        cuenta1.transferencia(cuenta3, 250);
        cuenta3.transferencia(cuenta1, 22);
        cuenta1.movimientos();
    }
    
}
