import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    public void test(int startRange, int endRange, int expectedColSQR) {
        SQRService service = new SQRService();
        int colSQR = service.colSqrInRange(startRange, endRange);
        Assertions.assertEquals(expectedColSQR, colSQR);
    }
}
