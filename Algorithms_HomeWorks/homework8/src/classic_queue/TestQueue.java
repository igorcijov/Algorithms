/*
 * Java Pro. Homework #8
 *
 * @author Igor Cijov
 * @version 25 Okt 2022
 *
 */

package classic_queue;

public class TestQueue {
    public static void main(String[] args) {
        ClassicQueue classicQueue = new ClassicQueue(5);
        System.out.println(classicQueue);
        System.out.println("isEmpty?: " + classicQueue.isEmpty());

        classicQueue.pushToEnd(2);
        System.out.println(classicQueue);
        classicQueue.pushToEnd(3);
        System.out.println(classicQueue);
        classicQueue.pushToEnd(5);
        System.out.println(classicQueue);
        classicQueue.pushToEnd(8);
        System.out.println(classicQueue);
        classicQueue.pushToEnd(1);
        System.out.println(classicQueue);

        classicQueue.remove();
        System.out.println(classicQueue);

        System.out.println("isEmpty?: " + classicQueue.isEmpty());
        System.out.println("Size: " + classicQueue.size());
        System.out.println("Peek: " + classicQueue.peek());

        System.out.println(classicQueue);
    }
}
