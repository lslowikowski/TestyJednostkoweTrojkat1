package com.company;

import java.util.Scanner;

public class TestyJednostkoweTrojkat1 {
    static float podstawa;
    static float wysokosc;
    static float pole;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość podstawy trójkąta: ");
        podstawa = scanner.nextFloat();
        System.out.print("Podaj wysokość trójkąta: ");
        wysokosc = scanner.nextFloat();
        Trojkat trojkat = new Trojkat(podstawa, wysokosc);
        pole = trojkat.obliczPole();
        System.out.print("Trójkąt o podstawie: " + podstawa + " i wysokości: " + wysokosc);
        System.out.println(" ma pole: " + pole);
    }
}
