package com.Assignment4.DesignPrinciples.LSPTests;

/**
 * Created by student on 2016/03/31.
 */

import Question3Principles.LSP.Obey.OrderCart;
import org.junit.Assert;
import org.junit.Test;

public class TestOrderCart {
    OrderCart order = new OrderCart();
    @Test
    public void testAddItem() throws Exception {
        order.addItem("shoes");
        order.addItem("bag");

        Assert.assertTrue(order.getItem(1).equals("bag"));
    }

    @Test
    public void testGetItem() throws Exception {
        order.addItem("shoes");
        order.addItem("bag");
        Assert.assertTrue(order.getItem(0).equals(order.getItem(0)));
    }
}
