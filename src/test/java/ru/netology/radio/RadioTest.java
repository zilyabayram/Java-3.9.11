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
    public void shouldGetPossibleStation() {
        radio.getPossibleStation();
        System.out.println(radio.getPossibleStation());
    }

    @Test
    public void shouldSetPossibleStation() {

        radio.setPossibleStation(20);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(radio.getPossibleStation());
    }


    @Test
    public void shouldSetStationInLimit() {

        radio.setCurrentStation(19);

        int expected = 19;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationBelowLimit() {

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationInLimit20() {

        radio.setCurrentStation(20);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationAboveLimit() {

        radio.setCurrentStation(21);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println(radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationInLimit() {
        radio.setCurrentStation(19);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationInLimit20() {
        radio.setCurrentStation(20);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationBelowLimit() {
        radio.setCurrentStation(-1);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStationInLimit() {
        radio.setCurrentStation(19);

        radio.previousStation();

        int expected = 18;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStationInLimit20() {

        radio.setCurrentStation(20);

        radio.previousStation();

        int expected = 19;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStationIfStation0() {

        radio.setCurrentStation(0);

        radio.previousStation();

        int expected = 19;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStationIfStationBelowLimit() {

        radio.setCurrentStation(-1);

        radio.previousStation();

        int expected = 19;
        int actual = radio.getCurrentStation();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeInLimitIf100() {


        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentStation());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeInLimit() {


        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveLimit() {


        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolumeBelowLimit() {

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreasedVolumeInLimit() {
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreasedVolumeAboveLimit() {
        radio.setCurrentVolume(101);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreasedVolumeInLimit100() {

        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreasedVolumeInLimit() {

        radio.setCurrentVolume(99);

        radio.decreaseVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreasedVolumeInLimit100() {

        radio.setCurrentVolume(100);

        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreasedVolumeAboveLimit() {

        radio.setCurrentVolume(101);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreasedVolumeInLimitIf1() {

        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreasedVolumeInLimitIf0() {

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreasedVolumeBelowLimit() {

        radio.setCurrentVolume(-1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        System.out.println(radio.getCurrentVolume());

        Assertions.assertEquals(expected, actual);
    }

}
