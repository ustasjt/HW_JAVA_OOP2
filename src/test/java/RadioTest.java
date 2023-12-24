import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testNormalStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMinStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMinStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMinStation3() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMinStation4() {
        Radio radio = new Radio();
        radio.setCurrentStation(-15);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxStation3() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxStation4() {
        Radio radio = new Radio();
        radio.setCurrentStation(18);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testZeroStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNextStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNextStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNextStation3() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNextStation4() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNextStation5() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testPrevStation1() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testPrevStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prev();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testPrevStation3() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testPrevStation4() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testPrevStation5() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testNormalVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testNormalVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(36);
        int expected = 36;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMinVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMinVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMinVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testZeroVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testZeroVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(45);
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testIncreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testIncreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(65);
        radio.increaseVolume();
        int expected = 66;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testIncreaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testIncreaseVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testIncreaseVolume5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testReduceVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.reduceVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testReduceVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(75);
        radio.reduceVolume();
        int expected = 74;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testReduceVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.reduceVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testReduceVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.reduceVolume();
        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testReduceVolume5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testReduceVolume6() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
}

