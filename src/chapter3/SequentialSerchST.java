package chapter3;

/**
 * Created by Blue on 2017/6/12.
 */
public class SequentialSerchST<Key, Value> {
    private Node first;
    private int N;

    private class Node {
        Key key;
        Value val;
        Node next;

        public Node(Key key, Value val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    public Value get(Key key) {
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) return x.val;
        }
        return null;
    }

    public void put(Key key, Value val) {
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }
        }
        N += 1;
        first = new Node(key, val, first);
    }

    public boolean delete(Key key) {
        int i = 0;
        for (Node x = first; x != null; x = x.next) {
            i += 1;
            if (key.equals(x.key)) {
                int j = 0;
                for (Node y = first; y != null; y = y.next) {
                    j += 1;
                    if (j == i - 1) {
                        y.next = y.next.next;
                    }
                }
                N -= 1;
                return true;
            }
        }
        return false;
    }

    public int size() {
        return N;
    }

    public static void main(String[] args) {
        SequentialSerchST st = new SequentialSerchST();
        st.put("name", "blue");
        st.put("age", "24");
        st.put("sex", "male");
        System.out.println(st.size());
        System.out.println(st.get("name"));
        System.out.println(st.delete("name"));
        System.out.println(st.get("name"));
        System.out.println(st.size());
    }
}
