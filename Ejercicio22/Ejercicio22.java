package Ejercicio22;

import java.util.ArrayList;

public class Ejercicio22 {
    private double saldo;
    private String num;

    ArrayList<String> movimiento = new ArrayList<String>();

    public Ejercicio22() {
        this.num = "";
        this.saldo = 0;
        for (int i=0; i<10; i++) {
        this.num +=(int)((Math.random())*10);
        }
    }

    public Ejercicio22(int s) {
        this();
        this.saldo = s;
    }

    public int getSaldo(int s) {
        return s;
    }

    public void ingreso(int ingreso) {
        this.saldo += ingreso;
        movimiento.add("Ingreso de "+ingreso+"€  Saldo: "+this.saldo+"€");
    }

    public void cargo(int cargo) {
        this.saldo -= cargo;
        movimiento.add("Cargo de "+cargo+"€  Saldo: "+this.saldo+"€");
    }

    public void transferencia(Ejercicio22 cc, int transferencia) {
        this.saldo-=(transferencia);
        cc.saldo+=(transferencia);
        this.movimiento.add("Transf. emitida de "+transferencia+"€ a la cuenta "+cc.num+"  Saldo: "+this.saldo+"€");
        cc.movimiento.add("Transf. recibida de "+transferencia+"€ de la cuenta "+cc.num+" Saldo: "+cc.saldo+"€");
    }

    public void movimientos() {
        System.out.println("Movimientos de la cuenta "+this.num);
        System.out.println("-----------------------------");
        for(String movs : movimiento) {
            System.out.println(movs);
        }
    }

    @Override
    public String toString() {
        return "Número de cuenta: "+num+" Saldo: "+saldo+" €";
    }
}