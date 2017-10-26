
import java.util.ArrayList;
import java.util.Collections;
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
public class arraylist {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList();
        for(int i=0;i<=5;i++)
        {
            a.add(s.nextInt());
        }
        Collections.sort(a);
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        a.set(0,10);
        System.out.println(a);
        System.out.println(a.contains(10));
        
    }
}
