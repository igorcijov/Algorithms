package dynamic_array;

/**
 * Java Pro.Algorithms lesson #7
 *
 * @author Igor Cijov
 * @version 18 October 2022
 */

/*      The DynamicArray Class implements the Dynamic Interface and the Iterator Interface.
        The following methods are available:
        - add (int value);
        - add (int index, int value);
        - remove();
        - remove (int value);
        - removeAt (int index);
        - growSize(int value);
        - shrinkSize();
        - set (int index, int value);
        - get (int index);
        - clear();
        - contains (int value);
        - isEmpty();
        - compareTo(DynamicArray o)
        - compare(DynamicArray o)
        - compareSum(DynamicArray o)
        - hasNext()
        - next()
        */

public class DemoApp {
    public static void main(String[] args) {
        DynamicArray dynamicArray1 = new DynamicArray();
        DynamicArray dynamicArray2 = new DynamicArray();
        System.out.println(dynamicArray1);

        dynamicArray1.add(1);
        dynamicArray1.add(2);
        dynamicArray1.add(3);
        dynamicArray1.add(4);
        dynamicArray1.add(5);
        dynamicArray1.add(7, 8);
        dynamicArray1.add(9);
        dynamicArray1.add(5, 6);
        dynamicArray1.add(10);
        dynamicArray1.add(6, 7);
        dynamicArray1.set(7, 8);
        dynamicArray1.removeAt(8);
        dynamicArray1.remove();
        System.out.println("array 1 " + dynamicArray1);

        dynamicArray1.removeAt(2);

        System.out.println("array 1 " + dynamicArray1);
        dynamicArray1.growSize(5);

        dynamicArray2.add(1);
        dynamicArray2.add(2);
        dynamicArray2.add(3);
        System.out.println("array 1 " + dynamicArray1);
        System.out.println("array 2 " + dynamicArray2);
        System.out.println("Compare Dynamic Array: " + dynamicArray1.compare(dynamicArray2));
        System.out.println(dynamicArray1.compareSum(dynamicArray2));

        while (dynamicArray1.hasNext()) {
            System.out.println(dynamicArray1.next());
        }
    }
}
