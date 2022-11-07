package dynamic_array;

import java.util.Arrays;
import java.util.Iterator;

public class DynamicArray implements Dynamic, Iterator, Comparable<DynamicArray> {
    private int[] array;
    private int count;
    private int position;
    private int size;

    DynamicArray() {
        this.array = new int[10];
        this.count = 0;
        this.position = 0;
        this.size = this.array.length;
    }

    DynamicArray(int capacity) {
        this.array = new int[size];
        this.count = 0;
        this.position = 0;
        this.size = this.array.length;
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public void add(int value) {
        if (count == array.length - 1) {
            int[] newArray = new int[array.length + 10]; //geht auch so: new int [array.length*2]
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[array.length - 1] = value;
            array = newArray;
            count += 1;
        } else {
            array[count] = value;
            count += 1;
        }
    }

    @Override
    public void add(int index, int value) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = value;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        array = newArray;
        if (index > count) {
            count = index + 1;
        } else {
            count += 1;
        }
    }

    @Override
    public void remove() {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, array.length - 1);
        array = newArray;
    }

    @Override
    public void remove(int value) {
        for (int i = 0; i < array.length; i++) {
            if (value != 0 && value == array[i]) {
                array[i] = 0;
            }
        }
        count -= 1;
    }

    @Override
    public void removeAt(int index) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - (index + 1));
        array = newArray;
        count -= 1;
    }

    @Override
    public void growSize(int value) {
        int[] newArray = new int[array.length + value];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    @Override
    public void shrinkSize() {
        int num = 0;
        int i = array.length - 1;
        while (array[i] == 0) {
            i--;
            num++;
        }
        int[] newArray = new int[array.length - (num - 1)];
        System.arraycopy(array, 0, newArray, 0, array.length - (num - 1));
        array = newArray;
    }


//    @Override
//    public void shrinkSize(int value) {
//        if (value <= array.length) {
//            int[] newArray = new int[array.length - value];
//            System.arraycopy(array, 0, newArray, 0, array.length - value);
//            array = newArray;
//        }
//    }

    @Override
    public void set(int index, int value) {
        array[index] = value;
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public void clear() {
        array = new int[10];
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int compareTo(DynamicArray o) {
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

//    @Override        // Compare Sum
//    public int compareTo(DynamicArray o) {
//        int counter = 0;
//        int thisCounter = 0;
//        for (int i : o.array) {
//            counter += i;
//        }
//
//        for (int i : this.array) {
//            thisCounter += i;
//        }
//        if (thisCounter > counter) {
//            return 1;
//        } else if (thisCounter < counter) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }


    public boolean compare(DynamicArray o) {
        if (this.array.length == o.array.length) {
            for (int i = 0; i < array.length; i++) {
                if (this.array[i] == o.array[i]) {
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public String compareSum(DynamicArray o) {
        int sumArray1 = 0;
        int sumArray2 = 0;
        for (int i = 0; i < this.array.length; i++) {
            sumArray1 += this.array[i];
        }
        for (int j = 0; j < o.array.length; j++) {
            sumArray2 += o.array[j];
        }
        if (sumArray1 == sumArray2) {
            return "The sum of the Arrays is EQUAL";
        }
        return sumArray1 > sumArray2 ? "The sum of the FIRST matrix is greater" : "The sum of the SECOND matrix is greater";
    }

    @Override
    public boolean hasNext() {
        return position <= array.length - 1;
    }

    @Override
    public Object next() {
        int value = this.array[position];
        position++;
        return value;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
