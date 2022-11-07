package lesson3_20220920;

public class Test2 {
    static int count = 1;
    public static void main(String[] args) {
        int fact = 1;
        int n = 5;
        while (n >= 1) { // interrupt loop
            fact *= n;
            n--;
        }
//        fact (5);
        func1();
//        func2();
    }


//    static int fact(int n) {             Deactivated
//        System.out.println(count);
//        count++;
//        if (n <= 1) {  // base case
//            return 1;
//        } else {
//            return n * fact(n - 1);
//        }
//    }

    static void func1(){
        System.out.println("func1");
        func2();
    }
    static void func2(){
        System.out.println("func2");
        func3();
    }

    static void func3(){
        System.out.println("func3");
        func4();
    }
    static void func4(){
        System.out.println("func4");
        func1();
    }

}
