import java.io.BufferedReader;
import java.io.FileReader;

public class CapsLocker {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        while (line != null) {
            System.out.println(line.toUpperCase());
            line = br.readLine();
        }

    }
}
