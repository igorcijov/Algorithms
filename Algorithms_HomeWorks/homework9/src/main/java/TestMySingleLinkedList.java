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


public class TestMySingleLinkedList {
    public static void main(String[] args) {
        MySingleLinkedList myLinkedList = new MySingleLinkedList();
        myLinkedList.pushToTail(25); //2
        myLinkedList.pushToTail(34); //3
        myLinkedList.pushToHead(5); //1
        myLinkedList.pushToTail(7); //4
        myLinkedList.pushToTail(8); //5
        myLinkedList.pushToHead(10); //0
        myLinkedList.pushToHead(2);
      //  myLinkedList.remove(1);
      //  myLinkedList.removeFirst();
       // myLinkedList.removeLast();
     //   myLinkedList.pushToIndex(7,11);


        myLinkedList.print();

        System.out.println("------------------------");
        System.out.println("Size ist: " + myLinkedList.size());


//        for (Object list : myLinkedList) {
//            System.out.println(list);
//        }
        System.out.println("Get method: " + myLinkedList.get(6));
    }
}
