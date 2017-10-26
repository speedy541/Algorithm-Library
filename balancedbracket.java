
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
public class balancedbracket {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int p=-1;
        int c=0;
        while(t>0)
        {
         c=0;
            p=-1;
            String ss=s.next();
        char[] a=new char[ss.length()];
        for(int i=0;i<ss.length();i++)
        {
            if(ss.charAt(i)=='{'||ss.charAt(i)=='('||ss.charAt(i)=='[')
            {
                p++;
                a[p]=ss.charAt(i);
            }
            else
            {
                if(p!=-1)
                {
                if(ss.charAt(i)=='}')
                {
                    if('{'==a[p])
                    {
                        p--;
                    }
                    else
                    {
                c++;        break;
                    }
                }
               else if(ss.charAt(i)==']')
                {
                    
                    if('['==a[p])
                    {
                   p--;
                    }
                    else
                    {
                    c++;
                    break;
                    }
                }
               else if(ss.charAt(i)==')')
                {
                    if('('==a[p])
                    {
             p--;
                    }
                    else
                    {
                c++;      break;
                    }
                }
                }
                else
                {
             c++;  break;
                }
            }
           
        }
         if(c==1||p>-1)
        {
            System.out.println("NO");
        }
         else if(p==-1)
         {
             System.out.println("YES");
         }
        t--;
        }
       
        }
}
