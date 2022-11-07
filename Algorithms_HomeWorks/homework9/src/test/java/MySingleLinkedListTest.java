import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 * Java Pro. Homework #9
 *
 * @author Igor Cijov
 * @version 01 Nov 2022
 *
 */

/*      The MySingleLinkedList Class implements the Interface ListLinked and the Interface Iterable.
        The following methods are available:
        - pushToHead (int data);
        - pushToTail (int data);
        - pushToIndex (int index, int data);
        - removeFirst ();
        - removeLast ();
        - remove (int index);
        - get (int index);
        - size ();
        - print ();
        */

class MySingleLinkedListTest {
    private MySingleLinkedList mySingleLinkedList;

    @BeforeEach
    public void init(){
        mySingleLinkedList = new MySingleLinkedList();
        mySingleLinkedList.pushToTail(1);
        mySingleLinkedList.pushToTail(2);
        mySingleLinkedList.pushToTail(3);
    }

    @Test
    void isEmpty() {
        MySingleLinkedList empty = new MySingleLinkedList();
        assertEquals (null, empty.getHead());
    }

    @Test
    void pushToHeadFirstElement() {
        mySingleLinkedList.pushToHead(5);
        assertEquals(5,mySingleLinkedList.get(0));
    }

    @Test
    void pushToHeadSecondElement() {
        mySingleLinkedList.pushToHead(34);
        assertEquals(34,mySingleLinkedList.get(0));
    }

    @Test
    void pushToTailFirstElement() {
       mySingleLinkedList.pushToTail(4);
        assertEquals(4,mySingleLinkedList.get(3));
    }

    @Test
    void pushToTailSecondElement() {
        mySingleLinkedList.pushToTail(27);
        assertEquals(27,mySingleLinkedList.get(3));
    }

    @Test
    void pushToIndexNegative() {
        mySingleLinkedList.pushToIndex(-2,15);
        assertEquals(-1,mySingleLinkedList.get(-2));
    }

    @Test
    void pushToIndex0() {
        mySingleLinkedList.pushToIndex(0,6);
        assertEquals(6,mySingleLinkedList.get(0));
    }

    @Test
    void pushToIndex1() {
        mySingleLinkedList.pushToIndex(1,4);
        assertEquals(4,mySingleLinkedList.get(1));
    }

    @Test
    void pushToIndex3() {
        mySingleLinkedList.pushToIndex(3,14);
        assertEquals(14,mySingleLinkedList.get(3));
    }

    @Test
    void pushToIndex4() {
        mySingleLinkedList.pushToIndex(4,17);
        assertEquals(-1,mySingleLinkedList.get(4));
    }

    @Test
    void removeFirst() {
        mySingleLinkedList.removeFirst();
        assertEquals(2, mySingleLinkedList.get(0));
    }

    @Test
    void removeLast() {
        mySingleLinkedList.removeLast();
        assertNotEquals(3, mySingleLinkedList.get(2));
    }

    @Test
    void removeNegative() {
        mySingleLinkedList.remove(-3);
        assertEquals(-1,mySingleLinkedList.get(-3));
    }

    @Test
    void remove0() {
        mySingleLinkedList.remove(0);
        assertNotEquals(1,mySingleLinkedList.get(0));
    }

    @Test
    void remove1() {
        mySingleLinkedList.remove(1);
        assertNotEquals(2,mySingleLinkedList.get(1));
    }

    @Test
    void remove2() {
        mySingleLinkedList.remove(2);
        assertNotEquals(3,mySingleLinkedList.get(2));
    }

    @Test
    void remove3() {
        mySingleLinkedList.remove(3);
        assertEquals(-1,mySingleLinkedList.get(3));
    }

    @Test
    void get() {
        assertEquals(1, mySingleLinkedList.get(0));
    }

    @Test
    void size() {
        assertEquals(3, mySingleLinkedList.size());
    }
}