package lesson8_20221025;

import java.util.Stack;

public class SpecialStack extends Stack<Integer> {
    Stack stack;

    public SpecialStack(Stack stack) {
        this.stack = stack;
    }

    public int getMin(SpecialStack stack) {
        int min = stack.get(0);
        for (int i = 0; i < stack.size(); i++) {
            if (min > stack.get(i)) {
                min = stack.get(i);
            }
        }
        return min;
    }
}
