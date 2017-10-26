
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
public class maketwostringanagaram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] pos1=new int[26];
        int[] pos2=new int[26];
        String s1=s.next();
        String s2=s.next();
        
        for(int i=0;i<s1.length();i++)
        {
            int j=(int)s1.charAt(i)-(int)'a';
            pos1[j]+=1;
        }
        for(int i=0;i<s2.length();i++)
        {
            int j=(int)s2.charAt(i)-(int)'a';
            pos2[j]+=1;
        }
        int count=0;
        
        for(int i=0;i<26;i++)
        {
            count+=Math.abs(pos1[i]-pos2[i]);
        }
        System.out.println(count);
    }
   
}
