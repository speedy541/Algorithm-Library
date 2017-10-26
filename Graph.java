
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Graph {
    int V;
    LinkedList<Integer> arr[];
    Graph(int v)
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
    void BFS(int s)
    {
        boolean[] visited=new boolean[V];
        Queue<Integer> queue=new LinkedList();
        visited[s]=true;
        //System.out.print(i+" ");
        queue.add(s);
        while(!queue.isEmpty())
        {
             s=queue.poll();
             System.out.print(s+" ");
             Iterator<Integer> i=arr[s].listIterator();
           while(i.hasNext())
           {
               int j=i.next();
               if(visited[j]==false)
               {
                   queue.add(j);
                   visited[j]=true;
               }
           }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int v=s.nextInt();
        Graph g=new Graph(v+1);
        int e=s.nextInt();
        for(int i=1;i<=e;i++)
        {
            g.edge(s.nextInt(),s.nextInt());
        }
        g.BFS(1);
    }
}
