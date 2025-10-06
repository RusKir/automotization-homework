package ru.netology.service;

import org.junit.Assert;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void test2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void test1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

}