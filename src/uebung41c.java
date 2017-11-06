import java.util.Random;

public class uebung41c {

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(11));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(6) + 1);
        }

        for (int i = 0; i < random.nextInt(11) + 5; i++) {
            System.out.println(random.nextInt(551) + 1450);
        }
    }
}
