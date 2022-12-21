package ru.netology.sqr;

public class SQRService {

    public int SqrCalc(int LimitMin, int LimitMax) {
        int result = 0;
        for (int x = 10; x <= 99; x++) {
            int y = x * x;
            if (y >= LimitMin) {
                if (y <= LimitMax) {
                    result++;

                }
            }
        }
        return result;
    }
}
