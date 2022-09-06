package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(20);

    @Test
    public void shouldGetMaxStation() {
        radio.getMaxStation();
        System.out.println(radio.getMaxStation());
    }

    @Test
    public void shouldGetMinStation() {
        radio.getMinStation();
        System.out.println(radio.getMinStation());
    }

    @Test
    public void shouldGetMaxVolume() {
        radio.getMaxVolume();
        System.out.println(radio.getMaxVolume());
    }

    @Test
    public void shouldGetMinSVolume() {
        radio.getMinVolume();
        System.out.println(radio.getMinVolume());
    }


    @Test
    public void shouldSetStation() {

        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationIfMin() {

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());
    }

    @Test
    public void setNextStation() {
        radio.setCurrentStation(7);

        radio.nextStation();

        int expected = 8;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationIfStation9() {
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousStation() {
        radio.setCurrentStation(1);

        radio.previousStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousStationIf0() {

        radio.setCurrentStation(0);

        radio.previousStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousStationIfCurrentStationMoreThan0() {

        radio.setCurrentStation(5);

        radio.previousStation();

        int expected = 4;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {


        radio.setCurrentVolume(12);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetVolumeAbove() {

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setIncreasedVolume() {
        radio.setCurrentVolume(5);

        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreasedVolumeUp10() {
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreasedVolumeIf10() {

        radio.setCurrentVolume(9);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDecreasedVolume() {

        radio.setCurrentVolume(9);

        radio.decreaseVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDecreasedVolume0() {

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

}
