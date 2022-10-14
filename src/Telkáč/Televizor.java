package Telkáč;

public class Televizor {

    private int aktualnyKanal = 1;
    private int pocetKanalov;
    private double frekvencia;

    public Televizor(double frekvencia, int pocetKanalov) {
        this.frekvencia = frekvencia;
        this.pocetKanalov = pocetKanalov;
        this.aktualnyKanal = aktualnyKanal;

    }

    public Televizor() {

    }

    public double getFrekvencia() {
        return frekvencia;
    }

    public int getPocetKanalov() {
        return pocetKanalov;
    }

    public int getAktualnyKanal() {
        return aktualnyKanal;
    }

    public boolean setAktualnyKanal(int aktualnyKanal) {

        if (aktualnyKanal > 0 && aktualnyKanal <= pocetKanalov) {
            this.aktualnyKanal = aktualnyKanal;
            return true;
        } else System.out.println("neplatna hodnota");
        return false;
    }
}
