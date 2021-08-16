package com.dovalle.classes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Using the Generics concepts from Java 8
public class RentVehicle<T> {
    private Set<String> rentedVehicles;

    public RentVehicle() {
        this.rentedVehicles = new LinkedHashSet<>();
        this.rentedVehicles.add("\nRented Vehicle: ");
    }

    public void rent(T vhc){
        this.rentedVehicles.add(String.format("\n %s\n", vhc.getClass().getName()));
    }

    public String showRents(){
        StringBuilder rents = new StringBuilder();
        rents.append(this.rentedVehicles.toString());
        return rents.toString();
    }
}
