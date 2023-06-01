package org.example;

import java.util.ArrayList;

public class ArraySurfer<T> {
    private ArrayList<T> array;

    public ArraySurfer() {
        array = new ArrayList<>();
    }

    public void addElement(T element) {
        array.add(element);
    }

    public void removeElement(T element) {
        array.remove(element);
    }

    public void updateElement(int index, T newElement) {
        array.set(index, newElement);
    }
}




