package com.dovalle.classes;

import java.time.LocalDate;
import java.util.*;


public class Person implements Comparable<Person>{
    private String name;
    private LocalDate birthDay;
    private Integer idNumber;
    private List<Person> lstPerson;
    private Optional<String> phoneNumber;

    public Person(){
        this.name = "";
        this.birthDay = LocalDate.now();
        this.idNumber = 0;
        this.lstPerson = new ArrayList<>();
        this.phoneNumber = Optional.ofNullable(null);
    }

    public Person(String namePerson, LocalDate birthDay){
        this.name = namePerson;
        this.birthDay = birthDay;
        this.lstPerson = new ArrayList<>();
        this.phoneNumber = Optional.ofNullable(null);
    }

    public Person(String namePerson, LocalDate birthDay, Integer idNumber){
        this.name = namePerson;
        this.birthDay = birthDay;
        this.idNumber = idNumber;
        this.lstPerson = new ArrayList<>();
        this.phoneNumber = Optional.ofNullable(null);
    }

    public Person(String namePerson, LocalDate birthDay, Integer idNumber, String phoneNumber){
        this.name = namePerson;
        this.birthDay = birthDay;
        this.idNumber = idNumber;
        this.lstPerson = new ArrayList<>();
        this.phoneNumber = Optional.ofNullable(phoneNumber);
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

    public Integer getIdNumber() {
        return idNumber;
    }

    public List<Person> sampleListPerson(){
        fillPersonList();
        return this.lstPerson;
    }

    private void fillPersonList() {
        if (this.lstPerson !=null && this.lstPerson.isEmpty()){
            this.lstPerson.add(new Person("Mary", LocalDate.now().minusYears(45), 123));
            this.lstPerson.add(new Person("John", LocalDate.now().minusYears(65).minusWeeks(3),951));
            this.lstPerson.add(new Person("Iza", LocalDate.of(1997,3,4),753));
            this.lstPerson.add(new Person("Lipe", LocalDate.of(1987,3,3),852, "+55 31 98765-4321"));
        }
    }

    public String showPersonDetails(){
        StringBuilder details = new StringBuilder();
        details.append(String.format("\nName: %s, Birthday: %s, Social ID number: %s, Phone Number: %s", this.name, this.birthDay, this.idNumber, this.phoneNumber.orElse("not informed")));
        return details.toString();
    }

    public String showAllPersonsDetails(){
        StringBuilder details = new StringBuilder();
        fillPersonList();
        for (Person p: this.lstPerson) {
            details.append(p.showPersonDetails());
        }
        return details.toString();
    }

    @Override
    public int compareTo(Person p) {
        //implementing Comparable interface is possbile to sort the object as my needs.
        return this.birthDay.getYear() - p.getBirthDay().getYear();
    }

    @Override
    public String toString() {
        return this.showPersonDetails();
    }
}
