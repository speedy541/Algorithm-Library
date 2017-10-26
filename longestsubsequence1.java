import java.io.*;
import java.util.*;
import java.lang.Math;
 
class LIS
{
    static int CeilIndex(int A[], int l, int r, int key)
    {
        while (r - l > 1)
        {
            int m = l + (r - l)/2;
            if (A[m]>=key)
                r = m;
            else
                l = m;
        }
 
        return r;
    }
 
    static int LongestIncreasingSubsequenceLength(int A[], int size)
    {
 
        int[] tailTable   = new int[size];
        int len;
        tailTable[0] = A[0];
        len = 1;
        for (int i = 1; i < size; i++)
        {
            if (A[i] < tailTable[0])
                tailTable[0] = A[i];
 
            else if (A[i] > tailTable[len-1])
                tailTable[len++] = A[i];
 
     
            else
                tailTable[CeilIndex(tailTable, -1, len-1, A[i])] = A[i];
        }
 
        return len;
    }
  public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
   
        int n1 = a.length;
        System.out.println(
                            LongestIncreasingSubsequenceLength(a, n1));
    }
}
