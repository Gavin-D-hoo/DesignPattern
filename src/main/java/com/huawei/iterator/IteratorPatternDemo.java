package com.huawei.iterator;

import javax.swing.text.html.HTMLDocument;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        Student student1 = new Student("张三丰");
        Student student2 = new Student("马玉");
        Classroom classroom = new Classroom(2);
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        Iterator iterator = classroom.iterator();
        while (iterator.hasNext()) {
            Student next = (Student)iterator.next();
            System.out.println(next);
        }
    }

    public interface Iterator {
        public abstract boolean hasNext();
        public abstract Object next();
    }
    public interface Aggregate {
        public abstract Iterator iterator();
    }

    public static class Student{
        private String name;
        public Student (String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static class ClassroomIterator implements Iterator {
        private Classroom classroom;
        private int index;
        public ClassroomIterator(Classroom classroom) {
            this.classroom = classroom;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            if(index < classroom.getLength()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            Student student = classroom.getStudent(index);
            index++;
            return student;
        }
    }



    public static class Classroom implements Aggregate {
        private Student[] students;

        private int last=0;

        public Classroom(int size) {
            this.students = new Student[size];
        }
        public void addStudent(Student student) {
            this.students[last] = student;
            last++;
        }

        public Student getStudent(int index) {
            return students[index];
        }

        public int getLength() {
            return last;
        }
        @Override
        public Iterator iterator() {
            return new ClassroomIterator(this);
        }
    }
}
