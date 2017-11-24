package bcd;

public class Implementation {

    public static void main(String[] args) {


        BCD bcdZahl = new BCD();
        bcdZahl.fromString("Hallo");

        System.out.println(bcdZahl.toString());
    }
}
