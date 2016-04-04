package com.Assignment4.Question1OOP.InherintanceAndEncapsulation;

import Question1OOP.InherintanceAndEncapsulation.Student;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/04/05.
 */
public class TestInherintance {
    Student student = new Student("Liyolo","Moko",123);

    @Test
    public void test() throws Exception
    {
        Assert.assertTrue(student.getSurname()=="Moko");
    }
}
