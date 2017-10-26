
import java.util.Scanner;

public class unionfind {
  static  int V,E;
    static Edge edge[];
    class   Edge 
            {
                int src,dest;
            };
    unionfind(int v,int e)
    {
        edge=new Edge[E];
        for(int i=0;i<E;i++)
        {
            edge[i]=new Edge();
        }
    }
    static int find(int i,int[] parent)
    {
        if(parent[i]==-1)
            return i;
        return find(parent[i],parent);
    }
    static void union(int x,int y,int[] parent)
    {
        int xset=find(x,parent);
        int yset=find(y,parent);
        parent[xset]=yset;
    }
    static int iscycle()
    {
        int[] parent=new int[V];
        for(int i=0;i<V;i++)
        {
            parent[i]=-1;
        }
        for(int i=0;i<E;i++)
        {
            int x=find(unionfind.edge[i].src,parent);
            int y=find(unionfind.edge[i].dest,parent);
            if(x==y)
                return -1;
            union(x,y,parent);
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        V=s.nextInt();
        E=s.nextInt();
        
        unionfind u=new unionfind(V,E);
        for(int i=0;i<E;i++)
        {
            u.edge[i].src=s.nextInt();
            u.edge[i].dest=s.nextInt();
        }
        System.out.println(u.iscycle());
    }
}
