package com.xr.principle.pattern.iterator;

import com.xr.principle.pattern.prototype.Student;

public class Client {
    public static void main(String[] args) {
        StudentAggregate studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("张三"));
        studentAggregate.addStudent(new Student("李四"));
        StudentIterator<Student> studentIterator = studentAggregate.getStudentIterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }
    }
}
