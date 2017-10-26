
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
public class binarytree {
   static Node root;
   void insert(int key)
   {
       root=insert1(root,key);
   }
    Node insert1(Node root,int key)
    {
      if(root==null)
      {
          root=new Node(key);
          return root;
      }
      if(key<root.data)
      {
          root.left=insert1(root.left,key);
      }
      else if(key>root.data)
      {
          root.right=insert1(root.right,key);
      }
          return root;
      
    }
    static void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    static void postorder(Node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    static void preorder(Node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
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
    static int height(Node root)
    {
        if(root==null)
        {
            return -1;
        }
        return (Math.max(1+height(root.left),1+height(root.right)));
    }
    static Node lca(Node root,int v1,int v2)
    {  if(root==null)
        return null;
    if(root.data>v1&&root.data>v2)
    {
       return lca(root.left,v1,v2);
    }
    if(root.data<v1&&root.data<v2)
    {
       return lca(root.right,v1,v2);
    }
    return root;
    }
    
    static boolean isBST(Node root,int min,int max)
    {
        if(root==null)
        {
            return true;
        }
        if(root.data<=min||root.data>=max)
        {
            return false;
        }
        return (isBST(root.left,min,root.data)&&isBST(root.right,root.data,max));
    }
   static String search(Node root,int i)
    {
        String s="";
        if(root==null)
           s+="not";
        if(root.data==i)
            s+="yes";
        else if(root.data>i)
        {
            search(root.left,i);
        }
        else
            search(root.right,i);
       return s;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
     binarytree b=new binarytree();
        for(int i=1;i<=7;i++)
        {
            b.insert(s.nextInt());
        }
        inorder(root);
        System.out.println();
    
        postorder(root);
            System.out.println();
    
        preorder(root);
            System.out.println();
    
        levelorder(root);
        System.out.println();
        System.out.println("Height"+height(root));
        Node temp=lca(root,20,40);
        System.out.println(temp.data);
        System.out.println(isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
      System.out.println("search");
      int a=s.nextInt();
      System.out.println(search(root,a));
      
    }
    class Node
    {
        int data;
        Node left,right;
        Node(int i)
        {
            data=i;
        }
    }
}
