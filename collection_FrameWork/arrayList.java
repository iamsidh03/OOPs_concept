package collection_FrameWork;
import java.util.*;
import java.util.ArrayList;
/**
 * ArrayList
 */
public class arrayList {

    public static void main(String[] args) {
        
    List<Integer> l=new ArrayList();
    l.add(4);
    l.add(12);
    l.add(133);
    System.out.println(l);
    l.add(69);
    //l.add(133);
    System.out.println(l);
    /* 
    l.remove(1);// remove element at index 1st
    System.out.println(l);
    */
    /* 
    l.remove(Integer.valueOf(133));// remove value of element at any index
    System.out.println(l);
    */
    /* 
    l.clear();//delete list
    System.out.println(l);
    */
    l.set(1, 100000);
    for (int index = 0; index < l.size(); index++) {
        System.out.println("the element is "+l.get(index));
    }
    for(Integer e:l){
        System.out.println("for each loop " +e);
    }
    Iterator<Integer> i=l.iterator();
    while (i.hasNext()) {
        System.out.println("Iterator method "+i.next());
    }
    }
}
