package org.example.strategy;

public class BubbleSortStrategy implements  SortingStrategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting using Bubble Sort");
    }
}
