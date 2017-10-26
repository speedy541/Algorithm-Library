
import java.util.Iterator;
import java.util.LinkedList;
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
public class Graph1 {
    int V;
    LinkedList<Integer> arr[];
    Graph1(int v)
    {
        V=v;
        arr=new LinkedList[V];
        for(int i=1;i<V;i++)
        {
            arr[i]=new LinkedList();
        }
        
    }
    void edge(int v,int w)
    {
        arr[v].add(w);
    }
    void DFS(int s,boolean[] visited)
    {
        System.out.print(s+" ");
        visited[s]=true;
        Iterator<Integer> i=arr[s].listIterator();
        while(i.hasNext())
        {
            int j=i.next();
            if(visited[j]==false)
            {
                DFS(j,visited);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int v=s.nextInt();
        Graph1 g=new Graph1(v+1);
        int e=s.nextInt();
        for(int i=1;i<=e;i++)
        {
            g.edge(s.nextInt(),s.nextInt());
        }
        boolean[] visited;
        visited=new boolean[v+1];
        g.DFS(1,visited);
    }
}
