package Ejercicio7;

public class Moneda {

    private String car[] = {"cara", "cruz"};

    private String num[] = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25 céntimos", "50 céntimos", "1 euro", "2 euros"};
    private String numero;
    private String cara;

    public String getNumero() {
        return numero;
    }

    public String getCara() {
        return cara;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCara(String cara) {
        this.cara = cara;
    }

    public Moneda() {
        this.numero = num[(int)(Math.random()*8)];
        this.cara = car[(int)(Math.random()*2)];
    }

    @Override
    public String toString() {
        return this.numero+" - "+this.cara+"\n";
    }
}

