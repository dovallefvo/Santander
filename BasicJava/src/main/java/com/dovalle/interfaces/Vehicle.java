package com.dovalle.interfaces;

import com.dovalle.enums.BrandCar;

public interface Vehicle {
    int wheels = 4;
    String model = "";
    default Integer qtdWheels(){
        return wheels;
    }
    default String getModel(){
        return model;
    }

    default String brand(){
        return "";
    }

    default String showDetails(){
        String details = "****Car details:\nBrand name: " + this.brand() + "\nModel name: " + this.getModel() + "\nQuantity of Wheels: " + this.qtdWheels();
        return details;
    }
}
