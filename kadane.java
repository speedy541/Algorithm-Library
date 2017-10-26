
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */
public class kadane {
    static int sum(int[] a)
    {
        int current=a[0];
        int global=a[0];
        for(int i=1;i<a.length;i++)
        {
            current=Math.max(a[i],a[i]+current);
            if(current>global)
            {
                global=current;
            }
        }
        return global;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println(sum(a));
    }
}
