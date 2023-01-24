package Ejercicio9;

public class Carta implements Comparable<Carta> {
    private String[] num = {"as","2","3","4","5","6","7","sota","caballo","rey"};
    private String[] pa = {"bastos","copas","espadas","oros"};

    private String numero;

    public String getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    private String palo;

    public Carta() {
        this.numero = num[(int)(Math.random()*10)];
        this.palo = pa[(int)(Math.random()*4)];
    }

    @Override
    public boolean equals (Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass()!=obj.getClass()) {
            return false;
        }
        if (this.palo != ((Carta) obj).palo) {
            return false;
        }
        if (this.numero != ((Carta) obj).numero) {
            return false;
        }
        return true;

    }

    @Override
    public int compareTo(Carta c) {
        if (palo.equals(c.getPalo())) {
            return numero.compareTo(c.getNumero());
        }
        else {
            return palo.compareTo(c.getPalo());
        }
    }

    @Override
    public String toString() {
        return "El palo es "+this.palo+" "+"y el numero "+this.numero;
    }
}
