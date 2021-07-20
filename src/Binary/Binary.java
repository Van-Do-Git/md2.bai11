package Binary;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input n");
        int n = input.nextInt();
        System.out.println(binary(n));
    }

    public static String binary(int n) {
        Stack<Integer> binary = new Stack<>();
        while (n != 0) {
            binary.push(mod(n));
            n = (int) Math.round(n / 2);
        }
        return convertToString(binary);
    }

    public static int mod(int n) {
        return n % 2;
    }

    public static String convertToString(Stack<Integer> list) {
        String string = "";
        while (list.size() != 0) {
            string += list.pop();
        }
        return string;
    }
}
