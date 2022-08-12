package ru.netology.sqr;

public class SQRService {
    public int colSqrInRange(int startRange, int endRange) {
        int colSqr = 0;
        for (int i = 10; i <= 99; i = i + 1) {
            if (Math.pow(i, 2) >= startRange & Math.pow(i, 2) <= endRange) {
                colSqr = colSqr + 1;
            }
        }
        return colSqr;
    }
}
