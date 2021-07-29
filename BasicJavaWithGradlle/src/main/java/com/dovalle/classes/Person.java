package com.dovalle.classes;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

@Entity
public class Person implements Comparable<Person>{
    @Id
    private Integer idNumber;
    @Column
    private String name;
    @Column
    private LocalDate birthDay;
    @Column
    private Optional<String> phoneNumber;

    @ManyToOne (fetch = FetchType.EAGER)
    private StateProvince stateProvinceOrigin;

    private List<Person> lstPerson;

    public Person(){
        this.name = "";
        this.birthDay = LocalDate.now();
        this.idNumber = 0;
        this.lstPerson = new ArrayList<>();
        this.phoneNumber = Optional.ofNullable(null);
        this.stateProvinceOrigin = null;
    }

    public Person(String namePerson, LocalDate birthDay){
        this.name = namePerson;
        this.birthDay = birthDay;
        this.lstPerson = new ArrayList<>();
        this.phoneNumber = Optional.ofNullable(null);
        this.stateProvinceOrigin = null;
    }

    public Person(String namePerson, LocalDate birthDay, Integer idNumber){
        this.name = namePerson;
        this.birthDay = birthDay;
        this.idNumber = idNumber;
        this.lstPerson = new ArrayList<>();
        this.phoneNumber = Optional.ofNullable(null);
        this.stateProvinceOrigin = null;
    }

    public Person(String namePerson, LocalDate birthDay, Integer idNumber, String phoneNumber){
        this.name = namePerson;
        this.birthDay = birthDay;
        this.idNumber = idNumber;
        this.lstPerson = new ArrayList<>();
        this.phoneNumber = Optional.ofNullable(phoneNumber);
        this.stateProvinceOrigin = null;
    }

    public Person(String namePerson, LocalDate birthDay, Integer idNumber, String phoneNumber, StateProvince stateProvinceBirth){
        this.name = namePerson;
        this.birthDay = birthDay;
        this.idNumber = idNumber;
        this.lstPerson = new ArrayList<>();
        this.phoneNumber = Optional.ofNullable(phoneNumber);
        this.stateProvinceOrigin = stateProvinceBirth;
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

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public Optional<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Optional<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public StateProvince getStateProvinceOrigin() {
        return stateProvinceOrigin;
    }

    public void setStateProvinceOrigin(StateProvince stateProvinceOrigin) {
        this.stateProvinceOrigin = stateProvinceOrigin;
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
            this.lstPerson.add(new Person("Lipe", LocalDate.of(1987,3,3),852, "+55 31 98765-4321", new StateProvince(1, "Minas Gerais", "MG")));
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

    @Override
    public int hashCode() {
        //use hash method to especify the attributes
        return Objects.hash(this.name, this.birthDay, this.phoneNumber);
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj !=null && obj instanceof Person){
            result = this.hashCode() == obj.hashCode();
        }
        return result;
    }
}
