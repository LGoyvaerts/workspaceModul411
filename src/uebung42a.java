import java.util.Random;

public class uebung42a {

    public static void main(String[] args) {

        Integer[] zahlen = new Integer[10];
        Random random = new Random();

        for (int i = 0; i<10; i++){
            zahlen[i] = random.nextInt(6)+1;
        }
    }
}
