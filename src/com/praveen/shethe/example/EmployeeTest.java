package com.praveen.shethe.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Praveenkumar on 7/27/2021.
 */
public class EmployeeTest {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(new Employee("Amrutha", "Gooha", 22));
        list.add(new Employee("Jasmi", "Umesh", 22));
        list.add(new Employee("Hanamun", "Errappa", 22));
        list.add(new Employee("Kari", "Niru", 22));
        list.add(new Employee("Mani", "Faran", 22));
        list.add(new Employee("Kiran", "Sanga", 22));

        System.out.println(list.stream().sorted(new EmpNameCompare()).sorted(new EmplastNameCompare()).sorted(new EmpAgeCompare()));

    }
}

class EmpNameCompare implements Comparator<Employee> {

    @Override
    public int compare(Employee employee, Employee employee1) {
        return employee.getName().compareTo(employee1.getName());
    }
}

class EmplastNameCompare implements Comparator<Employee>{

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getLastName().compareTo(employee2.getLastName());
    }
}

class EmpAgeCompare implements Comparator<Employee>{

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return (employee1.getAge()-employee2.getAge());
    }
}
