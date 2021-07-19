package TestDauNgoac;

import sun.misc.Queue;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class testDauNgoac {
    public static void main(String[] args) {
        Stack<Character> expresstion = new Stack<>();
        String string;
        Scanner input = new Scanner(System.in);
        System.out.println("Input expresstion");
        string = input.nextLine();
        String test = "";
        for (int i = 0; i < string.length(); i++) {
            char chari =string.charAt(i);
            if(chari=='('){
                expresstion.push(chari);
            }else if(chari==')'){
                if (expresstion.size()==0){
                    expresstion.push(chari);
                    break;
                }else {
                    expresstion.pop();
                }
            }

        }
        if (expresstion.size()==0){
            System.out.println("Hop le");
        }else {
            System.out.println("Khong hop le");
        }

    }
}
