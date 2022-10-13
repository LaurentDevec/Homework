package ru.laurent.homework.homework6.schoolTask;

public class Teacher extends Human implements CanTeach {
        private String subject;

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        @Override
        public void teach(CanLearn child) {
            child.learn();
        }

        @Override
        public void setAge(int age) {
            if (age > 25) {
                this.age = age;
         }
    }
}
