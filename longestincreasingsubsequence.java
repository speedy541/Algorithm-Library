
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
public class longestincreasingsubsequence {
    static int longest(int[]a ,int n)
    {
        int max=0;
        int[] list=new int[n];
        for(int i=0;i<n;i++)
        {
            list[i]=1;
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[i]>a[j]&&list[i]<list[j]+1)
                {
                    list[i]=list[j]+1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(list[i]>max)
            {
                max=list[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println(longest(a,n));
    }
}
