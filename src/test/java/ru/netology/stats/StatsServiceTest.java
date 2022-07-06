package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testSumSales() {
        StatsService service = new StatsService();
        int expected = 180;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcAAverageMonthlySales() {
        StatsService service = new StatsService();
        int expected = 15;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.calcAAverageMonthlySales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();
        int expected = 8;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        int expected = 9;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAmtBelowAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.amtBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAmtAboveAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.amtAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}