/*
 * Java Pro. Homework #10
 *
 * @author Igor Cijov
 * @version 15 Nov 2022
 *
 */

/*      The MyTree Class implements the Interface Tree and the Interface Comparable.
        The following methods are available:
        - balanceTree ();
        - printWide ();
        */





public class TestMyTree {
    public static void main(String[] args) {
        MyTree root =
                new MyTree(13,
                        new MyTree(5,
                                new MyTree(1, null, null), new MyTree(30, null, null)),
                        new MyTree(8, null, null));

        System.out.println("Before Balancing:");
        root.printWide();

        root = root.balanceTree();

        System.out.println();
        System.out.println("-----------------");
        System.out.println();

        System.out.println("After Balancing:");
        root.printWide();
    }
}
