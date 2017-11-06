import java.io.PrintWriter;

public class Writer {

    public static void main(String[] args) throws Exception {

        try {
            PrintWriter out = new PrintWriter("writer.txt");
            out.println("Hallo, mein Name ist Frida");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception: " + e.getMessage());
        }
    }

}
