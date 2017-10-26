
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
public class stringbuilder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        StringBuilder ss=new StringBuilder(s.next());
        ss.append(ss);
        ss.delete(0,3);
        ss.deleteCharAt(0);
       
               System.out.println(ss);
    }
}
