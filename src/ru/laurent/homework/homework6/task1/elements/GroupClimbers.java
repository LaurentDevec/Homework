package ru.laurent.homework.homework6.task1.elements;

import java.util.Arrays;

public class GroupClimbers {
    private String color = "белый";
    private Climber[] climbers; // массив альпинистов

    public Climber(int climbersCount){
        if (climbersCount <= 0) {
            throw new IllegalArgumentException("booksCount дб положительным");
        }
        climbers = new Climber[climbersCount];
    }


    public void addClimber(Climber climbers){ // добавление альпиниста в группу
        for (int i = 0; i < climbers.length; i += 1) { // перебираем массив книг на полке
            if (climbers[i] == null) { // если элемент равен null,
                climbers[i] = climbers; // значит в массив можно передать ссылку на книгу
                return; // и прервать метод, чтобы ссылка не заполнила весь массив
            }
        }
        System.out.println("Книге автора " + climbers.getAuthor().getFullName() + " не хватило места в группе ");
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "color='" + color + '\'' +
                ", books=" + Arrays.toString(climbers) +
                '}';

    }

}
}
