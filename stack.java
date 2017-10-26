
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */
public class stack {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<=5;i++)
        {
            int a=s.nextInt();
            if(a==1)
            {
                st.push(a);
            }
            else if(a==2)
            {
                st.pop();
                
            }
            else if(a==3)
            {
                System.out.println(st.peek());
            }
        }
    }
}
