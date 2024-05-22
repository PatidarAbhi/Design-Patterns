package org.example;

import org.example.adapter.AdapterMain;
import org.example.adapter.student.StudentClient;
import org.example.decorator.DecoratorMain;
import org.example.memento.MementoMain;
import org.example.state.StateMain;
import org.example.strategy.BubbleSortStrategy;
import org.example.strategy.QuickSortStrategy;
import org.example.strategy.SortingContext;

public class Main {
    public static void main(String[] args) {
        //adapter ex charger
       AdapterMain.chargeWithC();

        // adapter ex students
        System.out.println(StudentClient.getStudents());

        // Strategy pattern sorting example based on run time object, we can sort our array
       SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        int[] array1 = {5, 2, 9, 1, 5};
       sortingContext.performSort(array1);

        sortingContext.setSortingStrategy(new QuickSortStrategy());
        int[] array2 = {0, 10, 9, 1, 7};
        sortingContext.performSort(array1);

        //traffic light example for state pattern
        StateMain.getStates();

        //Memento text editor example
        MementoMain.performMementoOperations();

        //Decorator Pattern With Coffee Example
        DecoratorMain.orderCoffee();
    }

}