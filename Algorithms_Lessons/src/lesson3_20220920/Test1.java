package lesson3_20220920;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        // tzelocislenie
        byte b1 = 10; //01 = 2 bita
        short s = 12;
        int i = 14;
        long l = 128l;

        // cisla s plavaiushii tocikoi
        float f = 10.0f;
        double d = 10.0;

        // simvolinie primitivi
        char c = 'a';

        //loghicheskii primitiv
        boolean bool = true;

        // silocinie tipi danih
        String str = "Hello";
        str = "friend";
        str = "byte";

        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        scanner.close();

        System.gc(); //Garbage Collector, asa se keama zborshik musora dar el consuma resursele noastre si nu e nevoie sa-l chemam.

        System.out.println(str);
    }
}
