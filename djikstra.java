
import java.util.Scanner;

public class djikstra
{ 
    static int V;
    static int mindistance(boolean[] set,int[] dist)
    {
        int min=Integer.MAX_VALUE,minindex=-1;
        for(int i=0;i<V;i++)
        {
            if(set[i]==false&&dist[i]<=min)
            {
                min=dist[i];
                minindex=i;
            }
        }
        return minindex;
    }
    static void print(int[] dist)
    {
        for(int i=0;i<V;i++)
        {
            System.out.println(i+"to"+dist[i]);
        }
    }
    static void djik(int[][] graph,int src)
    {
        int[] dist=new int[V];
        boolean[] set=new boolean[V];
        for(int i=0;i<V;i++)
        {
            dist[i]=Integer.MAX_VALUE;
            set[i]=false;
        }
        dist[src]=0;
        for(int count=0;count<V-1;count++)
        {
            int u=mindistance(set,dist);
            set[u]=true;
            for(int v=0;v<V;v++)
            {
                if(!set[v]&&graph[u][v]!=0&&dist[u]!=Integer.MAX_VALUE&&dist[u]+graph[u][v]<dist[v])
                {
                    dist[v]=dist[u]+graph[u][v];
                }
            }
        }
        print(dist);
    }
    public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   V=s.nextInt();
   int[][] graph=new int[V][V];
   int E=s.nextInt();
   for(int i=0;i<E;i++)
   {
       int x=s.nextInt();
       int y=s.nextInt();
       graph[x][y]=graph[y][x]=s.nextInt();
   }
   djik(graph,0);
   
}
}