package TreeMap;

import java.util.*;

public class CountWordofString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input paragrap");
        String paragrap = input.nextLine();
        TreeMap<String, Integer> list = cutString(paragrap);
        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            System.out.println(entry);
        }

    }

    public static TreeMap<String, Integer> cutString(String demoString) {
        String slice = "";
        TreeMap<String, Integer> list = new TreeMap<>();
        for (int i = 0; i < demoString.length(); i++) {
            if (demoString.charAt(i) != ' ' && i < demoString.length() - 1) {
                slice += demoString.charAt(i);
            } else if (i == demoString.length() - 1) {
                slice += demoString.charAt(i);
                if (!slice.equals(" ")) {
                    if (list.containsKey(slice)) {
                        list.replace(slice, searchValue(list, slice), searchValue(list, slice) + 1);
                    } else
                        list.put(slice, 1);
                }
            } else if (demoString.charAt(i) == ' ') {
                if (!slice.equals("")) {
                    if (list.containsKey(slice)) {
                        list.replace(slice, searchValue(list, slice), searchValue(list, slice) + 1);
                    } else
                        list.put(slice, 1);
                }
                slice = "";
            }
        }
        return list;
    }

    public static int searchValue(TreeMap<String, Integer> list, String key) {
        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            if (entry.getKey() == key) ;
            return entry.getValue();
        }
        return 0;
    }
}
