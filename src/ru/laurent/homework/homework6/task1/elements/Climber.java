package ru.laurent.homework.homework6.task1.elements;

public class Climber{

    public String name;
    public String address;



     public void setName(String name) {
        if (name == null || name.trim().length() < 3) throw new IllegalArgumentException("Длинна имени должа быть более 3 символов");
        this.name = name;
    }


    public void setAddress(String address) {
        if (address == null || address.trim().length() < 4) throw new IllegalArgumentException("Адрес долже содержать более 4 символов");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}