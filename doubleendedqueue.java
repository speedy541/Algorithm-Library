
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */
public class doubleendedqueue {
    public static void main(String[] args) {
        Deque deque=new LinkedList<>();
        deque.addLast(10);
        deque.addLast(30);
     deque.addFirst(30);
    deque.push(25);
     Iterator<Integer> i=deque.iterator();
     while(i.hasNext())
     {
         System.out.println(i.next());
     }
     System.out.println(deque);
     deque.pollLast();
     System.out.println(deque);
     deque.pollFirst();
     System.out.println(deque);
     
        
    }
}
