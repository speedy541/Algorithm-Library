
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */
public class priorityqueue {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        PriorityQueue<Integer> p=new PriorityQueue<>();
        p.add(9);
        p.add(8);
        p.add(8);
        p.add(5);
     //   p.add(5);
        int k=3;
       
        for(int i=1;i<=k;i++)
        {
            int temp=p.poll();
            temp*=-1;
            p.add(temp);
        Iterator<Integer> j=p.iterator();
      
            while(j.hasNext())
        {
           System.out.print(j.next()+" ");
        }
       System.out.println();
        }
        int sum=0;
 Iterator<Integer> i=p.iterator();
            
 while(i.hasNext())
       {
           sum+=i.next();
        }
        System.out.println(sum);
    }
}
