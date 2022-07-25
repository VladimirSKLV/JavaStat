import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
//Сумма всех продаж проверка
    public void calSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Средняя сумма продаж в месяц
    public void calSalesAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.sumSalesAvg(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //Нахождение номера месяца, в котором был пик продаж
    public void needFindMaxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8; // 8 месяц последний с наибольшими продажами
        int actual = service.findMaxSalesNumMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Номер месяца, в котором был минимум продаж
    public void needFindMinSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMinSalesNumMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //Кол-во месяцев, в которых продажи были ниже среднего
    public void needFindCountMonthBelowAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthBelowAvg(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Кол-во месяцев, в которых продажи были выше среднего
    public void needFindCountMonthAboveAvg() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthAboveAvg(sales);
        Assertions.assertEquals(expected, actual);
    }
}

