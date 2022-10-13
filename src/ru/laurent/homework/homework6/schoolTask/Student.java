package ru.laurent.homework.homework6.schoolTask;

public class Student extends Human implements CanLearn {
        private String subject;
        private int level;

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        @Override
        public void learn() {
            level += 2;
        }
    }

