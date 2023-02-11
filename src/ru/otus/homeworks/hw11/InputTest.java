package ru.otus.homeworks.hw11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputTest {
    private boolean number1,number3,number4;
    private boolean number2;

    @Before
    public void setUp() throws Exception {
        number1 = new Input().checkInput(10);
        number2 = new Input().checkInput(0);
        number3 = new Input().checkInput(999999);
        number4 = new Input().checkInput(-999999);
    }

    @Test
    public void checkInput() {
        assertTrue(number1);
        assertFalse(number2);
        Assert.assertEquals(number3,true);
        Assert.assertEquals(number4,false);
    }
}