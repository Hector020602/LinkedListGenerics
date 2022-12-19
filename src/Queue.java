public class Queue<V> {

    private LinkedList<V> list;

    public void push (V value) {list.insertLast(value); }

    public V pop() throws EmptyListException {
        V value = list.getLastValue();
        return value;
    }


    public boolean isEmpty() {return list.isEmpty();}


    @Override
    public String toString() {
        return list.toString();
    }

    public void print() {
        list.print();
    }

}
