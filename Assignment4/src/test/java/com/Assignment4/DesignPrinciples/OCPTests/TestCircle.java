package com.Assignment4.DesignPrinciples.OCPTests;

/**
 * Created by student on 2016/04/01.
 */
import Question3Principles.OCP.Obey.Circle;
import org.junit.Assert;
import org.junit.Test;

public class TestCircle {
    Circle c = new Circle(2.6);
    @Test
    public void testGetRadius() throws Exception {
            Assert.assertEquals(2.6,c.getRadius(),2.7);
    }

    @Test
    public void testCalculateArea() throws Exception {
            Assert.assertTrue(c.getRadius()*c.getRadius()* Math.PI==c.calculateArea());
    }
}
