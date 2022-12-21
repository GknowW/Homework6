package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    public void calcTestCoincidences() {
        SQRService service = new SQRService();

        int actual = service.SqrCalc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestBelowTheLowerLimit() {
        SQRService service = new SQRService();

        int actual = service.SqrCalc(0, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestTheLowerLimit() {
        SQRService service = new SQRService();

        int actual = service.SqrCalc(0, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestUpperLimit() {
        SQRService service = new SQRService();

        int actual = service.SqrCalc(9800, 9801);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTestAboveTheUpperLimit() {
        SQRService service = new SQRService();

        int actual = service.SqrCalc(9802, 10000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}