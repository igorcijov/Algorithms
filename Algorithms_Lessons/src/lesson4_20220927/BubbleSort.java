package lesson4_20220927;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1, 23, 4, 15};
        System.out.println(Arrays.toString(bubbleSort(nums))); // O(nˆ2) vipalneaitsa dolga
    }

    static int[] bubbleSort(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        while (!isSorted(nums)) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] > nums[i]) {
                    int temp = nums[i - 1];
                    nums[i - 1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }

    static boolean isSorted(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }
        return true;
    }
}
