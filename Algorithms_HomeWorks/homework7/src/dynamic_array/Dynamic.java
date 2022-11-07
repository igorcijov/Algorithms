package dynamic_array;

public interface Dynamic {
    void add (int value);
    void add (int index, int value);
    void remove ();
    void remove (int value);
    void removeAt (int index);
    void growSize(int value);
    void shrinkSize();
    void set (int index, int value);
    int get (int index);
    void clear();
    boolean contains (int value);
    boolean isEmpty();
}
