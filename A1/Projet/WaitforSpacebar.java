import java.util.Scanner;

public class WaitforSpacebar {


public static void waitForSpacebar() {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Appuyez sur la barre d'espace pour continuer...");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase(" ")) {
                break;
            } else {
                System.out.println("Veuillez appuyer sur la barre d'espace pour continuer...");
            }
        }
    }
}

}
