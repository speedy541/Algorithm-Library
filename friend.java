
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
public class friend {
    static int pair(int n)
    {
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            if(i<=2)
            {
                dp[i]=i;
            }
            else
            {
                dp[i]=dp[i-1]+(i-1)*dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(pair(n));
    }
}
