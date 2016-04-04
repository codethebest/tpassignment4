package com.Assignment4.DesignPrinciples.ISPTests;

/**
 * Created by student on 2016/03/31.
 */
import Question3Principles.ISP.Obey.HPprinter;

import org.junit.Assert;
import org.junit.Test;

public class TestHPprinter {
    HPprinter printer = new HPprinter();
    @Test
    public void testPrint() throws Exception {
        Assert.assertFalse("Printing",printer.print().equals("Photocopy"));

    }

    @Test
    public void testPhotocopy() throws Exception {
        Assert.assertTrue(printer.photocopy().equalsIgnoreCase("PHOTOCOPY"));
    }
}
