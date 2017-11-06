import java.util.Random;
import java.util.Scanner;

public class uebungsserie2aufgabe41a {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Anzahl Zahlen: ");
        Integer anzahl = in.nextInt();

        Integer[] zahlen = new Integer[anzahl];

        for (int i = 0; i < anzahl; i++) {
            zahlen[i] = random.nextInt(100) + 1;
            System.out.println(zahlen[i]);
        }

        System.out.println("\nArray wird nach Eingabe sortiert");
        String wait = in.next();

        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i + 1] < zahlen[i]) {
                int temp = zahlen[i];
                zahlen[i] = zahlen[i + 1];
                zahlen[i + 1] = temp;
            }
        }

        System.out.println("\n Zahlen sortiert: ");
        for (Integer z : zahlen) {
            System.out.println(z);
        }
    }
}
