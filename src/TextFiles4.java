import java.io.BufferedReader;
import java.io.FileReader;

public class TextFiles4 {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        while (line != null) {
            String[] chars = line.split("\\s+");
            String reverse = new StringBuilder(line).reverse().toString();
            System.out.println(reverse.toLowerCase());
            
            line = br.readLine();
        }

    }
}
