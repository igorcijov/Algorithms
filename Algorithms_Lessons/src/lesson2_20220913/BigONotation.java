package lesson2_20220913;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigONotation {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        bubleFor(10);

    }

    public static void method(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
    }

    public static void bubleFor(int n) {
        for (int i = 0; i <= n /3; i++) { // O(?)
            for (int j = 1; j <= n; j = j + 4) {  // O(?)
                System.out.println("Hello world!");
            }
        }
    }

    public static void fork(int n){
        if (n<5){
            System.out.println("number < 5");
        }else{
            for (int i = 0; i < n; i++) {
                System.out.println(i);
            }
        }
    }

    public static int factorial(int x) {
        if (x==1){
            return 1;
        }
        return x*factorial(x-1); //Recursia, Metodul se cheama singur pe el.
    }

    public static int listSum(String[] array){
        int result = 0; //1
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            char[] chars = array[i].toCharArray();
            array[i].contains("a");
//            for (int j = 0; j < chars.length; j++) {
//                System.out.println(chars[j]);
//            }
        }
        return result;
    }
}
