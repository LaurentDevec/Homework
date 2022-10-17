package ru.laurent.homework.homework6.task1;

public class Main {
    public static void main(String[] args) {
        GroupClimbers group1 = new GroupClimbers();
        GroupClimbers group2 = new GroupClimbers();
        GroupClimbers group3 = new GroupClimbers();

        // обращение к свойствам осуществляется через .
        author1.name = "Tom";
        author1.surname = "Crowed";

        System.out.println(author2.name); // null
        System.out.println(author2.surname); // null

        author2.name = "Mike";
        author2.surname = "Thompson";

        System.out.println(author2.name); // Mike
        System.out.println(author2.surname); // Thompson

        System.out.println(author1);

        // вызов метода осуществляется через .
        author1.printFullName(); // void
        String fullName = author2.getFullName();

        System.out.println(fullName);

        // три горы


        Mountain mountain1 = new Mountain();
        mountain1.setHighMount(22);
        System.out.println(book1.getPageCount());
        mountain1.setAuthor(author1);

        System.out.println(mountain1);



        Mountain mountain2 = new Mountain();
        mountain2.setHighMount(1300);
        System.out.println(mountain2.getPageCount());
        mountain2.setAuthor(author1);

        Mountain mountain3 = new Mountain();
        mountain3.setHighMount(670);
        System.out.println(mountain3.getPageCount());
        mountain3.setAuthor(author2);


        Shelf shelf = new Shelf(3); // [null, null, null]
        Shelf shelf2 = new Shelf(9);
        // [null, null, null, null, null, null, null, null, null]

        shelf.addBook(book1);
        shelf.addBook(book2);
        shelf.addBook(book3);
        shelf.addBook(book4);
    }
}
