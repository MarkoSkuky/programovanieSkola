package Telkáč;

public class Ovladac {
    private boolean univerzal;
    private double frekvencia;

    public Ovladac(double frekvencia, boolean univerzal) {
        this.frekvencia = frekvencia;
        this.univerzal = univerzal;
    }

    public double getFrekvencia() {
        return frekvencia;
    }

    public boolean isUniverzal() {
        return isUniverzal();
    }

    public boolean prepniKanal(Televizor televizor, int kanal) {
        if (univerzal || frekvencia == televizor.getFrekvencia()) {
            return televizor.setAktualnyKanal(kanal);
        } else System.out.println("ovladac nie je kompatibilny s televizorom");
        return false;


    }


}
