import org.junit.Assert;
import org.junit.Test;
import ru.netology.CashbackHackService;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void amountLess1000() {
        int expected = 200;
        int actual = service.remain(800);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void amount1000() {
        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void amountLarge1000() {
        int expected = 500;
        int actual = service.remain(1500);

        Assert.assertEquals(expected, actual);
    }
}
