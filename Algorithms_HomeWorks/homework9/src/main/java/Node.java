/*
 * Java Pro. lesson #8
 *
 * @author Igor Cijov
 * @version 05 Jul 2022
 *
 */

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public Node() {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
