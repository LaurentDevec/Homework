package ru.laurent.homework.homework6.schoolTask;

public class Main {
           public static void main(String[] args) {
            Teacher teacher = new Teacher();
            teacher.setAge(30);
            teacher.setSubject("Math");

            Student student = new Student();
            student.setAge(7);
            student.setSubject("Math");

            Student student1 = new Student();
            student1.setAge(8);
            student1.setSubject("Math");

            DirectorOfSchool directorOfSchool = new DirectorOfSchool();
            directorOfSchool.setAge(40);

            School schoolName = new School("School", directorOfSchool);
            schoolName.addStudent(student);
            schoolName.addStudent(student1);
            schoolName.addTeacher(teacher);

            schoolName.schoolDay();

    }
}
