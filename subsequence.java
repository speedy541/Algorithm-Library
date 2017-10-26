
import java.util.Scanner;

public class subsequence
{
    static void printcombination(int[] a,int[] data,int start,int end,int index,int r)
    {
        if(index==r)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(data[j]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=start;i<=end&&end-i+1>=r-index;i++)
        {
            data[index]=a[i];
            printcombination(a,data,i+1,end,index+1,r);
        }
    }
    static void combination(int[] a,int n,int r)
    {
        int[] data=new int[r];
        printcombination(a,data,0,n-1,0,r);
    }
    public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   int n1=s.nextInt();
   int r=s.nextInt();
   int[] a=new int[n1];
   for(int i=0;i<n1;i++)
   {
       a[i]=s.nextInt();
   }
   int n=a.length;
   combination(a,n,r);
}
}