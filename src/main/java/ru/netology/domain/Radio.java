package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int currentSoundVolume;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int maxSoundVolume = 10;
    private int minSoundVolume = 0;

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

    public void increaseCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation >= maxRadioStation) {
            setCurrentRadioStation(minRadioStation);
            return;
        }
        this.currentRadioStation = currentRadioStation + 1;
        setCurrentRadioStation(this.currentRadioStation);
    }

    public void decreaseCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation <= minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
            return;
        }
        this.currentRadioStation = currentRadioStation - 1;
        setCurrentRadioStation(this.currentRadioStation);
    }

    public void increaseCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume >= maxSoundVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume + 1;
        setCurrentSoundVolume(this.currentSoundVolume);
    }

    public void decreaseCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume <= minSoundVolume) {
            return;
        }
        this.currentSoundVolume = currentSoundVolume - 1;
        setCurrentSoundVolume(this.currentSoundVolume);
    }


}

