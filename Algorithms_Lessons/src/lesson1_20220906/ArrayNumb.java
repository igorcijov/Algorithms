package lesson1_20220906;

import java.util.Arrays;

public class ArrayNumb {

   // Given an array arr[] of N elements, the challenge is to write a function to find a given element x in arr[] .

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 4, 3};
        int elementToSearch = 6;
        long startTime = System.currentTimeMillis();
        Arrays.sort(array);
        System.out.println("The array is sorted!");
        int index = binarySearch(array, elementToSearch);
        System.out.println(index==-1? "The number does not exist" : "The number "+elementToSearch+" has the index "+index);
        System.out.println("The method lasts " + (System.currentTimeMillis()- startTime) + " ms.");
    }

    public static int binarySearch(int[] array, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        // условие прекращения (элемент не представлен)
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (array[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (array[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            }
            // если средний элемент больше
            // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (array[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
