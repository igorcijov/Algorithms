package lesson3_20220920;

public class Recursion {
    public static void main(String[] args) {
        int n = 500000;
        int sum = 0;

        while (true){
            if (n<=1){
                sum +=1;
                break;
            }else{
                sum += n;
                n--;
            }
        }
        //System.out.println(sum);
        long startTime = System.currentTimeMillis();
        //System.out.println(recursion(5));
        //recursion(50000);  // Recursia kushaet slihkom mnogo pameati
        System.out.println(System.currentTimeMillis()-startTime);
    }

    static int recursion (int n){
        if (n<=1){
            return 1;
        }else {
           return n + recursion(n-1);
        }
    }
}
