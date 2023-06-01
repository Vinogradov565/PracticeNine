package org.example;

public class PracticeNine {
    public static void main(String[] args) {
        // Задание 1: Использование класса ArraySurfer
        ArraySurfer<Integer> arraySurfer = new ArraySurfer<>();
        arraySurfer.addElement(10);
        arraySurfer.addElement(20);
        arraySurfer.addElement(30);

        System.out.println("ArraySurfer elements: " + arraySurfer);

        arraySurfer.removeElement(20);
        arraySurfer.updateElement(0, 50);

        System.out.println("ArraySurfer elements after removal and update: " + arraySurfer);

        // Задание 2: Использование классов Tour, AirTicket и Hotel
        Tour tour = new Tour();
        tour.printTourInfo();
    }
}


