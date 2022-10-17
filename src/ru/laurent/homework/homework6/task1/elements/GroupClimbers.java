package ru.laurent.homework.homework6.task1.elements;

import java.util.Arrays;

public class GroupClimbers {

    private String nameMount = "Эверест";
    private Climber[] climbers; // массив альпинистов

    public GroupClimbers(int climbersCount){
        if (climbersCount <= 0) {
            throw new IllegalArgumentException("Количество альпинистов дб положительным");
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
        System.out.println("Альпинисту " + climbers.getAuthor().getFullName() + " не хватило места в группе ");
    }


    @Override
    public String toString() {
        return "Group" +
                "nameOfMountain='" + color + '\'' +
                ", climbers=" + Arrays.toString(climbers) +
                '}';

    }

}
}
