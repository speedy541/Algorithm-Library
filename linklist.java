
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
public class linklist {
   Node rootnode;
   void add(Node node,int i)
   {
       
       if(node==null)
       {
           rootnode=new Node(i);
       }
       else if(node!=null)
       {
           new Node(i);
       }
   }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
    }
    class Node
    {
        int data;
        Node next;
        Node(int i)
        {
            data=i;
        }
    }
}
