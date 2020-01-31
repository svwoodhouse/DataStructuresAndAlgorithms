package hashtableschallenge;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

     //   employees.forEach(e -> System.out.println(e));

        HashMap<Integer,Employee> hm = new HashMap<>();
      //  ListIterator<Employee> iterator = employees.listIterator();
        
        for(int i = 0; i < employees.size(); i++) {
           hm.putIfAbsent(employees.get(i).getId(), employees.get(i));
        }
        
        employees = new LinkedList<Employee>();
        for(Object value : hm.values()) {
            employees.add((Employee) value);
        }
        
        for(int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

//        int[] nums = new int[10];
//        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
//        for (int i = 0; i < numsToAdd.length; i++) {
//            nums[hash(numsToAdd[i])] = numsToAdd[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}    
