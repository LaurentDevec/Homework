package ru.laurent.homework.serializable;

import java.io.*;

public class BinHandler <T> {

    private File file;
    public BinHandler() {
        file = new File("homeworkSerializable.bin");
    }

    public void writeToFile(T object){
        try (FileOutputStream fileOutput = new FileOutputStream(file);
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
             )
        {
            objectOutput.writeObject(object);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }

    public T readFromFile(){
        Object result = null;
        try(FileInputStream fileInput = new FileInputStream(file);
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);
        )
        {
            result = objectInput.readObject();
        } catch (IOException e | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return
    }
}
