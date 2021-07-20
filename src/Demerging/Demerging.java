package Demerging;

import java.time.LocalDate;
import java.util.*;

public class Demerging {
    public static void main(String[] args) {
        Employee ep1 = new Employee("Van", true, LocalDate.of(2012, 01, 01));
        Employee ep2 = new Employee("Cuong", false, LocalDate.of(2013, 01, 01));
        Employee ep3 = new Employee("HuyNam", true, LocalDate.of(2015, 01, 01));
        Employee ep4 = new Employee("HoaiNam", false, LocalDate.of(2017, 01, 01));
        Employee ep5 = new Employee("Hanh", true, LocalDate.of(2018, 01, 01));
        Employee ep6 = new Employee("Dai", true, LocalDate.of(2016, 01, 01));
        Employee ep7 = new Employee("Binh", false, LocalDate.of(2019, 01, 01));
        Employee ep8 = new Employee("Than", false, LocalDate.of(2010, 01, 01));
        List<Employee> list = new ArrayList<>();
        Employee[] arr = {ep1, ep2, ep3, ep4, ep5, ep6, ep7, ep8};
        Arrays.sort(arr);
        list.addAll(Arrays.asList(arr));
        showAll(list);
        showAll(sortEmployee(list));
    }

    public static List<Employee> sortEmployee(List<Employee> _list) {
        List<Employee> newList = new ArrayList<>();
        Queue<Employee> nam = new PriorityQueue<>();
        Queue<Employee> nu = new PriorityQueue<>();
        for (int i = 0; i < _list.size(); i++) {
            if (_list.get(i).sex)
                nam.add(_list.get(i));
            else
                nu.add(_list.get(i));
        }
        while (!nam.isEmpty()) {
            newList.add(nam.poll());
        }
        while (!nu.isEmpty()) {
            newList.add(nu.poll());
        }
        return newList;
    }

    public static void showAll(List<Employee> _list) {
        for (int i = 0; i < _list.size(); i++) {
            System.out.println(_list.get(i).toString());
        }
    }
}

class Employee implements Comparable<Employee> {
    String name;
    boolean sex;
    LocalDate born;

    public Employee(String name, boolean sex, LocalDate born) {
        this.name = name;
        this.sex = sex;
        this.born = born;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.born.compareTo(employee.born);
    }

    public String toString() {
        return " Name: " + name + " sex: " + sex + " born: " + born;
    }
}