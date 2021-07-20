package com.dovalle.util;

import com.dovalle.classes.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyStream {
    private Person myPerson;
    private List<Person> myPersonsList;

    public MyStream(){
        myPerson = new Person();
        myPersonsList = myPerson.sampleListPerson();
    }

    public String showStreamDetails (){
        StringBuilder details = new StringBuilder();
        details.append(String.format("\n\nStreams implementing \nCounting elements: %s", this.myPersonsList.stream().count()));
        details.append("\nMaximum length Name: " + this.myPersonsList.stream().max(Comparator.comparingInt(Person::getIdNumber)).get().getIdNumber());
        details.append("\nMinimum length Name: " + this.myPersonsList.stream().min(Comparator.comparingInt(Person::getIdNumber)).get().getIdNumber());
        details.append("\nReturn persons that contains I in their names: " + this.myPersonsList.stream().filter((person) -> person.getName().toLowerCase().contains("i")).collect(Collectors.toList()));
        details.append("\nMap persons and quantity of letters that contains in their names: " + this.myPersonsList.stream().map(person -> person.getName().concat(" - ").concat(String.valueOf(person.getName().length()))).collect(Collectors.toList()));

        return details.toString();
    }
}
