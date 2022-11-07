/*
 * Java Pro. Algoritmi lesson #8
 *
 * @author Igor Cijov
 * @version 28 Okt 2022
 *
 */

package lesson8_20221025;


import java.util.*;

public class QueueDeque {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        //add i offer pohojie metodi, no esli oceredi ogranicena, to add vibrosit exception
        queue.add("Il'yas");
        queue.add("Maria");
        queue.add("Ivan");
        queue.offer("Lidia");
        queue.offer("Maksim");
        queue.offer("Tim");

        //
        System.out.println(queue);

        // remove i poll pohojie metodi, no esli elementov bolishe net, to remove vibrosit exception
        // removeElem(queue);
        pollElement(queue);
        fillQueue(queue);

        // element i peek, pokazivaet kto v oceredi pervii, no element vibrosit iskliucenia
        System.out.println(queue.element());

        System.out.println(queue);
        queue.remove("Lidia");
        System.out.println(queue);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(8);
        priorityQueue.add(14);
        priorityQueue.add(0);
        priorityQueue.add(0);
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());

        // mojem poluciti dostup kak k pervomu, tak i k poslednemu elementu
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(9);
        deque.addLast(10);
        deque.addFirst(17);
        System.out.println(deque);
    }

    static void removeElem(Queue queue){
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
    }

    static void pollElement(Queue queue){
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
    }

    static void fillQueue (Queue queue){
        queue.add("Il'yas");
        queue.add("Maria");
        queue.add("Ivan");
        queue.offer("Lidia");
        queue.offer("Maksim");
        queue.offer("Tim");
    }
}
