import javafx.scene.transform.Scale;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ja sa volam marko ako sa volas ty ");
        String slovo;
        Scanner scanner = new Scanner(System.in);
        slovo = scanner.next();
        if (Objects.equals(slovo, "marko")) {
            System.out.println("waau aj ty si marko");
        }
        }
    }

