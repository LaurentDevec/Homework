package ru.laurent.homeworkLesson14.employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeTask {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.employeeGenerator(50);
       // employeeList.sort(Comparator.comparing(salary::getName));

        // Collections.reverse(salary);

        // salary.forEach(System.out::println);

        // TODO 1: отсортировать список по имени


        List<Employee> employeeList = new ArrayList<Employee>();
        Collections.sort(employeeList, new Comparator<Employee>() {
            public int compare(ObjectName o1, ObjectName o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        // TODO 2: отсортировать список по имени и зп
        // TODO 3: отсортировать список по имени, зарплате, возрасту и компании

    }
}
