package Telkáč;

public class TelkaMain {
    public static void main(String[] args) {

        Televizor televizor = new Televizor(60, 10);
        Ovladac ovladac = new Ovladac(60, true);
        System.out.println("aktualny kanal " + televizor.getAktualnyKanal());
        ovladac.prepniKanal(televizor, 8);
        System.out.printf("aktualny kanal po prepnuti %d ", televizor.getAktualnyKanal());


    }
}
