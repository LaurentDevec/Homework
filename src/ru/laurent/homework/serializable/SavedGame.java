package ru.laurent.homework.serializable;

import ru.laurent.homework.serializable.base.BattleUnit;
import ru.laurent.homework.serializable.units.Infantry;
import ru.laurent.homework.serializable.units.King;
import ru.laurent.homework.serializable.units.Knight;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SavedGame implements Serializable {
    private static final long serialVersionUID = 1L;

    private BattleUnit[] battleUnits;
    private King king;
    private Infantry infantry;
    private Knight knight;



    SavedGame savedGame = new SavedGame(battleUnits[], king);

    //создаем 2 потока для сериализации объекта и сохранения его в файл
    FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Username\\Desktop\\save.ser");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

    // сохраняем игру в файл
       objectOutputStream.writeObject(savedGame);

    //закрываем поток и освобождаем ресурсы
       objectOutputStream.close();
}
