
import java.util.LinkedList;
import java.util.Queue;
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
public class queue {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Queue<Integer> queue1=new LinkedList();
        for(int i=1;i<=5;i++)
        {
            int a=s.nextInt();
            if(a==1)
            {
                queue1.add(s.nextInt());
            }
            else if(a==2)
                {
                    System.out.println(queue1.poll());
                }
            else if(a==3)
            {
                System.out.println(queue1.peek());
            }
        }
    }
}
