package ru.laurent.homeworkLesson14.employee;


import java.util.*;

public class Employee implements Comparable<Employee>{

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


    // TODO: дописать реализацию метода для создания списка из объектов класса Employee.
    //  Объекты Employee создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп.
    //  num - количество объектов в списке
    public static List<Employee> employeeGenerator(int num) {
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        ArrayList<Employee> employees = new ArrayList<>();

        System.out.println(employees.size());
        ArrayList<Employee> salaries = new ArrayList<Employee>();
        random = getRandom(100, 100);
        for (int i = 0; i < random.size(); i++)
            System.out.println(random.get(i));

       // employees.add(employee1);
        // employees.add(employee2);

        // создание объектов, наполнение списка

        return employees;
    }

 // реализация рандома для заполнения salary
    public static List<Salary> generate(int num){
        if (num <= 0) {
            return Collections.emptyList();
        }

        Random random = new Random();
        List<Salary> messages = new ArrayList<>(num);

//        values() - вернет массив констант
        int typesCount = MessagePriority.values().length;

        for (int i = 0; i < num; i++){
            messages.add(new Message(random.nextInt(10), MessagePriority.getPriority(random.nextInt(typesCount))));
        }

}*/

    private static ArrayList<Integer> getRandom(int range, int size) {
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        for (int i = 0; i < size; i++)
            randomNumbers.set(i, new Random().nextInt(range)+1);
        return randomNumbers;
    }

    @Override
    public int compareTo(Employee employee) {
        if (this.getAge() < employee.getAge()) return -1;
        if (this.getAge() > employee.getAge()) return 1;
        return 0;
    }
}