package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertEquals;

class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemainIfUnderBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(expected, actual, "wrong remain");
    }

    @Test
    public void shouldCalculateRemainIfOverBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(expected, actual, "wrong remain");
    }

    @Test
    public void shouldCalculateRemainIfNotAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual, "wrong remain");
    }

    @Test
    public void shouldCalculateRemainIfMultiplyAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldCalculateRemainIfMultiplyAmount2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

}