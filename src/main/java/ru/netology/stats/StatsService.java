package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {
        return sum(sales) / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int amtBelowAverage(long[] sales) {
        long avg = average(sales); // в переменную avg положим результат вызова метода average
        int amt = 0;
        for (long sale : sales) {
            if (sale < avg) {
                amt++;
            }
        }
        return amt;
    }

    public int amtAboveAverage(long[] sales) {
        long avg = average(sales);
        int amt = 0;
        for (long sale : sales) {
            if (sale > avg) {
                amt++;
            }
        }
        return amt;
    }
}