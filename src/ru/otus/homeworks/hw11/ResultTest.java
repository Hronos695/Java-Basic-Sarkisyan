package ru.otus.homeworks.hw11;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResultTest {

    @Test
    public void getResult() {
        String result1 = new Result().getResult(true,10);
        String result2 = new Result().getResult(true,10001);
        String result3 = new Result().getResult(false,-12);

        assertEquals(result1, "10 рублей");
        assertEquals(result2, "10001 рубль");
        assertEquals(result3, "-12");
    }
}