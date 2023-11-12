import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.FreeLanserService;

public class FreeLanserServiceTest                            // Тестовый класс рассчета числа месяцев " в отпуске"

{
    @Test
    public void testCalculateGoodLife()                         // Тестовый метод рассчета числа месяцев " в отпуске"
    {
        FreeLanserService service = new FreeLanserService();    // Организация сервиса рассчитывающего
        // число месяцев " в отпуске"
        int actual = service.calculate(10_000, 3_000, 20_000);  // Входние данные для сервиса рассчета
        int expected = 3;                                       // Ожижаемое число месяцев "отпуска"

        Assertions.assertEquals(expected, actual);              // Сравнение ожидаемого и фактического результатов
    }


    @Test
    public void testCalculateBestLife()                       // Тестовый метод рассчета числа месяцев " в отпуске"
    {
        FreeLanserService service = new FreeLanserService();   // Организация сервиса рассчитывающего
                                                                // число месяцев " в отпуске"
        int actual = service.calculate(100_000, 60_000, 150_000);  // Входние данные для сервиса рассчета
        int expected = 2;                                       // Ожидаемое число месяцев "отпуска"

        Assertions.assertEquals(expected, actual);              // Сравнение ожидаемого и фактического результатов
    }
}