
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
public class samsubstring {
    static int answer(String ss)
    {
        int[] output=new int[ss.length()];
        output[0]=ss.charAt(0)-'0';
        int res=output[0];
        for(int i=1;i<ss.length();i++)
        {
            output[i]=(i+1)*(ss.charAt(i)-'0')+10*output[i-1];
            res+=output[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String ss=s.next();
        System.out.println(answer(ss));
    }
}
