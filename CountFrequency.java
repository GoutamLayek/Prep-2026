/*Write a Java program that:

    Takes a string

    Counts frequency of characters using HashMap

    Print the map   

*/

import java.util.Scanner;
import java.util.HashMap;

public class CountFrequency{

    public static void main(String args[]){

        System.out.println("Hello Goutam welcome back");
    

        Scanner obj = new Scanner(System.in);
        HashMap<Character, Integer>freq = new HashMap<>();

        System.out.print("Enter String : ");
        String str = obj.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Input : " + str);
        System.out.println(freq);

        obj.close();
    }

}