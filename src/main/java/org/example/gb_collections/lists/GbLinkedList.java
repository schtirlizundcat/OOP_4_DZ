package org.example.gb_collections.lists;

import org.example.gb_collections.GbList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class GbLinkedList<E> implements GbList<E> {
    private LinkedList<E> values = new LinkedList<>();

    @Override
    public void add(E value) {
        values.add(value);
    }

    @Override
    public void add(int index, E value) {
        values.add(index, value);
    }

    @Override
    public E get(int index) {
        return values.get(index);
    }

    @Override
    public void remove(E value) {
        values.remove(value);
    }


    @Override
    public void removeByIndex(int index) {
        values.remove(index);
    }

    @Override
    public int size() {
        return values.size();
    }

    @Override
    public Iterator<E> iterator() {
        ListIterator<E> listIterator = new ListIterator<E>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public E next() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public E previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(E e) {

            }

            @Override
            public void add(E e) {

            }
        };
        return listIterator;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        int i = 0;
        while (i < values.size()) {
            builder.append(values.get(i)).append(", ");
            i++;
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}
