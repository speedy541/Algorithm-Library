
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
public class longestsubsequence2 {
    static int ceilindex(int[] a,int l,int r,int key)
    {
        while(r-l>1)
        {
            int m=l+(r-l)/2;
            if(a[m]>=key)
            {
                r=m;
            }
            else
            {
                l=m;
            }
        }
        return r;
    }
    static int longest(int[] a,int n)
    {
        int len=1;
        int tailtable[]=new int[n];
        tailtable[0]=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]<tailtable[0])
            {
                tailtable[0]=a[i];
            }
            else if(a[i]>tailtable[len-1])
            {
                tailtable[len++]=a[i];
            }
            else
            {
                tailtable[ceilindex(tailtable,-1,len-1,a[i])]=a[i];
            }
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int n1=a.length;
        System.out.println(longest(a,n));
    }
}
