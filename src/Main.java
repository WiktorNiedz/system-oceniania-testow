import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("podaj liczbe punktow: ");
        Scanner scanner = new Scanner(System.in);
        int punkty = scanner.nextInt();
        if (punkty <50) {
            System.out.println("musisz sie jeszcze duzo nauczyc ");
        }
        else if (punkty >50 && punkty <70) {
            System.out.println("Średni wynik, ale jesteś na dobrej drodze ");
        }
        else if (punkty >70 && punkty <100) {
                System.out.println("Świetnie! Dobrze Ci poszło");
        }
        else {
            System.out.println("Podales zly wynik");
        }

        scanner.close();

    }
}
