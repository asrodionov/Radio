package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldIncreaseCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.increaseCurrentRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseCurrentRadioStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.increaseCurrentRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldDecreaseCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.decreaseCurrentRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldDecreaseCurrentRadioStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.decreaseCurrentRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldIncreaseCurrentSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(9);
        radio.increaseCurrentSoundVolume();
        assertEquals(10, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldIncreaseCurrentSoundVolume2() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);
        radio.increaseCurrentSoundVolume();
        assertEquals(10, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldDecreaseCurrentSoundVolume() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(1);
        radio.decreaseCurrentSoundVolume();
        assertEquals(0, radio.getCurrentSoundVolume());
    }

    @Test
    void shouldDecreaseCurrentSoundVolume2() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.decreaseCurrentSoundVolume();
        assertEquals(0, radio.getCurrentSoundVolume());
    }
}
