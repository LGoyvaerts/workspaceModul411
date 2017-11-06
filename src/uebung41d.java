import java.util.Random;
import java.util.Scanner;

public class uebung41d {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Name zur Überprüfung: ");
        String name = in.nextLine();

        Random random = new Random(name.length());
        for (int i = 0; i<random.nextInt(91)+10; i++){
            Boolean love = random.nextBoolean();
            if (love){
                System.out.println("Sie liebt mich");
            }else {
                System.out.println("Sie liebt mich nicht");
            }
        }
    }
}
