public class Stack<V> {
    private LinkedList<V> list;

    public Stack() {
        list = new LinkedList<V>();
    }

    public void push(V value) {
        list.insertLast(value);

    }

    public V pop() throws ValueNotFoundException {
        V value = list.getLastValue();
        list.remove(value);
        return value;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void empty() {
        list.empty();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public void print() {
        System.out.println(toString());
    }


}

