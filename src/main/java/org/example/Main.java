package org.example;

import org.example.gb_collections.GbList;
import org.example.gb_collections.lists.GbLinkedList;

public class Main {
    public static void main(String[] args) {
        GbList<Integer> list = new GbLinkedList<>();
        list.add(5);
        list.add(9);
        list.add(66);
        list.add(8);
        list.add(5);
        list.add(9);
        list.add(66);
        list.add(8);
        list.add(5);
        list.add(9);
        list.add(66);
        list.add(8);
        list.add(17);
        list.add(0);
        list.add(3);
        System.out.println("Размер списка:");
        System.out.println(list.size());
        System.out.println("Выводим список из целых чисел:");
        System.out.println(list);
        list.removeByIndex(3); // Удаление по индексу
        list.remove(9); // Удаление по элементу
        System.out.println("Выводим список из целых чисел после удаления некоторых элементов:");
        System.out.println(list);
        GbList<String> s = new GbLinkedList<>();
        s.add("asdf");
        s.add("xcdf");
        s.add("hjdf");
        s.add("lkjf");
        System.out.println("Выводим список из строк:");
        System.out.println(s);
    }
}