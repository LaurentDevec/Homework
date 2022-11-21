package ru.laurent.homework.threadHomeTask;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SomeThread extends Thread{

    public CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();
    public synchronized void addStringData (String someData) {
        strings.add(someData);
    }

    public void FirstThread() {
        System.out.println(this.getName());
    }

    @Override
    public void run() {
        System.out.println(this.getName());
        System.out.println(Thread.currentThread().getName());
    }






    /*Thread thread01 = new Thread(() -> {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Поток thread01 получил данные");
        strings.add;
    });




    Thread thread02 = new Thread(() -> {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Поток thread02 получил данные");
        integers.add(3000);
    });
    Thread thread03 = new Thread(() -> {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные");
        int userNum = scanner.nextInt();
        System.out.println("Поток thread03 получил данные");
        integers.add(userNum);
    });

        thread01.start();
        thread02.start();
        thread03.start();

    // основной поток должен ждать завершения других потоков
        try {
        thread01.join();
        thread02.join();
        thread03.join(10000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

        System.out.println("main " + integers); */

}
