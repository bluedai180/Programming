package chapter1;

import java.util.Iterator;

/**
 * Created by HIPADUSER on 2017/1/23.
 */
public class StackWithArray<Item> implements Iterable<Item> {

    private Item[] items = (Item[]) new Object[1];
    private int num = 0;

    public boolean isEmpty() {
        return num == 0;
    }

    public int size() {
        return num;
    }

    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < num; i++) {
            temp[i] = items[i];
        }
        items = temp;
    }

    public void push(Item item) {
        if (num == items.length) {
            resize(2 * items.length);
        }
        items[num++] = item;
    }

    public Item pop() {
        Item item = items[--num];
        items[num] = null;
        if (num > 0 && num == items.length / 4) {
            resize(items.length / 2);
        }
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = num;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return items[--i];
        }

        @Override
        public void remove() {

        }
    }
}
