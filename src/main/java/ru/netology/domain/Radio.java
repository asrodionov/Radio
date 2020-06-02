package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int currentSoundVolume;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }

    public Radio(int currentRadioStation, int currentSoundVolume, int maxRadioStation, int minRadioStation, int maxSoundVolume, int minSoundVolume) {
        this.currentRadioStation = currentRadioStation;
        this.currentSoundVolume = currentSoundVolume;
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
        this.maxSoundVolume = maxSoundVolume;
        this.minSoundVolume = minSoundVolume;
    }

    public Radio() {
    }

    public void setRadioStationInConsole(){
        if (currentRadioStation > maxRadioStation){
            this.currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void increaseCurrentRadioStation() {
        if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = minRadioStation;
            return;
        }
        currentRadioStation++;
    }

    public void decreaseCurrentRadioStation() {
        if (currentRadioStation <= minRadioStation) {
            currentRadioStation = maxRadioStation;
            return;
        }
        currentRadioStation--;
    }

    public void increaseCurrentSoundVolume() {
        if (currentSoundVolume >= maxSoundVolume) {
            return;
        }
        currentSoundVolume++;
    }

    public void decreaseCurrentSoundVolume() {
        if (currentSoundVolume <= minSoundVolume) {
            return;
        }
        currentSoundVolume--;
    }
}

