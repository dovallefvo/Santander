package com.dovalle.classes;

import com.dovalle.util.MyDate;
import com.dovalle.util.MyList;

import java.util.Arrays;

public class Initial {
    public static void main(String[] args) {
        System.out.println("******\nMy first Java program using Gradle\n******");
        System.out.println("******\nImplementing Interfaces and Enums:\n******" );
        var myCar = new OnixCar();
        System.out.println(myCar.showDetails());
        var mydate = new MyDate();
        System.out.println(mydate.showDetails());
        System.out.println(mydate.formatter());
        System.out.println(mydate.showDateJava8());
        var myList = new MyList();
        System.out.println(myList.compareListOrder());
    }
}
