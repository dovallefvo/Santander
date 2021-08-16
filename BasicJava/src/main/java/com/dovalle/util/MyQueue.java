package com.dovalle.util;

import com.dovalle.classes.Person;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    private Queue<Person> bankQueue;
    private Person myPerson;

    public MyQueue(){
        this.bankQueue = new LinkedList<>();
        this.myPerson = new Person();
        this.bankQueue.addAll(myPerson.sampleListPerson());
    }

    public Queue<Person> getBankQueue() {
        return bankQueue;
    }

    public String showPersonsAtBank(){
        StringBuilder persons = new StringBuilder();
        persons.append("\nQueue at the Bank: \n");
        String lstClients = "";
        Iterator<Person> itrPersons = this.getBankQueue().iterator();
        while (itrPersons.hasNext()) {
            lstClients = lstClients.concat(itrPersons.next().getName() + " ");
        }
        persons.append(lstClients);

        persons.append("\nFirst person to be attend for BANK: ".concat(this.getBankQueue().peek().getName()));
        //pool - call the next element, then the queue is updated
        //element - call the first element on queue, but can return an error if the queue is Empty

        return persons.toString();
    }

}
