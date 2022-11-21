package ru.laurent.homeworkLesson14.message;

import ru.laurent.homeworkLesson14.message.Message;
import ru.laurent.homeworkLesson14.message.MessagePriority;

import java.util.*;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        /*ArrayList<String> message01 = new ArrayList<String>();
        for (Message message : messageList) {
            if (iterator.next().getPriority() == priority) {
                messageList.remove(messageList);
            }


            List<Message> message01 = new Message<>(); // список из массива
            System.out.println(messageList.get(MessagePriority.HIGH));


            System.out.println(messageList.size());
            // TODO:  Подсчитать количество сообщений для каждого приоритета
            //  Ответ в консоль

        }

        public static void countEachCode (List < Message > messageList) { */
            // TODO: Подсчитать количество сообщений для каждого кода сообщения
            //  Ответ в консоль
        }

        public static void uniqueMessageCount (List < Message > messageList) {
            // TODO: Подсчитать количество уникальных сообщений
            //  Ответ в консоль
            TreeSet<Message> uniqueMes = new TreeSet<>();
            System.out.println("Количество уникальных сообщений составляет: " + uniqueMes.size());
        }

        public static List<Message> uniqueMessagesInOriginalOrder (List < Message > messageList) {
            // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
            //  в котором они встретились в первоначальном списке
            //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
            //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
            return null;
        }

        public static void removeEach (List < Message > messageList, MessagePriority priority){
            // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
            //  вывод в консоль до удаления и после удаления
            System.out.println("коллекция до удаления  " + messageList);
            Iterator<Message> iterator = messageList.iterator();
            while (iterator.hasNext()) {
                // iterator.next() - ссылка на элемент коллекции
                if (iterator.next().getPriority() == priority) {
                    messageList.remove(messageList); // удаление
                }
                System.out.println("коллекция после удаления по заданному приоритету: " + messageList);
            }
        }

        public static void removeOther (List < Message > messageList, MessagePriority priority){
            // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
            //  вывод в консоль до удаления и после удаления
            System.out.println("коллекция до удаления  " + messageList);
        /*Scanner scanner = new Scanner(System.in);  // попытка реализовать ввод
        System.out.println("Введите приоритет оставляемых сообщений: LOW, MEDIUM, HIGH, URGENT;  ");
        int mp = scanner.nextInt(); */
            System.out.println(priority);
            Iterator<Message> iterator = messageList.iterator();
            while (iterator.hasNext()) {
                // iterator.next() - ссылка на элемент коллекции
                if (iterator.next().getPriority() != priority) {
                    messageList.remove(messageList);// удаление
                }
                System.out.println("коллекция после удаления по заданному приоритету: " + messageList);
            }
        }

        public static void main (String[]args){
            List<Message> messages = Message.generate(34);
            System.out.println(messages);
            MessageTask.uniqueMessageCount(messages);
            MessageTask.removeEach(messages, MessagePriority.MEDIUM);
            MessageTask.removeOther(messages, MessagePriority.MEDIUM);


    }
}