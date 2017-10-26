
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
public class balancedbracket1 {
    static String answer(Scanner s)
    {
         String s1=s.next();
            Stack<Character> stack=new Stack();
            String ans="";
            for(int i=0;i<s1.length();i++)
            {
              switch(s1.charAt(i))
              {
                  case '{':
                  case '[':
                  case '(':
                    stack.push(s1.charAt(i));
                  break;
                  case '}': 
                       if(stack.isEmpty()||stack.peek()!='{')
                       {
                          return "NO";
                          
                       }
                      
                       stack.pop();
                       break;
                       case ']': 
                       if(stack.isEmpty()||stack.peek()!='[')
                       {
                          return "NO";
                          
                       }
                       stack.pop();
                       break;
                       case ')': 
                       if(stack.isEmpty()||stack.peek()!='(')
                       {
                         return "NO";
                          
                       }
                       stack.pop();
                       break;
                }
            }
        //   System.out.println(stack);
            if(stack.isEmpty())
            {
                return "YES";
            }
            else
                    {
                        return "NO";
                    }
           
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t!=0)
        {
           System.out.println( answer(s));
            t--;
        }
    }
    }

