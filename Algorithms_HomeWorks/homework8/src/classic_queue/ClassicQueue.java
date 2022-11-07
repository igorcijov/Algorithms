/*
 * Java Pro. Homework #8
 *
 * @author Igor Cijov
 * @version 25 Okt 2022
 *
 */

package classic_queue;

import java.util.Arrays;

public class ClassicQueue implements Comparable<ClassicQueue> {
    private int[] array;
    private int head;
    private int tail;
    private int capacity;
    private int count;

    public ClassicQueue(int size) {
        array = new int[size];
        capacity = size;
        head = this.array[0];
        tail = array.length - 1;
        count = 0;
    }

    public void pushToEnd(int value) {
        int[] newArray = new int[array.length];
        System.arraycopy(array, 1, newArray, 0, array.length - 1);
        newArray[array.length - 1] = value;
        array = newArray;
        count += 1;
    }

    public void remove() {
        int[] newArray = new int[array.length];
        System.arraycopy(array, 1, newArray, 0, array.length - 1);
        newArray[array.length - 1] = 0;
        array = newArray;
        count -= 1;
    }

    public int peek() {
        return this.array[0];
    }

    public boolean isEmpty() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        int size = array.length;
        return size;
    }

    @Override
    public int compareTo(ClassicQueue o) {
        if (this.array.length != o.array.length) {
            if (this.array.length > o.array.length) {
                return 1;
            } else {
                return -1;
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (this.array[i] > o.array[i]) {
                    return 1;
                } else if (this.array[i] < o.array[i]) {
                    return -1;
                }
            }
            return 0;
        }
    }

    @Override
    public String toString() {
        return "ClassicQueue{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
