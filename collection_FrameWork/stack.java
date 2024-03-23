package collection_FrameWork;
import java.util.*;
public class stack {
    public static void main(String[] args) {
        //A stack is a data structure that follows a last in, first out (LIFO) protocol
        Stack<String> s=new Stack<>();
        s.push("dog");
        s.push("cat");
        s.push("tiger");
        System.out.println("stack "+s);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);
    }
    
}
