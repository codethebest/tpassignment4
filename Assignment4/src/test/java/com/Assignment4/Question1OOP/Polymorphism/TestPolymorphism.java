package com.Assignment4.Question1OOP.Polymorphism;

import Question1OOP.Polymorphism.Person;
import Question1OOP.Polymorphism.Student;
import Question1OOP.Polymorphism.Worker;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/04/05.
 */
public class TestPolymorphism {
    Person person = new Student("liolo","moko",1452);
    Person person1 = new Worker("Leo","Mook",1523);

    @Test
    public void testpoly ()throws Exception
    {
        Assert.assertTrue(person.getSurname()=="moko");
    }

    @Test
    public void testpol2 ()throws Exception
    {
        Assert.assertTrue(person1.getName()=="Leo");
    }
}
