package com.huawei.iterator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NonPattern {
    private static class Student{
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
    /*private static class Classroom{
        private Student[] students;

        public Student[] getStudents() {
            return students;
        }

        public void setStudents(Student[] students) {
            this.students = students;
        }

        @Override
        public String toString() {
            return "Classroom{" +
                    "students=" + Arrays.toString(students) +
                    '}';
        }
    }*/
    private static class Classroom{
        private Map<String, Student> students;
        public void setStudents(Map<String, Student> students) {
            this.students = students;
        }

        public Map<String, Student> getStudents() {
            return students;
        }

        @Override
        public String toString() {
            return "Classroom{" +
                    "students=" + students +
                    '}';
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student("刘梦雅");
        Student student2 = new Student("李宗霖");
        /*Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;
        Classroom classroom = new Classroom();
        classroom.setStudents(students);

        Student[] studentList = classroom.getStudents();
        Arrays.stream(studentList).forEach(System.out::println);*/
        Classroom classroom = new Classroom();
        Map<String, Student> map = new HashMap<>();
        map.put(student1.getName(),student1);
        map.put(student2.getName(),student2);
        classroom.setStudents(map);
        Map<String, Student> students = classroom.getStudents();
        students.entrySet().stream().forEach(System.out::println);
    }
}



