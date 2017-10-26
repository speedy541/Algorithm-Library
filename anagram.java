
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
public class anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
int t = in.nextInt();
while(t-- > 0) {
	String s = in.next();
       
    	char[] str = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length() / 2; i++)
        	map.put(str[i], map.getOrDefault(str[i], 0) + 1);
       
        for(int i = s.length() / 2; i < s.length(); i++)
            if(map.containsKey(str[i]))
            	map.put(str[i], map.get(str[i]) - 1);
        int count = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet())
        	if(entry.getValue() > 0)
            	count += entry.getValue();
         System.out.println(count);
        
	}

    }
}
