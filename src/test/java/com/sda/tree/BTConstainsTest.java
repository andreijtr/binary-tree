package com.sda.tree;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BTConstainsTest {

    public static BinaryTree bt = new BinaryTree();

    @BeforeClass
    public static void addElements() {
        bt.addRecursive(10);
        bt.addRecursive(11);
        bt.addRecursive(5);
        bt.addRecursive(111);
        bt.addRecursive(2);
    }

    @Test
    public void containsTest() {
        boolean actual = bt.contains(2);

        Assert.assertTrue(actual);
    }

    @Test
    public void containsTestFalse() {
        Assert.assertFalse(bt.contains(12));
    }
}
