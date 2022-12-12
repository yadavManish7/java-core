package day13;

import day11.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;


public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList intList = new ArrayList(); // we are not defining type of ArrayList to it stores objects by default
        intList.add(2);                     //AutoBoxing applied
        intList.add("Manish");

        Object test = 2 ;  // 2 will be cast to int class object

        Integer zeroPosition =(Integer) intList.get(0);  // get returns object

        ArrayList<String> list = new ArrayList(10);  //up to 10 data will not be copied , to optimize
        list.ensureCapacity(50);  // guess capacity no issues in the future , same as initialCapacity new ArrayList(10)
        //list.add(2);  //only string
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("F");
        String zeroIndex = list.get(0);     //Returns string only because Arraylist type is String

        System.out.println(list);
        list.add(4,"E");
        list.add(6,null);
        list.add(7,"J");
        System.out.println(list);


        ArrayList<String> copyList = new ArrayList<>(list); // creates new arraylist and put old arraylist into it
        System.out.println(copyList);

        copyList.add(6,"G");  // pushes remaining element
        System.out.println(copyList);
        copyList.set(7,"H");                 // this will update/replace
        System.out.println(copyList);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"A", LocalDate.now(),500f));
        employees.add(new Employee(2,"B", LocalDate.now(),5000f));
        employees.add(new Employee(3,"C", LocalDate.now(),50000f));
        employees.add(new Employee(4,"D", LocalDate.now(),50000f));
        employees.add(new Employee(3,"E", LocalDate.now(),50000f));
        employees.add(new Employee(3,"F", LocalDate.now(),50000f));

       boolean contains = employees.contains(new Employee(2,"Manish", LocalDate.now(),5000f));  //both has new so creates in new location , need to have equal method
        System.out.println("Contains custom class  = "+contains);  // true when hasCode and equal method is called because equal method compares with ID field

        // copyList.clear(); // removes all element inside a list

        boolean containsInList =list.contains("C");   //  to find data, works for java class no need to create equal method
        System.out.println("Contains =  "+ containsInList);

        int indexOfEmp=employees.indexOf(new Employee(3,"Man", LocalDate.now(),50000f)); // uses equal method
        System.out.println("Index of = " + indexOfEmp);  // returns first occurrence

        Employee removeByIndex = employees.remove(4);
        System.out.println("Remove by index = "+ removeByIndex);

        boolean isRemoved =  employees.remove(new Employee(3,"Man3", LocalDate.now(),50000f));
        System.out.println(" Removed by passing Object = "+ isRemoved); // looks for equal method in emp class

        //employees.removeAll()  to delete multiple emp by creating new list and passing the list to removeAll method

        System.out.println("List of Emp"+ employees);

        employees.removeIf(new Predicate<Employee>() {  // to remove emp with salary 5000 and name Man3
            @Override
            public boolean test(Employee employee) {
                return employee.getSalary()==50000 && employee.getName().equalsIgnoreCase("D");  // false will not delete
                //to delete multiple element with condition, when you don't have access to view in class
            }
        });
        System.out.println("Employee without salary 50000 and name D = "+ employees);

       // employees.clear();
        boolean isEmpty =employees.isEmpty();  // to see empty
        System.out.println("Is list empty = " + isEmpty);

        ArrayList<String> sortList = new ArrayList<>();
        sortList.add("B");
        sortList.add("A");
        sortList.add("D");
        sortList.add("C");

        System.out.println("without sorting = " + sortList);

        Collections.sort(sortList);  //Collection is a class, Works in PREDEFINE CLASS ONLY not CUSTOM class, only Ascending order
        System.out.println("After sorting = "+sortList);

       // Collections.sort(employees); // showing compile time error in GENERIC class

        sortList.sort(new Comparator<String>() {  // to compare Ascending order
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println("Ascending Order = " + sortList);

        sortList.sort(new Comparator<String>() {  // to compare descending order
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("Descending Order = "+sortList);

        ArrayList<Employee> employeesSort = new ArrayList<>();
        employeesSort.add(new Employee(3,"A", LocalDate.now(),500f));
        employeesSort.add(new Employee(2,"B", LocalDate.now(),5000f));
        employeesSort.add(new Employee(1,"C", LocalDate.now(),50000f));

        Collections.sort(employeesSort, new Comparator<Employee>() {  // need comparator for CUSTOM class
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o1.getId()).compareTo(o2.getId()); //CompareTO can be used to class only
            }
        });
        System.out.println("Emp sorted with id = "+ employeesSort);

    }
}
