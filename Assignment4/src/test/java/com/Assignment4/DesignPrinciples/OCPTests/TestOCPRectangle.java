package com.Assignment4.DesignPrinciples.OCPTests;

/**
 * Created by student on 2016/04/01.
 */
import Question3Principles.OCP.Obey.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class TestOCPRectangle {
    Rectangle rec = new Rectangle(1.6,2);
    @Test
    public void testCalculateArea() throws Exception {
        Assert.assertTrue(rec.calculateArea()==3.2);
    }
}
