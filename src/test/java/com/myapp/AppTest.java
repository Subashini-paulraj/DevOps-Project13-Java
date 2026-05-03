package com.myapp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(5, App.add(2, 3));
    }
}