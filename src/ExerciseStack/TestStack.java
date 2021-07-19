package ExerciseStack;


import java.util.Arrays;
import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        int[] demo = new int[]{1, 2, 3, 4, 5, 6};
        Stack<Integer> demo1 = new Stack<>();
        for (int i = 0; i < demo.length; i++) {
            demo1.push(demo[i]);
        }
        for (int i = 0; i < demo.length; i++) {
            demo[i] = demo1.pop();
            System.out.printf("%d\t", demo[i]);
        }

        String demoString = "abc  def  ghi kml   ";
        Stack<String> newDemo = cutString(demoString);
        System.out.println("\nSize :" + newDemo.size() + "\n");
        int timeLoop = newDemo.size();
        for (int i = 0; i < timeLoop; i++) {
            System.out.println(newDemo.pop());
        }
    }

    public static Stack<String> cutString(String demoString) {
        String slice = "";
        Stack<String> newDemo = new Stack<>();
        for (int i = 0; i < demoString.length(); i++) {
            if (demoString.charAt(i) != ' ' && i < demoString.length() - 1) {
                slice += demoString.charAt(i);
            } else if (i == demoString.length() - 1) {
                slice += demoString.charAt(i);
                if (!slice.equals(" ")) {
                    System.out.print("\n" + slice);
                    newDemo.push(slice);
                }
            } else if (demoString.charAt(i) == ' ') {
                if (!slice.equals("")) {
                    System.out.print("\n" + slice);
                    newDemo.push(slice);
                }
                slice = "";
            }
        }
        return newDemo;
    }
}
