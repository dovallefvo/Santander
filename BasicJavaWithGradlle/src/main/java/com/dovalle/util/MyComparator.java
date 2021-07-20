package com.dovalle.util;

import com.dovalle.classes.Person;
import com.sun.management.GarbageCollectionNotificationInfo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator {
    public String showComparatorDetails(){
        StringBuilder details = new StringBuilder();
        Person myPerson = new Person();
        List<Person> myPersonsList = myPerson.sampleListPerson();
        details.append("\n\nComparators:");

        details.append("\nUsing the insert order in the Person: ");
        details.append(myPerson.showAllPersonsDetails());

        details.append("\nUsing the comparator implementing in the Person: ");
        Collections.sort(myPersonsList);
        details.append(myPerson.showAllPersonsDetails());

        details.append("\nLambda expression for simples reverse comparison");
        myPersonsList.sort((first, second) -> second.getBirthDay().getYear() - first.getBirthDay().getYear());
        details.append(myPerson.showAllPersonsDetails());

        details.append("\nUsing the static comparing into Comparator interface, order by ID NUMBER");
        myPersonsList.sort(Comparator.comparingInt(Person::getIdNumber));
        details.append(myPerson.showAllPersonsDetails());

        details.append("\nUsing the static comparing into Comparator interface, REVERSED order by ID NUMBER");
        myPersonsList.sort(Comparator.comparingInt(Person::getIdNumber).reversed());
        details.append(myPerson.showAllPersonsDetails());

        return details.toString();
    }

}
