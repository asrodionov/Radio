package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldAMaxRadioStation() {
        Radio radio = new Radio(15);
        assertEquals(15, radio.getMaxRadioStation());
    }

    @Test
    void shouldIncreaseCurrentRadioStation() {
        Radio radio = new Radio(14,50,15);
        radio.increaseCurrentRadioStation();
        assertEquals(15, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseCurrentRadioStation2() {
        Radio radio = new Radio(15,50,15);
        radio.increaseCurrentRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldDecreaseCurrentRadioStation() {
        Radio radio = new Radio(1,50,15);
        radio.decreaseCurrentRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldDecreaseCurrentRadioStation2() {
        Radio radio = new Radio(0,50,15);
        radio.decreaseCurrentRadioStation();
        assertEquals(15, radio.getCurrentRadioStation());
    }

    @Test
    void shouldDSetCurrentRadioStation() {
        Radio radio = new Radio(5,50,15);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    void shouldDSetRadioStationInConsole() {
        Radio radio = new Radio(10,50,15);
        radio.setRadioStationInConsole();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    void shouldDSetCurrentRadioStationInConsole2() {
        Radio radio = new Radio(55,50,15);
        radio.setRadioStationInConsole();
        assertEquals(15, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseCurrentSoundVolume() {
        Radio radio = new Radio(10,99,15);
        radio.increaseCurrentSoundVolume();
        assertEquals(100, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldIncreaseCurrentSoundVolume2() {
        Radio radio = new Radio(10,100,15);
        radio.increaseCurrentSoundVolume();
        assertEquals(100, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldDecreaseCurrentSoundVolume() {
        Radio radio = new Radio(10,1,15);
        radio.decreaseCurrentSoundVolume();
        assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldDecreaseCurrentSoundVolume2() {
        Radio radio = new Radio(10,0,15);
        radio.decreaseCurrentSoundVolume();
        assertEquals(0, radio.getCurrentSoundVolume());
    }
}
