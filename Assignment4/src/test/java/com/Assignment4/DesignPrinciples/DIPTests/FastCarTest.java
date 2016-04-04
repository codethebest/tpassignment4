package com.Assignment4.DesignPrinciples.DIPTests;

import Question3Principles.DIP.Obey.CarInterface;
import Question3Principles.DIP.Obey.FastCar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/01.
 */
public class FastCarTest {
    private CarInterface car;

    @Before
    public void setUp() throws Exception {
        car = new FastCar();
    }

    @Test
    public void testIgnition() throws Exception {
        Assert.assertEquals("engine start", car.ignition());
    }

    @Test
    public void testDrive() throws Exception {
        Assert.assertEquals("drives faster", car.drive());
    }
}
