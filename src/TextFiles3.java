import java.io.BufferedReader;
import java.io.FileReader;

public class TextFiles3 {

    public static void main(String[] args) throws Exception {


        FileReader fr = new FileReader("namealterperson.txt");
        BufferedReader br = new BufferedReader(fr);


        String line = br.readLine();
        int zeile = 1;

        while (line != null) {
            String[] person = line.split(";");
            char[] zeichen = line.toCharArray();
            String biggest="";
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j<3; j++){
                    if (person[i].length()>person[j].length()){
                        biggest=person[i];
                    }
                }
            }

            System.out.println("Zeile: " + zeile + " Zeichen: " + zeichen.length + " Anzahl Wörter: " + person.length + " | Längstes Wort: "+biggest);

            line = br.readLine();
        }

    }

}
