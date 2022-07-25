package ru.netology.stats;

public class StatsService {
    //Сумма всех продаж
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // Средняя сумма продаж в месяц
    public int sumSalesAvg(int[] sales) {
        // вернул предыдущий месяц и разделил на длину массива
        return sumSales(sales) / sales.length;
    }

    // Нахождение номера месяца, в котором был пик продаж
    public int findMaxSalesNumMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            /* когда подставляешь знак '>' ,
            то возвращается только первый месяц с максимальной продажей,
            поэтому не подойдет,
            если в массиве есть повторяющиеся значения **/

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    // Номер месяца, в котором был минимум продаж
    public int findMinSalesNumMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int countMonthBelowAvg (int[] sales) {
        int countMonth = 0;
        int avg = sumSalesAvg(sales);
        for (int sale : sales) {
            if (sale < avg) {
                countMonth++;
            }
        }
        return countMonth;
    }

    // Кол-во месяцев, в которых продажи были выше среднего
    public int countMonthAboveAvg(int[] sales) {
        int countMonth = 0;
        int avg = sumSalesAvg(sales);
        for (int sale : sales) {
            if (sale > avg) {
                countMonth++;
            }
        }
        return countMonth;
    }

}
