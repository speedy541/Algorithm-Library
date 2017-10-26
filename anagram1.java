
import java.util.HashMap;
import java.util.Map;
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
public class anagram1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
          String ss=s.next();
          String sss=s.next();
          char[] str1,str;
          if(sss.length()>ss.length())
          {
          str1=ss.toCharArray();
          str=sss.toCharArray();
          }
          else
          {
          str=ss.toCharArray();
          str1=sss.toCharArray();
              
          }
          
          HashMap<Character,Integer> map=new HashMap<>();
        
             for(int i=0;i<ss.length();i++)
             {
                 map.put(str[i],map.getOrDefault(str[i],0)+1);
                 
             }
             int count=0;
           
             for(int i=0;i<sss.length();i++)
             {
                 if(map.containsKey(str1[i]))
                 {
                     map.put(str1[i],map.get(str1[i])-1);
                 }
                 else
                 {
                     count++;
                 }
             }
             for(Map.Entry<Character,Integer> entry:map.entrySet())
             {
                 if(entry.getValue()>0)
                 {
                     count+=entry.getValue();
                 }
             }
             System.out.println(count);
         }
}

