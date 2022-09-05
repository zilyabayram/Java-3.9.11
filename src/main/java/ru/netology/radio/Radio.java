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
        if (currentStation >= maxStation) {
            currentStation = currentStation + 1;
        }
    }

}
