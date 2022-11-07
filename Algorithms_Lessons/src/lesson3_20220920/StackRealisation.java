package lesson3_20220920;

import java.util.Stack;

public class StackRealisation {
    public static void main(String[] args) {
        Stack<Integer> nums = new Stack<>();
        System.out.println(nums.isEmpty());

        nums.push(1);
        nums.push(2);
        nums.push(3);
        nums.push(4);
        nums.push(5);
        nums.push(1);
        nums.push(2);
        nums.push(3);
        nums.push(4);
        nums.push(10);

        while (nums.peek() !=5){
            System.out.println(nums.pop());
        }

//        System.out.println(nums.pop());
//        System.out.println(nums.pop());
//        System.out.println(nums.peek());
//        System.out.println(nums.peek());


    }
}
