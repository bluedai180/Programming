package chapter1;

import java.util.Iterator;

/**
 * Created by HIPADUSER on 2017/2/4.
 */
public class Stack<Item> implements Iterable<Item> {

    private int num;
    private Node first;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return num == 0;
    }

    public int size() {
        return num;
    }

    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        num++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        num--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<Item> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {

        }
    }
}
