package org.example;

import org.example.Ecommerce.command.EcommercMain;
import org.example.homeAutomationSystem.AutomationMain;
import org.example.observer.StcokMarket;

public class Main {
    public static void main(String[] args) {
        //adapter ex charger
//       AdapterMain.chargeWithC();
//
//        // adapter ex students
//        System.out.println(StudentClient.getStudents());
//
//        // Strategy pattern sorting example based on run time object, we can sort our array
//       SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
//        int[] array1 = {5, 2, 9, 1, 5};
//       sortingContext.performSort(array1);
//
//        sortingContext.setSortingStrategy(new QuickSortStrategy());
//        int[] array2 = {0, 10, 9, 1, 7};
//        sortingContext.performSort(array1);
//
//        //traffic light example for state pattern
//        StateMain.getStates();
//
//        //Memento text editor example
//        MementoMain.performMementoOperations();
//
//        //Decorator Pattern With Coffee Example
//        DecoratorMain.orderCoffee();


       // MainClass.homeAppliance();
        //AutomationMain.automation();

        //for ecommerce
       // EcommercMain.shopping();

        //observer pattern
        StcokMarket.observer();
    }

}