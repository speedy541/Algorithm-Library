//DEPTH FIRST SEARCH USING ADJACENCY LIST ONLY IF ALL VERTEX ARE CONNECTED ALL TOGETHER
import java.util.Iterator;
import java.util.LinkedList;
//import java.util.Queue;
import java.util.*;

public class DFSearch {
    int V;
    LinkedList<Integer> arr[];
    DFSearch(int v)
    {
        V=v;
        arr=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            arr[i]=new LinkedList();
        }
    }
    void edge(int v,int w)
    {
        arr[v].add(w);
    }
    void DFSutil(int v,boolean visited[])
    {
        visited[v]=true;
       System.out.println(v);
        Iterator<Integer> i=arr[v].listIterator();
        while(i.hasNext())
        {
            int j=i.next();
            if(!visited[j])
            {
                DFSutil(j,visited);
            }
        }
     
    }
    void DFS(int s)
    {
      
        boolean visited[]=new boolean[V];
   
        DFSutil(s,visited);
       
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      int V=s.nextInt();
        DFSearch graph=new DFSearch(V);
        int E=s.nextInt();
        for(int i=0;i<E;i++)
        {
            graph.edge(s.nextInt(),s.nextInt());
        }
        graph.DFS(0);
    }
  
    }

