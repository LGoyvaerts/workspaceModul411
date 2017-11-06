import java.util.Random;
import java.util.Scanner;

public class uebung42b {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Integer[] zahlen = new Integer[10];
        Random random = new Random();
        System.out.print("Anzahl Zahlen: ");
        int anzahl = in.nextInt();

        for (int i = 0; i<anzahl; i++){
            zahlen[i] = random.nextInt(6)+1;
            System.out.println(zahlen[i]);
        }
    }
}
