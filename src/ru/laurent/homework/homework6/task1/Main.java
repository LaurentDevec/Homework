package ru.laurent.homework.homework6.task1;

import ru.laurent.homework.homework6.task1.elements.Climber;
import ru.laurent.homework.homework6.task1.elements.GroupClimbers;
import ru.laurent.homework.homework6.task1.elements.Mountain;

public class Main {
 private Climber climber;

 public static void main(String[] args) {
      /*  GroupClimbers group1 = new GroupClimbers();
        GroupClimbers group2 = new GroupClimbers();
        GroupClimbers group3 = new GroupClimbers();

        // обращение к свойствам осуществляется через .
       climber1.name = "Tom";
        author1.surname = "Crowed"; */


   Mountain mount1 = new Mountain(5033, "Cazbek", "Russia");
   Mountain mount2 = new Mountain(4810 , "Mont Blanc", "France");
   Mountain mount3 = new Mountain(5034, "Foraker", "USA");

   Climber ivan = new Climber("Иван", "Россия");
   Climber petr = new Climber("Петр", "Россия");
   Climber sergey = new Climber("Сергей", "Россия");
   Climber alex = new Climber("Alex", "Бразилия");
   Climber leo = new Climber("Alex", "Аргентина");
   Climber frank = new Climber("Frank", "Мексика");
   Climber steven = new Climber("Steven", "Великобритания");

   GroupClimbers groupEverest = new GroupClimbers(mount1);
   GroupClimbers groupElbrus = new GroupClimbers(mount1);
   GroupClimbers groupKilimanjaro = new GroupClimbers(kilimanjaro);

   groupEverest.addAplinist(steven);
   groupEverest.addAplinist(leo);
   groupEverest.addAplinist(frank);
   groupEverest.addAplinist(alex); // проверяем, что набор закрыт

   groupElbrus.addAplinist(ivan);
   groupElbrus.addAplinist(petr);
   groupElbrus.printGroupInformation(); // набор открыт

   groupKilimanjaro.addAplinist(alex);
   groupKilimanjaro.addAplinist(sergey);
   groupKilimanjaro.printGroupInformation(); // набор открыт



  }
 }
