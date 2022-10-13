package ru.laurent.homework.homework6.schoolTask;

public class School {
    private final String schoolName;
    private DirectorOfSchool directorOfSchool;

    private Student[] students = new Student[3];
    private Teacher[] teachers = new Teacher[3];

    public School(String schoolName, DirectorOfSchool directorOfSchool) {
        this.schoolName = schoolName;
        this.directorOfSchool = directorOfSchool;
    }
    public void schoolDay (){
        directorOfSchool.beginLessons();
        for (Teacher c: teachers) {
            if (c != null) {
                for (Student g: students) {
                    if (g != null) {
                        if (c.getSubject().equals(g.getSubject())) {
                            c.teach(g);
                        }
                    }
                }
            }
        }
        directorOfSchool.endLessons();
    }
    public void addTeacher(Teacher teacher) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
            }
        }
    }
    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
            }
        }
    }
}

