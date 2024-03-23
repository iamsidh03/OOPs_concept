package collection_FrameWork;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        /*
         * ArrayDeque stands for "double ended queue".
         *  It is a data structure that allows you to add or remove elements
         *  from both the front and the back of the queue.
         * ArrayDeque is implemented as a resizable array
         */
        ArrayDeque<Integer> a=new ArrayDeque<>();
        a.offer(10);//add element in last
        a.offer(111);
        a.offerFirst(100);//add element in first
        a.offerLast(2000);
        System.out.println(a);
        System.out.println(a.peek());
        System.out.println(a.peekFirst());
        System.out.println(a.peekLast());
        a.remove();// remove from 1st 
        // a.removeFirst();
        // a.removeLast();
        System.out.println(a);

        System.out.println(a.poll());
        System.out.println(a.pollFirst());
        System.out.println(a.pollLast());

    }
}
