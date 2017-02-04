package chapter1;

import java.util.Iterator;

/**
 * Created by HIPADUSER on 2017/2/4.
 */
public class Queue<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int num;

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

    public void enqueue(Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
        }
        num++;
    }

    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        num--;
        return item;
    }

    @Override
    public Iterator iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<Item> {
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
