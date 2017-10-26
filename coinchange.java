
import java.util.Scanner;

public class coinchange
{
    static int coin(int[] a,int n,int w)
    {
        int[][] solution=new int[a.length+1][w+1];
        for(int i=1;i<=w;i++)
        {
            solution[0][i]=0;
        }
        for(int i=0;i<a.length+1;i++)
        {
            solution[i][0]=1;
        }
        for(int i=1;i<a.length;i++)
        {
            for(int j=1;j<=w;j++)
            {
                if(a[i]>j)
                {
                    solution[i][j]=solution[i-1][j];
                }
                else
                {
                    solution[i][j]=solution[i-1][j]+solution[i][j-a[i]];
                }
            }
        }
        return solution[a.length-1][w];
    }
    public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   int w=s.nextInt(0);
   int n=s.nextInt();
   int[] a=new int[n];
   for(int i=0;i<n;i++)
   {
       a[i]=s.nextInt();
   }
   System.out.println(coin(a,n,w));
}
}