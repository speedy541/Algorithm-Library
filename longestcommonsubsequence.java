
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
public class longestcommonsubsequence {
    static void longest(int[] x,int[] y)
    {
        int[][] l=new int[x.length+1][y.length+1];
        for(int r=1;r<x.length+1;r++)
        {
            for(int c=1;c<y.length+1;c++)
            {
                if(x[r-1]==y[c-1])
                {
                    l[r][c]=l[r-1][c-1]+1;
                }
                else
                {
                    l[r][c]=Math.max(l[r-1][c],l[r][c-1]);
                }
            }
        }
        int[] lcs=new int[l[x.length][y.length]];
        int r=x.length;
        int c=y.length;
        int i=l[r][c];
        while(r>0&&c>0)
        {
            if(x[r-1]==y[c-1])
            {
                lcs[i-1]=x[r-1];
                i--;
                r--;
                c--;
            }
            else if(l[r-1][c]>l[r][c-1])
            {
                r--;
            }
            else
            {
                c--;
            }
        }
        for(i=0;i<lcs.length;i++)
        {
            System.out.print(lcs[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int xx=s.nextInt();
        int yy=s.nextInt();
        int[] x=new int[xx];
        int[] y=new int[yy];
        for(int i=0;i<xx;i++)
        {
            x[i]=s.nextInt();
        }
        for(int i=0;i<yy;i++)
        {
            y[i]=s.nextInt();
        }
        longest(x,y);
    }
   
}
