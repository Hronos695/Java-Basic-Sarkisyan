package ru.otus.homeworks.hw11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModTest {
    private Mod number1,number2,number3;

    @Before
    public void setUp() throws Exception {
        number1 = new Mod();
        number2 = new Mod();
        number3 = new Mod();
    }

    @Test
    public void getRuble() {

        Assert.assertEquals(number1.GetRuble(10),"рублей");
        Assert.assertEquals(number2.GetRuble(31),"рубль");
        Assert.assertEquals(number3.GetRuble(1134),"рубля");
    }

    @Test
    public void getDollar() {
        Assert.assertEquals(number1.GetDollar(10),"долларов");
        Assert.assertEquals(number2.GetDollar(31),"доллар");
        Assert.assertEquals(number3.GetDollar(1134),"доллара");
    }
}