/*
 * Java Pro. Homework #9
 *
 * @author Igor Cijov
 * @version 01 Nov 2022
 *
 */

public interface ListLinked {
    public void pushToHead(int data);

    public void pushToTail(int data);

    public void pushToIndex(int index, int data);

    public void removeFirst();

    public void removeLast();

    public void remove(int index);

    public int get(int index);

    public int size();

    public void print();
}
