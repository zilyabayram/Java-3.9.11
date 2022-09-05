package ru.netology.radio;

public class Radio {

    public int currentStation;
    public int maxStation = 9;
    public int minStation = 0;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation (int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;

    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        }
        if (currentStation == maxStation) {
            currentStation = minStation;
        }
    }

    public void previousStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        }
        if (currentStation == minStation) {
            currentStation = maxStation;
        }
    }

    public int currentVolume;
    public int maxVolume = 10;
    public int minVolume = 0;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == minVolume) {
            currentVolume = minVolume;
        }
    }

}
