import java.util.*;
public class warshall {
  public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int l=0;l<t;l++){
        int n=s.nextInt();
        int m=s.nextInt();
        long a[][]=new long [n+1][n+1];
      for (long[] row: a)
            Arrays.fill(row, 100000000l);
         for(int i=0;i<m;i++){
        	 int x=s.nextInt();
        	 int y=s.nextInt();
        	a[x][y]=a[y][x]=s.nextInt();
         }
         int node=s.nextInt();
        for(int k=1;k<=n;k++)
        {
        	for(int i=1;i<=n;i++)
                {
        		for(int j=1;j<=n;j++)
                        {
        			a[i][j]=Math.min(a[i][j],a[i][k]+a[k][j]);
                        }
                }
        }
         for(int i=1;i<=n;i++)
         {
        	if(a[node][i]==100000000l && i!=node)
                {
        		System.out.print("-1"+" ");
                }
        	else if(i!=node)
                {
                    System.out.print(a[node][i]+" ");
                }
         }
         System.out.println();}
  }
}