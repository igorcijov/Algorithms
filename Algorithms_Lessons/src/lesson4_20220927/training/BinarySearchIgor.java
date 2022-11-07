package lesson4_20220927.training;

import java.util.Arrays;

public class BinarySearchIgor {
    public static void main(String[] args) {
//        int[] array = {2, 3, 5, 7, 3, 4, 5, 6, 7, 8, 54, 4, 2, 3, 5, 56, 7, 765, 4, 3, 2, 4, 6, 7, 8, 9, 0, 0,};
//        int num = 56;
//        Arrays.sort(array);
//        System.out.println(binarySearch(array, num));

        int[] arrayLength = new int [10_000_000];
        for (int i = 0; i < 10_000_000 ; i++) {
            arrayLength[i]=i;
        }

        long startTime = System.nanoTime();
        binarySearch(arrayLength,7240);
        long bsFinish = System.nanoTime()-startTime;

        long startssTime = System.nanoTime();
        simpleSearch(arrayLength,7240);
        long ssFinish = System.nanoTime()-startTime;


        System.out.printf("time for binary search is %d nanosecond, \ntime for simple search is %d nanosecond", bsFinish, ssFinish);
    }

    public static int binarySearch(int[] array, int num) {
        int l = 0;
        int r = array.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (array[m] == num) {
                return m;
            } else if (array[m] < num) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    public static int simpleSearch(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
