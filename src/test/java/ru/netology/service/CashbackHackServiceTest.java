package ru.netology.service;

import org.testng.Assert;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void test2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void test1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

}