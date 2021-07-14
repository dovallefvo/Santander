package com.dovalle.classes;

import java.time.LocalDate;
import java.util.*;


public class Person {
    private String name = null;
    private LocalDate birthDay = null;

    public Person(){
        this.name = "";
        this.birthDay = LocalDate.now();
    }

    public Person(String namePerson, LocalDate birthDay){
        this.name = namePerson;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public List<Person> sampleListPerson(){
        List<Person> lstPerson = new ArrayList<>();
        lstPerson.add(new Person("Mary", LocalDate.now().minusYears(45)));
        lstPerson.add(new Person("John", LocalDate.now().minusYears(65).minusWeeks(3)));
        lstPerson.add(new Person("Iza", LocalDate.of(1997,3,4)));
        lstPerson.add(new Person("Lipe", LocalDate.of(1987,3,3)));
        return lstPerson;
    }


}
