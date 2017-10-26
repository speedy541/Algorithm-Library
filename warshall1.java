
import java.util.Arrays;
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
public class warshall1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int e=s.nextInt();
        long[][] graph=new long[n+1][n+1];
        for(long[] rows:graph)
        {
            Arrays.fill(rows,100000000l);
        }
        for(int i=0;i<e;i++)
        {
            int a=s.nextInt();
            int b=s.nextInt();
            graph[a][b]=graph[b][a]=s.nextInt();
        }
        int node=s.nextInt();
        for(int k=1;k<=n;k++)
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    graph[i][j]=Math.min(graph[i][j],graph[i][k]+graph[k][j]);
                }
            }
        }
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            if(graph[node][i]==100000000l&&i!=node)
            {
                System.out.println("-1");
            }
            else if(i!=node)
            {
                System.out.println(graph[node][i]);
            }
        }
    }
}
