package com.Assignment4.DesignPrinciples.LSPTests;

/**
 * Created by student on 2016/03/31.
 */
import Question3Principles.LSP.Obey.SortedOrderCart;
import org.junit.Assert;
import org.junit.Test;

public class TestSortedOrderCart {
    SortedOrderCart cart = new SortedOrderCart();

    @Test
    public void testAddItem() throws Exception {
        cart.addItem("flower");
        cart.addItem("bag");

        Assert.assertTrue(cart.getItem(1).equals("flower"));
    }

    @Test
    public void testGetItem() throws Exception {
        cart.addItem("flower");
        cart.addItem("bag");

        Assert.assertFalse(cart.getItem(0).equals("flower"));
    }
}
