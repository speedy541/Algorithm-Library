//BREADTH FIRST SEARCH USING ARRAYLIST
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class BFSearch {
    int V;
    LinkedList<Integer> arr[];
    BFSearch(int v)
    {
        V=v;
        arr=new LinkedList[v];
        for(int i=1;i<v;i++)
        {
            arr[i]=new LinkedList();
        }
    }
    void edge(int v,int w)
    {
        arr[v].add(w);
        arr[w].add(v);
    }
    void BFSUtil(int s,boolean visited[])
    {
      
        Queue<Integer> queue=new LinkedList<>();
        visited[s]=true;
        queue.add(s);
      //  int counter=1;
        while(!queue.isEmpty())
        {
             s=queue.poll();
        System.out.println(s);
        Iterator<Integer> i=arr[s].listIterator();
        while(i.hasNext())
        {
           
            int n=i.next();
            if(!visited[n])
            {
                
          
                visited[n]=true;
                queue.add(n);
            }
        }
        }
        }
    void BFS(int i)
    {
        boolean visited[]=new boolean[V];
                BFSUtil(i,visited);
    //  for(int i=1;i<=V;i++)
     //   {
       //     if(visited[i]==false)
        //    {
         //       BFSUtil(i,visited);
       //     }
       // }
        //    System.out.println(counter);
          //      sum+=lib+((counter-1)*road);
            
        //    }
          
        //}
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
     
 
        int V=s.nextInt();
        BFSearch graph=new BFSearch(V+1);
        int E=s.nextInt();
        for(int i=0;i<E;i++)
        {
            int x=s.nextInt();
            int y=s.nextInt();
            graph.edge(x,y);
        }
        graph.BFS(1);
         }
 
}

