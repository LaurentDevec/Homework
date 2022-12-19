package ru.laurent.homework.homework6.task1.elements;

import java.util.Arrays;

public class GroupClimbers {

    private String nameMount;
    private Climber[] climbers; // массив альпинистов
    private Mountain mountain;

    public GroupClimbers(int climbersCount, String nameMount){
        if (climbersCount <= 0) {
            throw new IllegalArgumentException("Количество альпинистов дб положительным");
        }
        climbers = new Climber[climbersCount];
        this.nameMount = nameMount;
    }


    public void addClimber(Climber climber){ // добавление альпиниста в группу
        for (int i = 0; i < climbers.length; i += 1) { // перебираем массив книг на полке
            if (climbers[i] == null) { // если элемент равен null,
                climbers[i] = climber; // значит в массив можно передать ссылку на книгу
                return; // и прервать метод, чтобы ссылка не заполнила весь массив
            }
        }
        System.out.println("Альпинисту " + mountain.getClimber() + " не хватило места в группе ");
    }


    @Override
    public String toString() {
        return "Group" +
                "nameOfMountain='" + nameMount + '\'' +
                ", climbers=" + Arrays.toString(climbers) +
                '}';

    }

}

