
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */
public class regex {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2=s.next();
        Pattern pattern=Pattern.compile(s2);
        Matcher matcher=pattern.matcher(s1);
        while(matcher.find())
        {
            System.out.println(matcher.start()+" "+matcher.end());
        }
    }
   
}
