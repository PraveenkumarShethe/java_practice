package com.praveen.shethe.collection.sortingexample.model;

import java.util.Comparator;

/**
 * Created by Praveenkumar on 7/15/2020.
 */
public class Student implements Comparable{

    private String name;
    private int rollNo;
    private int age;

    public Student(String name, int rollNo, int age){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int getStudentage() {
        return 0;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public static Comparator<Student> getStuNameComparator() {
        return StuNameComparator;
    }

    public static void setStuNameComparator(Comparator<Student> stuNameComparator) {
        StuNameComparator = stuNameComparator;
    }

    public static Comparator<Student> getStuRollno() {
        return StuRollno;
    }

    public static void setStuRollno(Comparator<Student> stuRollno) {
        StuRollno = stuRollno;
    }

    @Override
    public String toString() {
        return "[" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", age=" + age +
                ']';
    }

    @Override
    public int compareTo(Object object) {
        int age = ((Student)object).getAge();
        int studentAge = age-this.age;
        return studentAge;
    }

    public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {
            String StudentName1 = s1.getName().toUpperCase();
            String StudentName2 = s2.getName().toUpperCase();
            return StudentName1.compareTo(StudentName2);
        }};

    public static Comparator<Student> StuRollno = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {
            int rollno1 = s1.getRollNo();
            int rollno2 = s2.getRollNo();
            return rollno1-rollno2;
        }};
}
