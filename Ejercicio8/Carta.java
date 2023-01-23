package Ejercicio8;

public class Carta {
    private String[] num = {"as","2","3","4","5","6","7","sota","caballo","rey"};
    private String[] pa = {"bastos","copas","espadas","oros"};

    private String numero;
    private String palo;

    public Carta() {
        this.numero = num[(int)(Math.random()*10)];
        this.palo = pa[(int)(Math.random()*4)];
    }

    @Override
    public String toString() {
        return "El palo es "+this.palo+" "+"y el numero "+this.numero;
    }
}
