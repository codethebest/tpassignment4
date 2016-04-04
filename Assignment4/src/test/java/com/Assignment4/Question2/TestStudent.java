package com.Assignment4.Question2;

import Question2.Person;
import Question2.Student;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/04/05.
 */
public class TestStudent {
    Person person = new Person("liyolo","45 drive",54);
    Student student = new Student ("liyolo",person);

    @Test
    public void test1 ()throws Exception
    {
        Assert.assertTrue(student.getStudent().getName()=="liyolo");
    }

    @Test
    public void test2 ()throws Exception
    {
        Assert.assertTrue(student.getStudent().getAddress()=="45 drive");
    }
}
