package ru.laurent.homework.threadHomeTask;

public class ApplicationThread {
    public static void main(String[] args) {

        SomeThread thread01 = new SomeThread();
        thread01.setName("Этот поток добавляет строки в коллекцию");
        thread01.setPriority(1);

        SomeThread thread02 = new SomeThread();
        thread02.setName("Этот поток ybxtuj yt ");
        thread02.setPriority(2);



        TaskThread someTaskThread01 = new TaskThread();
        Thread thread03 = new Thread(someTaskThread01);
        thread03.start();



    }
}
