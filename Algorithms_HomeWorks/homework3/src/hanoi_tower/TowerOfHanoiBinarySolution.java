package hanoi_tower;

import java.util.Stack;

public class TowerOfHanoiBinarySolution {
    public static void main(String[] args) {
        // tower A disks stack
        Stack<Integer> a = new Stack<>();

        // tower B disks stack
        Stack<Integer> b = new Stack<>();

        // tower C disks stack
        Stack<Integer> c = new Stack<>();

        //numberOfDisks = number of disks are initially placed on tower A
        int numberOfDisks = 4;

        // add disks to stack a, Hierarchically the largest disk at the bottom
        for (int i = numberOfDisks; i >= 1; i--) {
            a.push(i);
        }

        // print disks in tower A, B, C, before move disks from tower A to tower B
        System.out.println("A: " + a.toString());
        System.out.println("B: " + b.toString());
        System.out.println("C: " + c.toString() + "\n");

        // invoke method moveDisksB to moving disks from stack a to stack b
        moveDisksB(numberOfDisks, a, b, c);

        // print disks in tower A, B, C, after moved disks from tower A to tower B
        System.out.println("\n" + "A: " + a.toString());
        System.out.println("B: " + b.toString());
        System.out.println("C: " + c.toString());
    }

    // method moveDisksB to moving disks from stack from to stack to
    public static void moveDisksB(int n, Stack<Integer> from, Stack<Integer> to, Stack<Integer> secondary) {
        // initial state being move #0, with all digits 0
        String last = "0";

        // loop from 1 to max number of moves = (2ˆnumberOfDisks) -1
        for (int i = 1; i <= Math.pow(2, n) - 1; i++) {
            //binary (base-2) representation of the curr move number
            String curr = Integer.toBinaryString(i);

            // invoke method moveDiskNumber to know which disk you need to move
            int moveDisk = moveDiskNumber(last, curr);

            // search in 3 stacks to know where is the disk that you will move
            if (from.contains(moveDisk)) {
                /* invoke method moveDisksTo to make only one legal move to right if number of disks odd,
                or only two legal move to right if number of disks even */
                /* (if #disks odd) move the disk from stack "from" to stack "to" if it legal
                if not move to stack "secondary",
                (if #disks even) move the disk from stack "from" to stack "secondary" if it legal
                if not move to stack "to"
                 */
                moveDisksTo(n, from.peek(), to, secondary);

                // remove disk from stack "from"
                from.pop();
            } else if (to.contains(moveDisk)) {
                moveDisksTo(n, to.peek(), secondary, from);
                to.pop();
            } else if (secondary.contains(moveDisk)) {
                moveDisksTo(n, secondary.peek(), from, to);
                secondary.pop();
            }

            // print a,b,c stacks elements after each move
            System.out.println("\n" + "Step: " + i);
            System.out.println("A: " + from.toString());
            System.out.println("B: " + to.toString());
            System.out.println("C: " + secondary.toString());

            // save curr move
            last = curr;
        }
    }

    /* method moveDiskNumber return number of disk you need to move,
    according to last binary move and curr binary move */
    private static int moveDiskNumber(String last, String curr) {
        // if length of last binary move as string = length of curr binary move as string
        if (last.length() == curr.length()) {
            for (int i = 0; i < curr.length(); i++) { // loop over binary number
                // if '0'in last move = '1' in curr move
                if (last.charAt(i) == '0' && curr.charAt(i) == '1') {
                    return last.length() - i; // return the number of disk (start count from right)
                }
            }
        }
        // if length of last move not equal length of curr move
        return curr.length(); // return the length of curr move
    }

    /* method moveDisksTo to make only one legal move to right if number of disks odd,
    or only two legal move to right if number of disks even,
    (if disk in stack c, then move to right will be move to stack a).
     */
    private static void moveDisksTo(int n, int disk, Stack<Integer> stStack, Stack<Integer> ndStack) {
        // if n (#disks) is odd
        if (n % 2 != 0) {
            if (!stStack.isEmpty()) { // if first stack (stStack) is not empty
                if (stStack.peek() > disk) { //if the top disk in stStack is bigger than the disk
                    stStack.push(disk); // add disk to stStack
                } else { // if the top disk in stStack is smaller than the disk
                    ndStack.push(disk); // add disk to second stack (ndStack)
                }
            } else { // if first stack is empty
                stStack.push(disk); // add disk to stStack
            }
        } else { // if n (#disks) is even
            if (!ndStack.isEmpty()) { // if second stack (ndStack) is not empty
                if (ndStack.peek() > disk) { // if the top disk in ndStack is bigger than the disk
                    ndStack.push(disk); // add disk to ndStack
                } else { //if the top disk in ndStack is smaller than the disk
                    stStack.push(disk); // add disk to stStack
                }
            } else { // if ndStack is empty
                ndStack.push(disk); // add disk to ndStack
            }
        }
    }
}
