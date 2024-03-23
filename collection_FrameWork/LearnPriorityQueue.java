package collection_FrameWork;
import java.util.Comparator;
import java.util.PriorityQueue;
//A priority queue is a type of queue that arranges elements based on their priority values
public class LearnPriorityQueue {
    public static void main(String[] args) {
       // System.out.println("raj");
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
         // we can take any datatype integer,String,Boolean, class objects
         /*
          * add()-----O(logn)
          peek()-------O(1)
          remove()-----O(logn)
          */
          pq.add(2);
          pq.add(42);
          pq.add(25);
          pq.add(20);
          pq.add(27);
          while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
          }

          // if you want to reverse the priority
          PriorityQueue<Integer> p= new PriorityQueue<>(Comparator.reverseOrder());
          p.offer(30);
          p.offer(10);
          p.offer(40);
          System.out.println(p);
          while (!p.isEmpty()) {
            System.out.println(p.peek());
            p.remove();
          }


          
          
    }
}
