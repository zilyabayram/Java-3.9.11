package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationIfMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());
    }

    @Test
    public void setNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.nextStation();

        int expected = 8;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationIfStation9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.previousStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousStationIfCurrentStationMoreThan0() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.previousStation();

        int expected = 4;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(12);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetVolumeAbove() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setIncreasedVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreasedVolume10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDecreasedVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.decreaseVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDecreasedVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

}
