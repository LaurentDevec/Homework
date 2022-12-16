package ru.laurent.homeworkLesson14.employee;


import java.util.*;

public class Employee {

    private String name;
    private String company;
    private int salary;
    private int age;

    public Employee (String name, String company, int age, int salary) {
        this.name = name;
        this.age = age;
        this.company = company;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // TODO: добавить конструктор, необходимы геттеры и сеттеры
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (salary != employee.salary) return false;
        if (age != employee.age) return false;
        if (!Objects.equals(name, employee.name)) return false;
        return Objects.equals(company, employee.company);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + salary;
        result = 31 * result + age;
        return result;
    }



    public static List<Employee> employeeGenerator(int num) {
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        ArrayList<Employee> employees = new ArrayList<>();

        System.out.println(employees.size());
        for (int i = 0; i < num; i++) {
            String randName = names[(int) (Math.random() * names.length)];
            String randCompany = companies[(int) (Math.random() * companies.length)];
            int randSalary = (int) ( 100_000 + Math.random() * 300_000);
            int randAge = (int) ( 21 + Math.random() * 39);
            employees.add(new Employee(randName, randCompany, randSalary, randAge));
        }

        return employees;
    }
}