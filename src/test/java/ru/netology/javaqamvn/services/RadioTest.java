package ru.netology.javaqamvn.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void shouldSetCurrentStationUnderLimit() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationOverLimit() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);

        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationOverMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationUnderMin() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.previousStation();

        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);

        rad.nextStation();

        int expected = 6;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(6);

        rad.previousStation();

        int expected = 5;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeUnderLimit() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-100);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeOverLimit() {
        Radio rad = new Radio();
        rad.setCurrentVolume(50);

        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckHigherVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckLowerVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(2);

        rad.increaseVolume();

        int expected = 3;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(6);

        rad.decreaseVolume();

        int expected = 5;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}