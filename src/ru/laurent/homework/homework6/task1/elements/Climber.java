package ru.laurent.homework.homework6.task1.elements;

public class Climber{

    public String name;
    public String surname;


    public void printFullName(){

        System.out.println(name + " " + surname);
    }

    public String getFullName(){
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return "Climber{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}