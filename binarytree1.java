
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
public class binarytree1 {
   static Node root;
    void insert(int key)
   {
       root=insert1(root,key);
   }
   static Node insert1(Node root,int key)
   {
       if(root==null)
       {
           root=new Node(key);
           return root;
       }
       if(root.left==null)
       root.left=insert1(root.left,key);
       else if(root.left!=null)
       {
           insert1(root.left,key);
       }
       else if(root.right==null)
           root.right=insert1(root.right,key);
       else if(root.right!=null)
       {
           insert1(root.right,key);
       }
       
       return root;
   }
    static  Queue queue=new LinkedList();
    static void levelorder(Node root)
    {
        queue.add(root);
        while(!queue.isEmpty())
        {
            Node temp=(Node)queue.poll();
            System.out.println(temp.data);
            if(temp.left!=null)
            {
                queue.add(temp.left);
            }
            if(temp.right!=null)
            {
                queue.add(temp.right);
            }
        }
    }
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
        binarytree1 b=new binarytree1();
        for(int i=1;i<=5;i++)
        {
               b.insert(s.nextInt());
         }
        levelorder(root);
    }
 static  class Node
    {
        int data;
        Node left,right;
        Node(int i)
        {
            data=i;
        }
    }
}
