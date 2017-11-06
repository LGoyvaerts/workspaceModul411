import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class NameAlterPerson {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        FileReader fr = new FileReader("namealterperson.txt");
        BufferedReader br = new BufferedReader(fr);

        System.out.print("Vorname: ");
        String input = in.nextLine();

        String line = br.readLine();

        while (line != null) {
            String[] person = line.split(";");
            if (input.equals(person[1])) {
                System.out.println("Name: " + person[0] + " Vorname: " + person[1] + " Jahrgang: " + person[2]);
            }
            line = br.readLine();
        }

    }
}
