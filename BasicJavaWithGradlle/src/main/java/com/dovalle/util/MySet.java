package com.dovalle.util;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MySet {
    Set<Double> hstNotes;
    Set<Double> lksNotes;

    public MySet() {
        this.hstNotes = new HashSet<>();
        this.lksNotes = new LinkedHashSet<>();

        addNotesIntoSet(this.hstNotes);
        addNotesIntoSet(this.lksNotes);
    }
    private void addNotesIntoSet(Set<Double> setNotes){
        setNotes.add(5.7);
        setNotes.add(7.2);
        setNotes.add(8.1);
        setNotes.add(9.6);
        setNotes.add(3.5);
    }

    public String showNotes(){
        StringBuilder notes = new StringBuilder();
        notes.append(String.format("\nNotes in HashSet, which doesn't keep the insertion order, but it has MORE performance:\n%s", this.hstNotes));
        notes.append(String.format("\nNotes in LinkedHashSet, which keeps the insertion order, but it has LESS performance:\n%s", this.lksNotes));
        return notes.toString();
    }
}
