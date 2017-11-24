package bcd;

import java.util.Arrays;

public class BCD {

    char[] bcdZahl = new char[30];

    public BCD(){
    }

    public BCD(char[] bcdZahl) {
        this.bcdZahl = bcdZahl;
    }

    public static void main(String[] args) {
        char[] some = new char[30];

        for (char c : some){
            c = 1;
        }

        System.out.println(some.toString());
    }

    public void fromString(String string){
        char[] stringChar = string.toCharArray();
        int j = 0;
        for (int i = bcdZahl.length; i>bcdZahl.length-stringChar.length; i--){
            bcdZahl[i] = stringChar[j];
            j++;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(bcdZahl);
    }
}
