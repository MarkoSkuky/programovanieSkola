import javafx.scene.transform.Scale;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] pole = new int[10];
        int najmensie = 999999999;

        Random random = new Random();

        for (int i = 0; i < pole.length; i++){
            pole[i] = random.nextInt(100);
        }
        for (int i = 0; i < pole.length; i++){
            System.out.println(pole[i]);
        }

         for (int i = 0; i < pole.length; i++){
             if (pole[i] < najmensie){
                 najmensie = pole[i];
             }
         }
        System.out.println("najmensie cislo v poli je: "+najmensie);


    }






    }


