import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.CashbackHackService;

import java.security.PublicKey;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void amountLess1000() {
        int actual = service.remain(800);
        int expected = 200;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void amount1000() {
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void amountLarge1000() {
        int actual = service.remain(1500);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }
}
