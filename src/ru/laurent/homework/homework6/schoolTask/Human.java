package ru.laurent.homework.homework6.schoolTask;

public class Human {
    protected String name = "Human";
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 5) this.age = age;
    }
}

