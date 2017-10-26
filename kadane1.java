
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
public class kadane1 {
    static int[] kadane(int[] a)
    {
        int result[]=new int[]{Integer.MIN_VALUE,0,-1};
        int current=0;
        int local=0;
        for(int i=0;i<a.length;i++)
        {
            current+=a[i];
            if(current<0)
            {
                current=0;
                local=i+1;
            }
            else if(current>result[0])
            {
                result[0]=current;
                result[1]=local;
                result[2]=i;
            }
        }
        return result;
    
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=s.nextInt();
        int[][] a=new int[n][n1];
     int cols=a[0].length;
     int rows=a.length;
     int left=0;
     int right=0;
     int top=0;
     int bottom=0;
     int[] current;
     int maxsum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n1;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        
        for(int l=0;l<cols;l++)
        {
      int[] temp=new int[rows];
           
            for(int r=l;r<cols;r++)
            {
            for(int i=0;i<rows;i++)
            {
                temp[i]+=a[i][r];
            }
           current=kadane(temp);
          
           if(current[0]>maxsum)
           {
               maxsum=current[0];
               left=l;
               right=r;
               top=current[1];
               bottom=current[2];
           }
            }
        }
        System.out.println(maxsum);
        System.out.println(top+" "+left);
        System.out.println(right+" "+bottom);
    }
}
