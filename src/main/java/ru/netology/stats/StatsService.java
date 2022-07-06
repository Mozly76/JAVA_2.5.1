package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        return sum;
    }

    public int calcAAverageMonthlySales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        return sum / sales.length;

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
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int amtBelowAverage(long[] sales) {
        int sum = 0;
        int month = 0;
        int amt = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        int midMonth = (sum / sales.length);
        for (long sale : sales) {
            if (sale < midMonth) {
                amt++;
            }
            month = month + 1;
        }
        return amt;
    }

    public int amtAboveAverage(long[] sales) {
        int sum = 0;
        int month = 0;
        int amt = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        int midMonth = (sum / sales.length);
        for (long sale : sales) {
            if (sale > midMonth) {
                amt++;
            }
            month = month + 1;
        }
        return amt;
    }
}