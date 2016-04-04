package Question2;

import Question1OOP.Polymorphism.*;

/**
 * Created by student on 2016/04/05.
 */
public class Student {

        private String studentName;
        private Person student;

    public Student()
    {

    }
    public Student( String name ,Person person)
    {
        this.studentName = name;
        student =person;
    }

    public Person getStudent() {
        return student;
    }

    public void setStudent(Person student) {
        this.student = student;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
