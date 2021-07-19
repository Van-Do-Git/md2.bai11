package Palindrome;

import sun.misc.Queue;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) throws InterruptedException {
        Queue<Character> palindrome = new Queue<>();
        String string;
        Scanner input = new Scanner(System.in);
        System.out.println("Input palindrome");
        string = input.nextLine();
        string = string.toLowerCase(Locale.ROOT);
        for (int i = string.length()-1; i>-1; i--) {
            palindrome.enqueue(string.charAt(i));
        }
        String newString = "";
        while (!palindrome.isEmpty()) {
            newString += palindrome.dequeue();
        }
        System.out.println(string);
        System.out.println(newString);
        System.out.println(newString.equals(string));
    }
}
