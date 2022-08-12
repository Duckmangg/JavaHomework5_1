import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {

        int startRange = 300;
        int endRange = 400;
        SQRService service = new SQRService();
        int colSqr = service.colSqrInRange(startRange, endRange);
        System.out.println(colSqr);
    }
}
