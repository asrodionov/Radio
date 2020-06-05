package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Radio {

    private int currentRadioStation;
    private int currentSoundVolume;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;


    public void setRadioStationInConsole(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = 0;
            return;
        }
        if (currentRadioStation < minRadioStation) {
            this.currentRadioStation = 0;
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

