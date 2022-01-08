package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TrojkatTest {

    @Test
    void podstawaNieMozeBycUjemna() {
        Trojkat trojkat = new Trojkat(4, 10);
        trojkat.setPodstawa(-10);
        Assertions.assertEquals(10, trojkat.getPodstawa());
    }

    @Test
    void wysokoscNieMozeBycUjemna() {
        Trojkat trojkat = new Trojkat(8, 5);
        trojkat.setWysokosc(-5);
        Assertions.assertEquals(5, trojkat.getWysokosc());
    }

    @Test
    void wartosciWKonstruktorzeNieMogaBycUjemne() {
        Trojkat trojkat = new Trojkat(-6, -12);
        Assertions.assertEquals(6, trojkat.getPodstawa());
        Assertions.assertEquals(12, trojkat.getWysokosc());
    }

    @Test
    void poprawneObliczeniePola() {
        Trojkat trojkat = new Trojkat(-8, -6);
        Assertions.assertEquals(24, trojkat.obliczPole());
    }
}