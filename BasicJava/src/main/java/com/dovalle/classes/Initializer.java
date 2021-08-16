package com.dovalle.classes;

import com.dovalle.interfaces.Vehicle;
import com.dovalle.net.MyUrl;
import com.dovalle.util.*;
import com.dovalle.database.base.*;
import com.dovalle.database.entity.*;

public class Initializer {
    public static void main(String[] args) {

        basicConcepts();

        formattingDates();

        manipulatingListSetQueue();

        processingThreadsAndHttp();

        callingStreamsAndLambdas();

        makingJDBCConnection();

        insertingWithHibernateJPA();
    }

    private static void insertingWithHibernateJPA() {
        var entityDB = new EntityDatabase();
        var personList = new Person().sampleListPerson();
        for (Person p : personList) {
            if (p.getStateProvinceOrigin() != null){
                entityDB.add(p.getStateProvinceOrigin());
            }
            entityDB.add(p);
        }
        entityDB.closeResources();
    }

    private static void makingJDBCConnection() {
        //JDBC implementation
        var mysqlCon = new MysqlDbConnection();
        mysqlCon.testConnection();
    }

    private static void callingStreamsAndLambdas() {
        var myStream = new MyStream();
        System.out.println(myStream.showStreamDetails());

        MyLambda.callSimpleLambda();
        MyLambda.callConsumerLambda();
        MyLambda.callFunctionLambda();
        MyLambda.callPredicateLambda();
        MyLambda.callSupplierLambda();

        var myParalelStream = new MyParalelStream();
        myParalelStream.showTimesOfProcessing();
    }

    private static void processingThreadsAndHttp() {
        var myThread = new MyThread();
        myThread.showSimpleThreads();

        var myUrl = new MyUrl();
        myUrl.showContent();
    }

    private static void manipulatingListSetQueue() {
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
    }

    private static void formattingDates() {
        var mydate = new MyDate();
        System.out.println(mydate.showDetails());
        System.out.println(mydate.formatter());
        System.out.println(mydate.showDateJava8());
    }

    private static void basicConcepts() {
        System.out.println("******\nMy first Java program using Gradle\n******");

        System.out.println("******\nImplementing Interfaces, Enums and Generics:\n******" );
        var myCar = new OnixCar();
        var myMotocycle = new TitanMotocycle();
        var myRents = new RentVehicle<Vehicle>();
        System.out.println(myCar);
        System.out.println(myMotocycle);
        myRents.rent(myCar);
        myRents.rent(myMotocycle);
        System.out.println(myRents.showRents());
    }


}
