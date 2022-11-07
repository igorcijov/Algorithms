/*
 * Java Pro. Homework #9
 *
 * @author Igor Cijov
 * @version 01 Nov 2022
 *
 */

import java.util.Iterator;

public class MySingleLinkedList implements ListLinked, Iterable {
    private Node head;
    private Node tail;

    public MySingleLinkedList() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void pushToHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    @Override
    public void pushToTail(int data) {
        Node newNode = new Node(data);
        Node currentNode = head;

        if (isEmpty()) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    @Override
    public void pushToIndex(int index, int data) {
        Node newNode = new Node(data);
        Node preview = new Node();
        Node current = head;
        int counter = 0;

        if (isEmpty()) {
            head = newNode;
        }

        if (index < 0) {
            System.out.println("The Index cannot be negative; pushToIndex cannot be executed");
            return;
        }

        if (index == 0) {
            head = newNode;
            newNode.next = current;
        }
        try {
            while (counter != index) {
                if (current.next == null && counter == index) {
                    preview.next = newNode;
                    newNode.next = current;
                    return;
                } else {
                    preview = current;
                    current = current.next;
                    counter++;
                }
            }
            preview.next = newNode;
            newNode.next = current;

        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeFirst() {
        head = head.next;
    }

    @Override
    public void removeLast() {
        Node preview = new Node();
        Node current = head;

        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        while (current.next != null) {
            preview = current;
            current = current.next;
        }
        preview.next = null;
        tail = preview;
    }

    @Override
    public void remove(int index) {
        Node preview = new Node();
        Node current = head;
        int counter = 0;

        if (index == 0) {
            head = head.next;
            return;
        }

        if (index < 0) {
            System.out.println("The Index cannot be negative; Deletion cannot be executed!");
            return;
        }
        while (counter != index) {
            if (current.next == null) {
                System.out.println("False Index; Deletion cannot be executed!");
                return;
            } else {
                preview = current;
                current = current.next;
                counter++;
            }
        }
        preview.next = current.next;
    }


    @Override
    public int get(int index) {
        Node currentItem = head;
        int counter = 0;
        while (counter != index) {
            if (currentItem.next != null) {
                currentItem = currentItem.next;
                counter++;
            } else {
                return -1;
            }
        }
        return currentItem.data;
    }

    @Override
    public int size() {
        Node current = head;
        int counter = 1;
        if (!isEmpty()) {
            while (current.next != null) {
                current = current.next;
                counter++;
            }
            return counter;
        }
        return 0;
    }

    @Override
    public void print() {
        Node currentNode = head;

        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        }

        if (head != null) {
            System.out.println(head.data);
        }

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.data);
        }
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Object next() {
                int data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}
