package lesson3_20220920;

public class Test {
    public static void main(String[] args) {
        int[] nums = {34, 5, 90, -34, 0, 332};

        int x1 = nums[nums.length - 1]; // Konstantnaia vremea

        int x2 = 0;
        for (int i = 0; i < nums.length; i++) {
            x2 = nums[i];   // Lineinaia vremea
        }

        System.out.println(x1 == x2);
        System.out.printf("%d, %d", x1, x2);
        //System.out.println(x1 + ", " + x2);
    }
}
