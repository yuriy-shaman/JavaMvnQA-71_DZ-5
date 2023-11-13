import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.FreeLanserService;

public class FreeLanserServiceTest {
    @Test
    public void testCalculateGoodLife() {
        FreeLanserService service = new FreeLanserService();
        // число месяцев " в отпуске"
        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateBestLife() {
        FreeLanserService service = new FreeLanserService();
        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}