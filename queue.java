import java.util.*;
public class queue {
    /*
     * queue follows the FIFO (First In First Out) method and is open at both of its ends.
     *  Data insertion is done at one end, the rear end or the tail of the queue,
     *  while deletion is done at the other end, called the front end or the head of the queue.
     */
    public static void main(String[] args) {
        /*
         * offer():Insert a element into the queue.If the task is successfull return true else through an exception
         * add():Insert element into the queue.if task is successfull return true else return false
         * element():return the head of an element. throw an exception if queue is empty
         * peek():return the head of an element. return null value if queue id empty
         * remove():return and remove the head of the element. throws exception if the queue is empty
         * poll():return and remove the ead of the element. return null if queue is empty
         */
        Queue<Integer> q= new LinkedList<>();
        q.offer(4);
        q.offer(34);
        q.offer(9);
        q.offer(24);
        q.offer(0);
        q.add(344);
       
        System.out.println( q.peek());
        q.element();
        System.out.println(q);

    }
}
