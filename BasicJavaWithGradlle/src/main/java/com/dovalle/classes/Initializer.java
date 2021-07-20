package com.dovalle.classes;

import com.dovalle.interfaces.Vehicle;
import com.dovalle.util.*;

import java.util.Arrays;

public class Initializer {
    public static void main(String[] args) {
        System.out.println("******\nMy first Java program using Gradle\n******");

        System.out.println("******\nImplementing Interfaces, Enums and Generics:\n******" );
        var myCar = new OnixCar();
        var myMotocycle = new TitanMotocycle();
        var myRents = new RentVehicle<Vehicle>();
        System.out.println(myCar.showDetails());
        System.out.println(myMotocycle.showDetails());
        myRents.rent(myCar);
        myRents.rent(myMotocycle);
        System.out.println(myRents.showRents());

        var mydate = new MyDate();
        System.out.println(mydate.showDetails());
        System.out.println(mydate.formatter());
        System.out.println(mydate.showDateJava8());

        var myList = new MyList();
        System.out.println(myList.compareListOrder());

        var myQueue = new MyQueue();
        System.out.println(myQueue.showPersonsAtBank());

        var mySet = new MySet();
        System.out.println(mySet.showNotes());

        var myMap = new MyMap();
        System.out.println(myMap.showHashMapPersons());
        System.out.println(myMap.showTreemapCities());

        var myComparator = new MyComparator();
        System.out.println(myComparator.showComparatorDetails());

        var myStream = new MyStream();
        System.out.println(myStream.showStreamDetails());
    }
}