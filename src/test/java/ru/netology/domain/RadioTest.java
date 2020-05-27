package ru.netology.domain;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;


@TestMethodOrder(OrderAnnotation.class)
class RadioTest {

    static Radio radio = new Radio();

    @Test
    @Order(1)
    void shouldIncreaseCurrentRadioStation() {
        radio.setCurrentRadioStation(8);
        radio.increaseCurrentRadioStation(radio.getCurrentRadioStation());
        assertEquals(9, radio.getCurrentRadioStation());
    }
    @Test
    @Order(2)
    void shouldIncreaseCurrentRadioStation2() {
        radio.increaseCurrentRadioStation(radio.getCurrentRadioStation());
        assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    @Order(3)
    void shouldIncreaseCurrentRadioStation3() {
        radio.increaseCurrentRadioStation(radio.getCurrentRadioStation());
        assertEquals(1, radio.getCurrentRadioStation());
    }
    @Test
    @Order(4)
    void shouldDecreaseCurrentRadioStation() {
        radio.setCurrentRadioStation(1);
        radio.decreaseCurrentRadioStation(radio.getCurrentRadioStation());
        assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    @Order(5)
    void shouldDecreaseCurrentRadioStation2() {
        radio.decreaseCurrentRadioStation(radio.getCurrentRadioStation());
        assertEquals(9, radio.getCurrentRadioStation());
    }
    @Test
    @Order(6)
    void shouldDecreaseCurrentRadioStation3() {
        radio.decreaseCurrentRadioStation(radio.getCurrentRadioStation());
        assertEquals(8, radio.getCurrentRadioStation());
    }
    @Test
    @Order(7)
    void shouldincreaseCurrentSoundVolume() {
        radio.setCurrentSoundVolume(9);
        radio.increaseCurrentSoundVolume(radio.getCurrentSoundVolume());
        assertEquals(10, radio.getCurrentSoundVolume());
    }
    @Test
    @Order(8)
    void shouldincreaseCurrentSoundVolume2() {
        radio.increaseCurrentSoundVolume(radio.getCurrentSoundVolume());
        assertEquals(10, radio.getCurrentSoundVolume());
    }
    @Test
    @Order(9)
    void shoulddecreaseCurrentSoundVolume() {
        radio.setCurrentSoundVolume(1);
        radio.decreaseCurrentSoundVolume(radio.getCurrentSoundVolume());
        assertEquals(0, radio.getCurrentSoundVolume());
    }
    @Test
    @Order(10)
    void shoulddecreaseCurrentSoundVolume2() {
        radio.decreaseCurrentSoundVolume(radio.getCurrentSoundVolume());
        assertEquals(0, radio.getCurrentSoundVolume());
    }
}
