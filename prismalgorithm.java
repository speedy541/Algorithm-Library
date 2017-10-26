
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
public class prismalgorithm {
    static int v;
    static int minkey(boolean[] mset,int[] key)
    {
        int min=Integer.MAX_VALUE,minindex=-1;
        for(int i=0;i<v;i++)
        {
            if(mset[i]==false&&key[i]<min)
            {
                min=key[i];
                minindex=i;
            }
        }
        return minindex;
    }
   static  void prism(int[][] graph)
    {
        int[] parent=new int[v];
        boolean[] mset=new boolean[v];
        int[] key=new int[v];
        for(int i=0;i<v;i++)
        {
            key[i]=Integer.MAX_VALUE;
            mset[i]=false;
        }
        parent[0]=-1;
        key[0]=0;
        for(int count=0;count<v-1;count++)
        {
            int keyval=minkey(mset,key);
            mset[keyval]=true;
            for(int i=0;i<v;i++)
            {
                if(graph[keyval][i]!=0&&mset[i]==false&&graph[keyval][i]<key[i])
                {
                   parent[i]=keyval;
                   key[i]=graph[keyval][i];
                }
            }
        }
        for(int i=1;i<v;i++)
        {
            System.out.print(parent[i]+" ");
        }
        for(int i=1;i<v;i++)
        {
            System.out.println(parent[i]+"->"+i+" "+graph[parent[i]][i]);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        v=s.nextInt();
        int graph[][]=new int[v][v];
        int e=s.nextInt();
        for(int i=1;i<=e;i++)
        {
            int x=s.nextInt();
            int y=s.nextInt();
            graph[x][y]=graph[y][x]=s.nextInt();
        }
        prism(graph);
    }
    
}
