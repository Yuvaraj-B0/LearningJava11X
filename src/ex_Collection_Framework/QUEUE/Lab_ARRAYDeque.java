package ex_Collection_Framework.QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab_ARRAYDeque {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque();
        deck.push(15);
        deck.push(10);
        System.out.println(deck);
    }
}
